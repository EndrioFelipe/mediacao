<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Mediação</title>
</head>
<body>
    <h1>Página Inicial</h1>
    

    <table>
        <tr>
            <td>Título</td>
            <td>Descrição</td>
            <td>Páginas</td>
        </tr>
        <c:forEach items="${partes}" var="parte">
        <tr>
            <td>${parte.nome}</td>
            <td>${parte.orgaos}</td>
            <td>${parte.data}</td>
        </tr>
   	 </c:forEach>
    </table>

</body>
</html>