let titulo = document.querySelector("h1");
titulo.innerHTML = "Hora del desafío";


function consola(){

    console.log('El botón fue clicado');
}

function pregunta()
{
   let ciudad = prompt("Dime el nombre de una ciudad de Brasil");

   alert(`Estuve en ${ciudad} y me acordé de ti`);
}

function alerta (){

    alert("Yo amo JS");
}

function suma (){

   let numero = 0;

    for (let i = 0;i < 2; i++){

      numero = parseInt(numero) + parseInt(prompt("Dame un número"));
    }

    alert(`La suma de esos números da ${numero}`);
}