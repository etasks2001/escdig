let form = document.getElementById("PanelLinhaBalancoModal");

SimpleMaskMoney.setMask(form.vl_cta_ini, moneymask);
SimpleMaskMoney.setMask(form.vl_cta_fin, moneymask);

let inputsUpperCase = document.querySelectorAll(".text-uppercase");

for (let i = 0; i < inputsUpperCase.length; i++) {
    let input = inputsUpperCase[i];
    input.addEventListener("keypress", upperCaseInput);
}


/*==================================================================================================*/
/*==================================================================================================*/
let operation;
/*==================================================================================================*/
/*==================================================================================================*/
let updownTableRow = new UpAndDown("tbody", COLUMN_NU_ORDEM);

function disableAllInputs(inputs, disabled) {
    for (let i = 0; i < inputs.length; i++) {
        let input = inputs[i];
        input.disabled = disabled;
    }
}

function getAllFormInputs(form) {
    return form.querySelectorAll("#PanelLinhaBalancoModal input, #PanelLinhaBalancoModal select");
}

form.addEventListener("reset", (evnet) => {
    disableAllInputs(getAllFormInputs(form), true);
    sectionRowIndex = -1;
    codigoSelecionado = null;
});

const COLUMN_COD_CTA = 2;

let balancoJson;
let empresaJson;
let rowSelected = null;

let txtAno = document.querySelector("#anopesquisa");
let selCompanies = document.querySelector("#companies");
let btnLocalizar = document.querySelector("#localizar");
let btnEditar = document.querySelector("#editar");
let btnInserir = document.querySelector("#inserir");
let btnApagar = document.querySelector("#apagar");
let btnGravarOrdem = document.querySelector("#gravarordem");
let btnSave = document.querySelector(".save");
let btnUp = document.querySelector("#up");
let btnDown = document.querySelector("#down");

let codigoSelecionado;

