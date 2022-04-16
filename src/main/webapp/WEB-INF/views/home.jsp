<%--
  Created by IntelliJ IDEA.
  User: soc06212
  Date: 2022/04/14
  Time: 12:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>영화이름</th>
        <th>감독</th>
        <th>장르</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${movieList}" var="movie">
        <tr>
            <td>${movie.movie_name}</td>
            <td>${movie.director}</td>
            <td>${movie.type}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
