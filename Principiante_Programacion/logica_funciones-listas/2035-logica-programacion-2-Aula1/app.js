let nSecreto = 0; 
let contador = 0;
let listaNumeros = [];

 
//Funcion para traer y modificar el titulo y el parrafo a traves del dom
 function editarElemento(elemento, texto){

    let elementoEditable = document.querySelector(elemento);
    elementoEditable.innerHTML = texto;
}

function condicionesIniciales(){
    
    nSecreto = numeroSecreto(); 
    contador = 0;
    editarElemento('h1', 'Juego del número secreto');
    editarElemento('p', 'Indica un número ente 1 y 10');
}

condicionesIniciales();

//Funcion para reiniciar el programa
function reinicio(){

    limpiar();
    condicionesIniciales();
    document.getElementById("reiniciar").setAttribute('disabled', true);
}

function numeroSecreto (){

 let nGenerado = Math.floor(Math.random() * 10) + 1;
 
 

 if (listaNumeros.length === 10) return 0; 

  else if (listaNumeros.includes(nGenerado)) return numeroSecreto();

 else {
    
console.log(nGenerado);
 console.log(listaNumeros);

    listaNumeros.push(nGenerado);

    

     return nGenerado
    }
    
}


function intentar(){

    let cajaTexto = parseInt(document.getElementById('valorUsuario').value);
   
    contador++;
   // while(contador <= 3){

        if (cajaTexto === nSecreto){

            editarElemento('p', `¡Acertaste! en ${contador} ${contador > 1 ? "intentos" : "intento"} `);
            document.getElementById('reiniciar').removeAttribute('disabled');
        }
        //  else if (contador == 3) {

        //     editarElemento ('p',"Se acabaron las oportunidades");
        // }
        else {

            if (nSecreto > cajaTexto) { 
                
                editarElemento ('p',"El número es mayor");
            }
            else { editarElemento ("p", "El número es menor")}
            limpiar();
        }

        if (nSecreto === 0){

            editarElemento ("p","Ya no hay más números para sortear... reiniciando números");
            reinicio();
             listaNumeros = [];
           
        }
      //  break;
   // }   
}

 function limpiar(){
        document.getElementById('valorUsuario').value = "";
    }


   
