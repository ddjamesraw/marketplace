<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--elvariable id="deps" type="java.util.ArrayList<Depository>"--%>

<!DOCTYPE html>
<html>
	<head>
	   <title>Список депозитариев</title>
	   <meta charset="UTF-8">
    </head>
    <body>
        <div>
            <table style="border-style: solid;border-width: 1;border-color: black;">
                <tr>
                    <th>ID</th>
                    <th>Имя</th>
                </tr>
                <c:forEach items="${deps}" var="dep">
                <tr>
                    <td>${dep.id}</td>
                    <td>${dep.name}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </body>

</html>
