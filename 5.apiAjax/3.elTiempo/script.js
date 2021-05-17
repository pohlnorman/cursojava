$(document).ready(function() {
    $('form').submit(function() {
        var api_key = '87e913ece0a093b13d896d53a44ddb0a';
        var city = $('input:text[name=city]').val();
        $.get('http://api.openweathermap.org/data/2.5/weather?q=' + city + '&units=metric&lang=es' + '&appid=' + api_key, function(res) {
            console.log(res);
            var html_str = '';
            html_str += "<p>" + "Ciudad: " + res['name'] + "</p>";
            html_str += "<p>" + "Cielo: " + res['weather'][0]['description'] + "</p>";
            html_str += "<p>" + "Temperature: " + res['main']['temp'] + "° C</p>";
            html_str += "<p id='lat'> Latitud: " + res['coord']['lat'] + "</p>";
            html_str += "<p id='lon'> Longuitud: " + res['coord']['lon'] + "</p>";
            $('#results').html(html_str);

            //genero el mapa
            var imagen = '';
            imagen += "<iframe src=https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d25400.155220397537!2d" + res['coord']['lon'] + "!3d" + res['coord']['lat'] + "!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1ses!2scl!4v1621262229113!5m2!1ses!2scl" + " width='600'" + " height='450'" + " style='border:0;'" + " allowfullscreen=''" + " loading='lazy'" + "></iframe>"
            $('#map').html(imagen);
        }, 'json');
        return false;

    })

});