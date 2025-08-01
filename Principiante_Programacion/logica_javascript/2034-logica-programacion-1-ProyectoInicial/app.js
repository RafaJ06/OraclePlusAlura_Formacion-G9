let maximo = 10;
let numeroSecreto = Math.floor(Math.random() * maximo) + 1;
let variable;
let contador = 0;
let limite = 3;

console.log(numeroSecreto);

while (contador < limite && numeroSecreto != variable){

    variable = prompt(`Indícame un número entre 1 y ${maximo}, por favor`);
    contador++;

    if (numeroSecreto == variable) alert(`¡Acertaste en ${contador} ${contador == 1 ? " intento" : " intentos"}!`);

        else if (numeroSecreto > variable) alert("El número secreto es mayor");

        else if(numeroSecreto < variable) alert("El número secreto es menor");
       
        else alert("Ese no es el número"); 

        if (contador == limite && numeroSecreto != variable) alert(`Lo siento, agotaste tus ${limite} ${contador == 1 ? " intento" : " intentos"}`);       
}
