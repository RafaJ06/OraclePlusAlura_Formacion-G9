
let nombres = [];
let nombre = "";
var ul = document.getElementById("listaAmigos");

function limpiarCampo (){

    document.getElementById("amigo").value = "";
}

function addAmigo(){

nombre = document.getElementById("amigo").value;

    if(nombre === "" || nombre.includes(" ")){

        alert("Por favor, inserte un nombre.");
    }
    else{

        nombres.push(nombre);
            addLista(nombre);
    }

      limpiarCampo();
}

function addLista(element){

     let newli = document.createElement("li");
    newli.textContent = element;
    ul.appendChild(newli); 
}

function sortearAmigo(){

    let max = nombres.length - 1;
    let selecAmigo = Math.floor(Math.random() * (max + 1));
    let ul = document.getElementById("resultado");
    let newli = document.createElement("li");

    if (ul.getElementsByTagName("li").length > 0){

        alert("Ya se sorteó un nombre")
    }

    else{
        if(nombres.length > 0){
            console.log(selecAmigo);
        newli.textContent = nombres[selecAmigo];
        ul.appendChild(newli); 
        }
        else{
            alert("Por favor, inserte un nombre.");
        }
}
}