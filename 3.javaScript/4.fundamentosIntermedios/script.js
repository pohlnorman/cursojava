function sigma() {

    var num = prompt('Cuantos numeros tendra el arreglo:', '');
    var nume = parseInt(num);
    var suma = 0;
    var arr = [];

    for (i = 1; i <= nume; i++) {
        arr.push(i);
    }

    for (i = 0; i < arr.length; i++) {

        suma = suma + arr[i];
    }

    document.write('numeros del arreglo: ' + arr + '<br>');
    document.write('suma de los valores del arreglo: ' + suma);
    document.getElementById('mostrar').innerHTML = 'suma de los valores del arreglo: ' + suma;
}

function factorial() {

    var num = prompt('ingrese un numero positivo para buscar su factorial:', '');
    var nume = parseInt(num);
    var multi = 1;

    for (i = 1; i <= nume; i++) {

        multi = multi * i;
    }


    document.write('el factorial de ' + nume + ' es: ' + multi);
    document.getElementById('mostrar').innerHTML = 'suma de los valores del arreglo: ' + suma;
}

function fibonacci() {
    var num = prompt('ingrese numero para hacer la secuencia Fibonacci:', '');
    var nume = parseInt(num);
    var arr = [];

    if (nume == 0) {
        document.write('El Fibonacci  de ' + nume + ' es ' + '0');
    } else if (nume == 1) {
        document.write('El Fibonacci  de ' + nume + ' es ' + '1');

    } else {
        arr.push(0);
        arr.push(1);
        for (i = 2; i <= nume; i++) {
            arr.push((arr[i - 2]) + (arr[i - 1]));
        }
        document.write('El Fibonacci de ' + nume + ' es ' + ((arr[nume - 1]) + (arr[nume - 2])));
    }
}

function penultimo() {
    var num = prompt('Cuantos numeros tendra el arreglo:', '');
    var arr = [];

    for (i = 1; i <= num; i++) {
        var valor = prompt('ingrese valor ' + i, '');
        arr.push(valor);
    }

    if (arr.length <= 2) {
        document.write(null);
    } else {
        document.write('Los valores del arreglo son: ' + arr + '<br>');
        document.write('El penultimo valor es: ' + arr[num - 2]);
    }
}

function nUltimo() {
    var num = prompt('Cuantos numeros tendra el arreglo:', '');
    var nume = parseInt(num);
    var arr = [];

    for (i = 1; i <= nume; i++) {
        var valor = prompt('Ingrese el valor numero ' + i, '');
        arr.push(valor);
    }

    var pos = prompt('Que posicion quieres buscar (debe ser menor o igual a ' + nume + '): ', '');
    var pose = parseInt(pos);

    if (arr.length <= 2) {
        document.write(null);
    } else {
        document.write('Numeros del arreglo: ' + arr + '<br>')
        document.write('Posicion a buscar: ' + pose + '<br>');
        document.write('Numero en la posicion seleccionada: ' + arr[pose - 1]);
    }
}

function segundomayor() {
    var num = prompt('Cuantos numeros tendra el arreglo:', '');
    var nume = parseInt(num);
    var arr = [];
    var aux = 0;

    if (nume <= 2) {
        document.write(null)
    } else {
        for (i = 1; i <= nume; i++) {
            var valor = prompt('Ingrese el valor numero ' + i, '');
            arr.push(valor);
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                aux = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = aux;
            }
        }
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                aux = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = aux;
            }
        }
        document.write(arr + '<br>')
        document.write(arr[nume - 2]);
    }
}

function dobleproblema() {
    var num = prompt('Cuantos numeros tendra el arreglo:', '');
    var nume = parseInt(num);
    var arr = [];
    var arr2 = [];

    for (i = 1; i <= nume; i++) {
        var valor = prompt('Ingrese el valor numero ' + i, '');
        arr.push(valor);
    }

    for (i = 0; i < arr.length; i++) {
        arr2.push(arr[i]);
        arr2.push(arr[i]);
    }

    document.write('Valores ingresados: ' + arr + '<br>');
    document.write('Valores duplicados: ' + arr2);
}