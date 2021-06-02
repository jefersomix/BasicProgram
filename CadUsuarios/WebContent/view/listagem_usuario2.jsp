<%@page import="model.Usuario"%>
<%@page import="dao.UsuarioDAO"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de Usuario usando JSTL</title>
</head>
<body>
	<!-- configurar com JSTL a conexão com BD -->
	<sql:setDataSource var="usuario" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/admusuario?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
		user="root" password="" />

	<!-- criando um select -->
	<sql:query var="resultado" dataSource="${usuario}">
	select * from usuario order by nome;

</sql:query>




	<table border="1">
		<tr>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Perfil</th>
			<td><a href="../ServletUsuario">Excluir</a>
			<a href="../ServletUsuario">Alterar</a></td>
		</tr>
		<c:forEach var="row" items="${resultado.rows}">
			<tr>
				<td><c:out value="${row.nome}" /></td>
				<td><c:out value="${row.email}" /></td>
				<td><c:out value="${row.email}" /></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>