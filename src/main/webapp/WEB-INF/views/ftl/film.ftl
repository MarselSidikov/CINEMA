<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<!DOCTYPE html>
<head>
    <title>${model.film.name}</title>
    <link rel="stylesheet" type="text/css" href="/resources/css/film.css">
</head>
<body>
<div id="container">
    <div id="header">${model.film.name}</div>
    <br>
    <div id="img">
        <img src="${model.film.poster}" width="205">

    </div>
    <div id="info">
        <table>
            <caption>
                Информация о фильме:
            </caption>
            <tr>
                <td>Продолжительность</td>
                <td>${model.film.duration}</td>
            </tr>
            <tr>
                <td>Рейтинг</td>
                <td>${model.film.rating}</td>
            </tr>
            <tr>
                <td>Формат</td>
                <td>${model.film.is3D?then("3D","Not 3d")}</td>
            </tr>
        </table>
    </div>
    <div id="actors">
        <h3>В главных ролях:</h3> <br>
        <ul>
            <li><a href="">Майкл Фассбендер</a></li>
            <br>
            <li><a href="">Кэтрин Уотерстон</a></li>
            <br>
            <li><a href="">Билли Крудап</a></li>
            <br>
            <li><a href="">Дэнни МакБрайд</a></li>
            <br>
            <li><a href="">Демиан Бишир</a></li>
            <br>
            <li><a href="">Кармен Эджого</a></li>
            <br>
            <li><a href="">Джусси Смоллетт</a></li>
            <br>
            <li><a href="">Калли Эрнандес</a></li>
            <br>
            <li><a href="">Эми Саймец</a></li>
            <br>
            <li><a href="">Натаниель Дин</a></li>
        </ul>
    </div>
    <div class="clear"></div>
    <div id="description">
        <p>
        ${model.film.description}
        </p></div>
    <br>
    <iframe width="560" height="315" src="${model.film.trailer}" frameborder="0" allowfullscreen></iframe>
    <br>
</div>

</body>