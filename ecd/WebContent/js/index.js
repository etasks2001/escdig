var iframe = document.querySelector("iframe");

let menu = document.querySelectorAll(".menu");

for (let i = 0; i < menu.length; i++) {
    menu[i].addEventListener("click", function (event) {
        let name = event.currentTarget.name;
        let src = "";
        switch (name) {
            case "planoconta":
                src = "/ecd/planoContas.html";
                break;
            case "dre":
                src = "/ecd/dre.html";
                break;
            case "dlpa-dmpl":
                src = "/ecd/dlpa-dmpl.html";
                break;
            case "balanco":
                src = "/ecd/balanco.html";
                break;
            default:
                break;
        }
        iframe.src = src;
    });
}
