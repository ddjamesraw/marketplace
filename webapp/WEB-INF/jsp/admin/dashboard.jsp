<%--elvariable id="status" type="java.lang.String"--%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
               <li><a href="user/list">Список пользователей</a></li>
               <li><a href="depository/list">Список депозитариев</a></li>
               <li><a href="user/add">Создать пользователя</a></li>
               <li><a href="user/addrandom">Создать случайного пользователя</a></li>
               <li><a href="depository/add">Создать депозитарий</a></li>
	        </ul>
        </div>
        <div>
            <h4>Последняя операция:</h4>
            <p>${status}</p>
        </div>
    </body>
</html>