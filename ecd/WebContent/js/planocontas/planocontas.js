let form = document.querySelector("form");

/*==================================================================================================*/
/*==================================================================================================*/
/*FIELDS FORM */

let selCod_cta_ref = document.querySelector("select[name=cod_cta_ref]");
let selCod_agl = document.querySelector("select[name=cod_agl]");
/*==================================================================================================*/
/*==================================================================================================*/
const COLUMN_COD_CTA = 1;
let contaJson;
let empresaJson;
let rowSelected = null;
let txtAno = document.querySelector("#ano");
let selCompanies = document.querySelector("#companies");
let btnLocalizar = document.querySelector("#localizar");
let btnEditar = document.querySelector("#editar");
let btnSave = document.querySelector(".save");
let codigoSelecionado;

let btnIncluirRef = document.querySelector(".btnIncluirRef");
let btnRemoverRef = document.querySelector(".btnRemoverRef");
let btnIncluirAgl = document.querySelector(".btnIncluirAgl");
let btnRemoverAgl = document.querySelector(".btnRemoverAgl");

function getConta(contas, contaCodigo) {
    return contas.filter(function (contas) {
        return contas.code == contaCodigo;
    });
}
function getSelectedCompanyTitle(ano) {
    let thAno = document.createElement("th");
    let thCompany = document.createElement("th");

    let nomeEmpresa = selCompanies.options[selCompanies.selectedIndex].textContent;

    thAno.className = "title_table";
    thAno.colSpan = 2;
    thAno.textContent = "Ano: ".concat(ano);

    thCompany.className = "title_table";
    thCompany.colSpan = 7;
    thCompany.textContent = "Empresa: ".concat(nomeEmpresa);

    let tr = document.createElement("tr");
    tr.appendChild(thAno);
    tr.appendChild(thCompany);

    return tr;
}

function createTableHead(ano) {
    let tr = document.createElement("tr");

    createCellHead(tr, "id");
    createCellHead(tr, "Conta");
    createCellHead(tr, "Descrição");
    createCellHead(tr, "Tipo");
    createCellHead(tr, "Natureza");
    createCellHead(tr, "Nível");
    createCellHead(tr, "Conta Superior");
    createCellHead(tr, "Conta Referencial");
    createCellHead(tr, "Código Aglutinação");

    let thead = document.createElement("thead");
    thead.appendChild(getSelectedCompanyTitle(ano));
    thead.appendChild(tr);
    return thead;
}

function createCreateTableRow(conta) {
    let tr = document.createElement("tr");

    let contaEcd = conta.contaEcd;

    let sk = "";
    let cod_nat = "";
    let nivel = "";
    let cod_cta_sup = "";
    let cod_cta_ref = "";
    let cod_agl = "";

    if (typeof contaEcd != "undefined" && contaEcd != null) {
        sk = contaEcd.sk;
        cod_nat = contaEcd.cod_nat;
        nivel = contaEcd.nivel;
        cod_cta_sup = contaEcd.cod_cta_sup;
        cod_cta_ref = contaEcd.cod_cta_ref;
        cod_agl = contaEcd.cod_agl;
    }

    createCellData(tr, sk);
    createCellData(tr, conta.conta);
    createCellData(tr, conta.descricao);
    createCellData(tr, conta.tipoconta);
    createCellData(tr, cod_nat);
    createCellData(tr, nivel);
    createCellData(tr, cod_cta_sup);
    createCellData(tr, cod_cta_ref);
    createCellData(tr, cod_agl);

    return tr;
}

let selectEventTable = (event) => {
    if (rowSelected == null) {
        rowSelected = event.target.parentElement;
    } else {
        rowSelected.removeAttribute("class");
        rowSelected = event.target.parentElement;
    }
    rowSelected.className = "rowSelected";
    codigoSelecionado = rowSelected.cells[COLUMN_COD_CTA].innerHTML;
};

let editRowEvent = function (e) {
    btnEditar.click();
};

function populateTable(empresaJson) {
    let table = document.querySelector("table");
    let tbody = document.createElement("tbody");
    rowSelected = null;
    table.innerHTML = "";
    table.appendChild(createTableHead(empresaJson.ano));
    empresaJson.contas.forEach(function (conta) {
        tbody.appendChild(createCreateTableRow(conta));
    });
    table.appendChild(tbody);
    tbody.addEventListener("click", selectEventTable);
    tbody.addEventListener("dblclick", editRowEvent);
}

btnLocalizar.addEventListener("click", function () {
    if (txtAno.value.length == 0) {
        showMessage("Digite um ano.");
        return;
    }

    codigoSelecionado = null;
    let xhr = new XMLHttpRequest();
    let company = selCompanies.options[selCompanies.selectedIndex].value;

    xhr.open("GET", "/ecd/contasPorEmpresa?empresa=" + company + "&ano=" + txtAno.value);
    xhr.addEventListener("load", function () {
        if (xhr.status == 200) {
            let resposta = xhr.responseText;
            empresaJson = JSON.parse(resposta);
            populateTable(empresaJson);
        } else {
            console.log("erro");
        }
    });
    xhr.send();
});

/*=====================================================================================*/
/*=====================================================================================*/
//MODAL EDITAR
btnEditar.addEventListener("click", (event) => {
    if (typeof codigoSelecionado == "undefined" || codigoSelecionado == null) {
        showMessage("Selecione uma linha na tabela.");
    } else {
        showModalForm(form);
        contaJson = getConta(codigoSelecionado, empresaJson);
        populateForm(contaJson, empresaJson.ano, empresaJson.codigoempresa);
    }
});

