<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--elvariable id="users" type="java.util.ArrayList<User>"--%>

<!DOCTYPE html>
<html>
	<head>
	   <title>Список пользователей по критерию: ID=309</title>
	   <meta charset="UTF-8">
    </head>
    <body>
        <div>
            <table style="border-style: solid;border-width: 1;border-color: black;">
                <tr>
                    <th>ID</th>
                    <th>email</th>
                    <th>phone</th>
                    <th>city</th>
                    <th>registration date</th>
                </tr>
                <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.email}</td>
                    <td>${user.phone}</td>
                    <td>${user.city}</td>
                    <td>${user.regdate}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </body>

</html>
