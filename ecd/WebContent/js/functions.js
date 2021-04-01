var formatterDouble = new Intl.NumberFormat("br-BR", {
    style: "decimal",
    currency: "BRL",
});

let moneymask = {
    allowNegative: false,
    prefix: "",
    fixed: true,
    fractionDigits: 2,
    decimalSeparator: ",",
    thousandsSeparator: "",
    cursor: "end",
};

var sectionRowIndex = -1;

const operations = {
    INSERT: "insert",
    UPDATE: "update",
    DELETE: "delete",
};
function upperCaseInput(event) {
    var charInput = event.keyCode;
    var start = event.target.selectionStart;
    var end = event.target.selectionEnd;
    var uppercar = String.fromCharCode(charInput);
    uppercar = uppercar.toUpperCase();
    event.target.value = event.target.value.substring(0, start) + uppercar + event.target.value.substring(end);

    event.target.setSelectionRange(start + 1, start + 1);
    event.preventDefault();
}

var POST = "POST";
var GET = "GET";
const COLUMN_NU_ORDEM = 1;
const COLUMN_SK = 0;

function getSelectTagText(selectObj) {
    return selectObj.options[selectObj.selectedIndex].text;
}

function getSelectTagValue(selectObj) {
    return selectObj.options[selectObj.selectedIndex].value;
}

function getSelectTagAllText(selectObj) {
    let options = selectObj.options;
    const length = options.length;
    let all = "";

    for (let i = 0; i < length; i++) {
        all += options[i].text + ";";
    }
    return all.slice(0, -1);
}

function populateSelectTag(selectedObj, text) {
    selectedObj.innerHTML = "";
    if (text.length > 0) {
        const arrayText = text.split(";");
        for (let i = 0; i < arrayText.length; i++) {
            let v = arrayText[i];
            let opt = document.createElement("option");

            opt.appendChild(document.createTextNode(v));
            opt.setAttribute("value", v);

            selectedObj.appendChild(opt);
        }
    }
}

function setSelectedValue(selectObj, valueToSet) {
    for (var i = 0; i < selectObj.options.length; i++) {
        if (selectObj.options[i].value == valueToSet) {
            selectObj.options[i].selected = true;
            return;
        }
    }
}

var showMessage = (message) => {
    let modal = document.getElementById("MessageModal");
    let style = modal.style;
    style.display = "block";

    let close = modal.querySelector(".close");
    let messageTag = modal.querySelector(".message");
    messageTag.textContent = message;

    close.addEventListener("click", (event) => {
        style.display = "none";
    });

    window.onclick = (event) => {
        if (event.target == modal) {
            style.display = "none";
        }
    };
};

let showModalForm = (form) => {
    let style = form.style;
    style.display = "block";

    let close = form.querySelector(".close");

    let btnExit = document.querySelector(".exit");

    btnExit.addEventListener("click", (event) => {
        closeForm(event);
    });

    close.addEventListener("click", (event) => {
        closeForm(event);
    });
    /*
    window.onclick = (event) => {
        if (event.target == form) {
            closeForm(event);
        }
    };
*/
    let closeForm = (event) => {
        event.preventDefault();
        form.reset();
        style.display = "none";
    };
};

function createCellHead(tr, value) {
    let th = document.createElement("th");
    th.textContent = value;
    tr.appendChild(th);
}

function createCellData(tr, value, className, formatter) {
    let td = document.createElement("td");
    if (typeof formatter != "undefined") {
        td.textContent = formatter.format(value);
    } else {
        td.textContent = value;
    }

    if (typeof className != "undefined") {
        td.className = className;
    }

    tr.appendChild(td);
}

let postForm = (method, url, param, eventPostResponse) => {
    let xhr = new XMLHttpRequest();
    xhr.open(method, url);

    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-E");
    xhr.addEventListener("load", eventPostResponse);
    xhr.send(param);
};

let getForm = (method, url, eventGetResponse) => {
    let xhr = new XMLHttpRequest();
    xhr.open(GET, url);
    xhr.addEventListener("load", eventGetResponse);
    xhr.send();
};

class UpAndDown {
    constructor(tbody, sequenceColumn) {
        this.sequenceColumn = sequenceColumn;
        this.tagTbody = tbody;
        this.index = -1;
        this.rows = null;
    }

    set setRows(rows) {
        this.rows = rows;
    }

    set setIndex(index) {
        this.index = index;
    }

    up() {
        if (this.index >= 0) {
            let parent = this.rows[this.index].parentNode;
            if (this.index > 0) {
                parent.insertBefore(this.rows[this.index], this.rows[this.index - 1]);
                this.index--;
                this.changeIndex();
            }
        }
    }
    down() {
        if (this.index >= 0) {
            let parent = this.rows[this.index].parentNode;
            if (this.index < this.rows.length - 1) {
                parent.insertBefore(this.rows[this.index + 1], this.rows[this.index]);
                this.index++;
                this.changeIndex();
            }
        }
    }

    changeIndex() {
        for (let i = 0; i < this.rows.length; i++) {
            this.rows[i].cells[this.sequenceColumn].innerHTML = i + 1;
        }
    }
}

var parametersForm = (inputs) => {
    let parameter = "";
    inputs.forEach((input) => {
        parameter += input.name + "=" + input.value + "&";
    });

    return parameter.slice(0, -1);
};