function getLinha(contas, contaCodigo) {
    return contas.filter((contas) => {
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
    thCompany.colSpan = 10;
    thCompany.textContent = "Empresa: ".concat(nomeEmpresa);

    let tr = document.createElement("tr");
    tr.appendChild(thAno);
    tr.appendChild(thCompany);

    return tr;
}

function createTableHead(ano) {
    let tr = document.createElement("tr");
    createCellHead(tr, "id");
    createCellHead(tr, "n.º");
    createCellHead(tr, "Cóc. Aglut.");
    createCellHead(tr, "Cóc. Aglut. Sup.");
    createCellHead(tr, "Descrição");

    createCellHead(tr, "Ind.");
    createCellHead(tr, "Nível");
    createCellHead(tr, "Grupo");
    createCellHead(tr, "Valor Inicial");
    createCellHead(tr, "Ind. Inicial");
    createCellHead(tr, "Valor Final");
    createCellHead(tr, "Ind. Final");

    let thead = document.createElement("thead");
    thead.appendChild(getSelectedCompanyTitle(ano));
    thead.appendChild(tr);
    return thead;
}

function createCreateTableRow(balanco) {
    let tr = document.createElement("tr");

    createCellData(tr, balanco.sk, "align-right");
    createCellData(tr, balanco.nu_ordem, "align-right");
    createCellData(tr, balanco.cod_agl);
    createCellData(tr, balanco.cod_agl_sup);
    createCellData(tr, balanco.descr_cod_agl);

    createCellData(tr, balanco.ind_cod_agl, "align-center");
    createCellData(tr, balanco.nivel_agl, "align-center");
    createCellData(tr, balanco.ind_grp_bal, "align-center");
    createCellData(tr, balanco.vl_cta_ini, "align-right", formatterDouble);
    createCellData(tr, balanco.ind_dc_cta_ini, "align-center");
    createCellData(tr, balanco.vl_cta_fin, "align-right", formatterDouble);
    createCellData(tr, balanco.ind_dc_cta_fin, "align-center");

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
    updownTableRow.setIndex = rowSelected.sectionRowIndex;
};

btnUp.addEventListener("click", (event) => {
    updownTableRow.up();
});
btnDown.addEventListener("click", (event) => {
    updownTableRow.down();
});

let editRowEvent = (event) => {
    btnEditar.click();
};

function populateTable(empresaJson) {
    let table = document.querySelector("table");
    let tbody = document.createElement("tbody");
    rowSelected = null;
    table.innerHTML = "";
    table.appendChild(createTableHead(empresaJson.ano));
    empresaJson.balanco.forEach((conta) => {
        tbody.appendChild(createCreateTableRow(conta));
    });
    table.appendChild(tbody);
    tbody.addEventListener("click", selectEventTable);
    tbody.addEventListener("dblclick", editRowEvent);
}

btnApagar.addEventListener("click", (event) => {
    operation = operations.DELETE;

    if (typeof codigoSelecionado == "undefined" || codigoSelecionado == null) {
        showMessage("Selecione uma linha na tabela.");
    } else {
        balancoJson = getLinha(codigoSelecionado, empresaJson);

        let sk = balancoJson.sk;

        if (operation == operations.DELETE) {
            if (typeof codigoSelecionado == "undefined" || codigoSelecionado == null) {
                showMessage("Selecione uma linha na tabela.");
            } else {
                let param = "sk=" + sk;
                postForm(POST, "/ecd/balancoApagarLinha", param, httpPostResponse);
            }
        }
    }
});

btnLocalizar.addEventListener("click", (event) => {
    let company = selCompanies.options[selCompanies.selectedIndex].value;
    let ano = txtAno.value;
    if (ano.length == 0) {
        showMessage("Digite o ano.");
    } else {
        getForm(GET, "/ecd/balancoPorEmpresa?empresa=" + company + "&ano=" + ano, httpGetResponse);
    }
});

/*=====================================================================================*/
/*=====================================================================================*/
//MODAL INSERIR
btnInserir.addEventListener("click", (event) => {
    let ano = txtAno.value;
    if (ano.length == 0) {
        showMessage("Digite o ano");
    } else {
        operation = operations.INSERT;
        form.sk.value = "";
        form.ano.value = txtAno.value;
        form.codigoempresa.value = selCompanies.value;
        showModalForm(form);
        disableAllInputs(getAllFormInputs(form), false);
    }
});
/*=====================================================================================*/
/*=====================================================================================*/
//MODAL EDITAR
btnEditar.addEventListener("click", (event) => {
    if (typeof codigoSelecionado == "undefined" || codigoSelecionado == null) {
        showMessage("Selecione uma linha na tabela.");
    } else {
        operation = operations.UPDATE;
        showModalForm(form);
        balancoJson = getLinha(codigoSelecionado, empresaJson);
        balancoJson.nu_ordem = rowSelected.cells[COLUMN_NU_ORDEM].innerHTML;
        populateForm(balancoJson, empresaJson.ano, empresaJson.codigoempresa, balancoJson.sk);
    }
});

function getLinha(linhaSelecionada, empresa) {
    let linhas = empresa.balanco;

    for (let i = 0; i < linhas.length; i++) {
        let c = linhas[i];
        if (c.cod_agl == linhaSelecionada) {
            return c;
        }
    }
}
/*-------------------------------------------------------------------------------------*/
/*-------------------------------------------------------------------------------------*/
/*SAVE */

btnSave.addEventListener("click", (event) => {
    event.preventDefault();

    if (validate(form)) {
        //let inputs = form.querySelectorAll("#PanelLinhaBalancoModal input, #PanelLinhaBalancoModal select");
        param = parametersForm(getAllFormInputs(form));
        postForm(POST, "/ecd/balancoAddLinha", param, httpPostResponse);
    }
});
let validate = (form) => {
    if (form.cod_agl.value.length == 0) {
        showMessage("Código de aglutinação está em branco.");
        return false;
    }
    if (form.descr_cod_agl.value.length == 0) {
        showMessage("Descrição está em branco.");
        return false;
    }

    if (form.nivel_agl.value.length == 0) {
        showMessage("Nível está em branco.");
        return false;
    }

    if (form.vl_cta_ini.value.length == 0) {
        showMessage("Valor inicial está em branco.");
        return false;
    }

    if (form.vl_cta_fin.value.length == 0) {
        showMessage("Valor final está em branco.");
        return false;
    }
    return true;
};
let populateForm = (json, ano, codigoempresa, sk) => {
    disableAllInputs(getAllFormInputs(form), false);
    form.sk.value = sk;
    form.ano.value = ano;
    form.codigoempresa.value = codigoempresa;
    form.nu_ordem.value = json.nu_ordem;
    form.cod_agl.value = json.cod_agl;
    form.cod_agl_sup.value = json.cod_agl_sup;
    form.descr_cod_agl.value = json.descr_cod_agl;
    form.ind_cod_agl.value = json.ind_cod_agl;
    form.nivel_agl.value = json.nivel_agl;
    form.ind_grp_bal.value = json.ind_grp_bal;
    form.vl_cta_ini.value = json.vl_cta_ini.toString().replace(".", ",");
    form.ind_dc_cta_ini.value = json.ind_dc_cta_ini;
    form.vl_cta_fin.value = json.vl_cta_fin.toString().replace(".", ",");
    form.ind_dc_cta_fin.value = json.ind_dc_cta_fin;
};
/*======================================================================================================*/
/*======================================================================================================*/
/*GRAVAR ORDEM*/
btnGravarOrdem.addEventListener("click", (event) => {
    let rows = document.querySelector("tbody").rows;

    let param = "ordem=";
    let sk = "";
    let nu_ordem = "";
    for (let i = 0; i < rows.length; i++) {
        sk = rows[i].cells[COLUMN_SK].innerHTML;
        nu_ordem = rows[i].cells[COLUMN_NU_ORDEM].innerHTML;
        param += sk.concat(":").concat(nu_ordem).concat(";");
    }
    param = param.slice(0, -1);
    postForm(POST, "/ecd/balancoGravarNumeroOrdem", param, httpPostResponse);
});
/*======================================================================================================*/
/*======================================================================================================*/
/*HTTP RESPONSE*/

let httpPostResponse = (event) => {
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
let httpGetResponse = (event) => {
    if (event.currentTarget.status == 200) {
        let resposta = event.currentTarget.responseText;
        empresaJson = JSON.parse(resposta);
        populateTable(empresaJson);
        updownTableRow.setIndex = -1;
        updownTableRow.setRows = document.querySelector("tbody").rows;
    } else {
        console.log("erro");
    }
};
