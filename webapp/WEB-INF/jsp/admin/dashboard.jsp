<%--elvariable id="status" type="java.lang.String"--%>
<%@page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Панель администратора</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <div>
            <h1>Доступные действия:</h1>
	        <ul>
	           <li><a href="user/list">Список всех пользователей</a></li>
	           <li><a href="user/addrandom">Добавить случайного пользователя</a></li>
	        </ul>
        </div>
        <div>
            <h3>Последняя операция:</h3>
            <p>${status}</p>
        </div>
    </body>
</html>