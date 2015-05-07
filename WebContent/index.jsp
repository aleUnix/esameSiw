 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="US-ASCII">
<title>siw-mvc-es2</title>
</head>
<body>
<h1>siw-mvc-es2</h1>
<ul>
<li><a href="<c:url value="/newProduct.jsp" />">Inserisci un Nuovo Prodotto</a></li>
<li><a href="<c:url value="/controller/product.list" />">Mostra tutti i Prodotti</a></li>
</ul>
${action}
</body>
</html>