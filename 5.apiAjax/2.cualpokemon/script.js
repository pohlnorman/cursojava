$(document).ready(function() {
    for (var i = 1; i <= 151; i++) {
        $('.image-container').append($('<img>').attr('id', i).attr('src', 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/' + i + '.png'))
    }

    $('img').on('click', function(e) {
        $('.poke-dex').html('');
        var id = $(this).attr('id');
        $.get("https://pokeapi.co/api/v2/pokemon/" + id + '/', function(data) {
            console.log(data);
            var types = "<ul>";
            for (var i = 0; i < data.types.length; i++) {
                types += "<li>" + data.types[i].type.name + "</li>";
            }
            types += "</ul>";
            var info = "<h5>Tipo</h5>" + types + "<h5>Altura</h5>" + data.height / 10 + " mt" + "<h5>Peso</h5>" + data.weight / 10 + " kg";
            console.log(types);
            data.name = data.name.charAt(0).toUpperCase() + data.name.slice(1);
            $('.poke-dex').append("<h2>" + data.name + "</h2>");
            $('.poke-dex').append("<img src=" + 'https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/' + data.id + '.png' + ">");
            $('.poke-dex').append(info);



        });
        e.stopPropagation();
    });
})