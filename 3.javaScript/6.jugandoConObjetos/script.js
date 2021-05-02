var users = [
    { name: "Michael", age: 37 },
    { name: "John", age: 30 },
    { name: "David", age: 27 },
    { name: "Sara", age: 15 }
];

//¿Cómo harías print/log de la edad de John?
console.log('La edad de ' + users[1].name + ' es ' + users[1].age + ' años');
//¿Cómo harías print/log del nombre del primer objeto?
console.log('El nombre de la primera persona es: ' + users[0].name);
//¿Cómo harías print/log del nombre y la edad de cada usuario utilizando un for loop? 
for (var i = 0; i < users.length; i++) {
    console.log(users[i].name + " - " + users[i].age);
}
//¿Cómo harías para imprimir el nombre de los mayores de edad?
for (var i = 0; i < users.length; i++) {
    if (users[i].age >= 18) {
        console.log('Las personas mayores de edad son: ' + users[i].name + " - " + users[i].age);
    }

}