function getConta(contaSelecionada, empresa) {
    let contas = empresa.contas;
    for (var i = 0; i < contas.length; i++) {
        let c = contas[i];
        if (c.conta == contaSelecionada) {
            return c;
        }
    }
}
/*
var span = document.getElementsByClassName("close")[0];

span.onclick = function () {
    modal.style.display = "none";
};

window.onclick = function (event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
};
*/
/*=====================================================================================*/
/*=====================================================================================*/
/*REFERENCIAL E AGLUTINAÇÃO */

let inputAgl = document.querySelector(".inputAgl");
let inputRef = document.querySelector(".inputRef");
let selectAgl = document.querySelector(".selectAgl");
let selectRef = document.querySelector(".selectRef");

selectAgl.addEventListener("dblclick", function (e) {
    btnRemoverAgl.click();
});

selectRef.addEventListener("dblclick", function (e) {
    btnRemoverRef.click();
});

inputRef.addEventListener("keyup", function (e) {
    if (e.keyCode === 13) {
        e.preventDefault();
        btnIncluirRef.click();
    }
});

inputAgl.addEventListener("keyup", function (e) {
    if (e.keyCode === 13) {
        e.preventDefault();
        btnIncluirAgl.click();
    }
});

btnIncluirRef.addEventListener("click", function (e) {
    e.preventDefault();
    let value = inputRef.value.trim();
    if (value.length > 0) {
        let opt = document.createElement("option");
        opt.appendChild(document.createTextNode(value));
        opt.setAttribute("value", value);
        selectRef.appendChild(opt);
        inputRef.value = "";
    }
});

btnRemoverRef.addEventListener("click", function (e) {
    e.preventDefault();
    selectRef.remove(selectRef.selectedIndex);
});

btnIncluirAgl.addEventListener("click", function (e) {
    e.preventDefault();
    let value = inputAgl.value.trim();
    if (value.length > 0) {
        let opt = document.createElement("option");
        opt.appendChild(document.createTextNode(value));
        opt.setAttribute("value", value);
        selectAgl.appendChild(opt);
        inputAgl.value = "";
    }
});
btnRemoverAgl.addEventListener("click", function (e) {
    e.preventDefault();
    selectAgl.remove(selectAgl.selectedIndex);
});
/*=====================================================================================*/
/*=====================================================================================*/
/*SAVE */

btnSave.addEventListener("click", function (e) {
    e.preventDefault();
    /*
    let xhr = new XMLHttpRequest();

    xhr.open("POST", "/ecd/AddContaEcd");
    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
*/
    /*
    xhr.addEventListener("load", function () {
        if (xhr.status == 200) {
            let resposta = xhr.responseText;
        } else {
            console.log("erro");
        }
    });
*/
    if (validate(form)) {
        let sk = form.sk.value;
        let ano = form.ano.value;
        let codigoempresa = form.codigoempresa.value;
        let cod_cta = form.cod_cta.value;
        let cod_cta_sup = form.cod_cta_sup.value;
        let nivel = form.nivel.value;
        let cod_nat = form.cod_nat.value;
        let cod_cta_ref = getSelectTagAllText(selCod_cta_ref);
        let cod_agl = getSelectTagAllText(selCod_agl);

        let param = "sk=" + sk + "&ano=" + ano + "&codigoempresa=" + codigoempresa + "&cod_cta=" + cod_cta + "&cod_cta_sup=" + cod_cta_sup + "&cod_nat=" + cod_nat + "&nivel=" + nivel + "&cod_cta_ref=" + cod_cta_ref + "&cod_agl=" + cod_agl;

        postForm(POST, "/ecd/AddContaEcd", param, httpPostResponse_);
    }
});

let validate = (form) => {
    if (form.cod_nat.value.length == 0) {
        showMessage("Selecione uma natureza.");
        return false;
    }
    if (form.nivel.value.length == 0) {
        showMessage("Nível está em branco.");
        return false;
    }
    return true;
};

let httpPostResponse_ = (event) => {
    let resposta;
    if (event.currentTarget.status == 200) {
        resposta = event.currentTarget.responseText;
        if (resposta === "ok") {
            showMessage("Dados gravados");
            btnLocalizar.click();
            form.reset();
        } else {
            showMessage(resposta);
        }
    } else {
        resposta = event.currentTarget.responseText;
        showMessage("Server Error!!!".concat(resposta));
    }
};

function populateForm(json, ano, codigoempresa) {
    form.ano.value = ano;
    form.codigoempresa.value = codigoempresa;
    form.conta.value = json.conta;
    form.descricao.value = json.descricao;
    form.tipoconta.value = json.tipoconta;
    let contaEcd = json.contaEcd;

    form.cod_cta.value = json.conta;
    if (typeof contaEcd == "undefined" || contaEcd == null) {
        form.sk.value = "";
        form.cod_cta_sup.value = "";
        form.cod_nat.value = "";
        form.nivel.value = "";
        selCod_cta_ref.innerHTML = "";
        selCod_agl.innerHTML = "";
    } else {
        form.sk.value = contaEcd.sk;
        form.cod_cta.value = contaEcd.cod_cta;
        form.cod_cta_sup.value = contaEcd.cod_cta_sup;
        form.cod_nat.value = contaEcd.cod_nat;
        form.nivel.value = contaEcd.nivel;
        populateSelectTag(selCod_cta_ref, contaEcd.cod_cta_ref);
        populateSelectTag(selCod_agl, contaEcd.cod_agl);
    }
}
