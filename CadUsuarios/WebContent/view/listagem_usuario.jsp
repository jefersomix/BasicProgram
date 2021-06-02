<%@page import="model.Usuario"%>
<%@page import="dao.UsuarioDAO"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de Usuario</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Perfil</th>
			<th>op�ao</th>
		</tr>
		<%
		UsuarioDAO dao = new UsuarioDAO();
		for (Usuario usuario : dao.listarUsuario()) {
		%>
		<tr>
			<td><%=usuario.getNome()%></td>
			<td><%=usuario.getEmail()%></td>
			<td><%=usuario.getPerfil()%></td>
			<td><a href="../ServletUsuario?email=<%=usuario.getEmail()%>&opcao=Excluir">Excluir</a>
			<a href="../ServletUsuario">Alterar</a></td>
		</tr>
		<%
		}
		%>

	</table>
</body>
</html>