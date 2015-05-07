<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1" />
	<title>Nuovo Prodotto</title>
</head>
<body>
	<form action="<c:url value="/controller/product.create" />" method="get">
	<div>Nome: <input type="text" name="name" value="${param.name}"/> ${nameErr}</div>
	<div>Codice: <input type="text" name="code" value="${param.code}"/> ${codeErr}</div>
	<div>Prezzo: <input type="text" name="price" value="${param.price}"/> ${priceErr}</div>
	<div>Descrizione: <textarea rows="4" cols="50" name="description">${param.description}</textarea></div>
	<div><input type="submit" name="sumbit" value="invia" /></div>
	</form>
</body>
</html>
