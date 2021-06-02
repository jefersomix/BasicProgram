<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Add User</title>

</head>

<body>
	<form action="../ServletUsuario">
		<input type="email" id="email" name="email" placeholder="E-Mail">
		<input type="text" id="nome" name="nome" placeholder="nome"> <input
			type="password" id="senha" name="senha" placeholder="senha">
		<input type="password" id="rsenha" name="rsenha" placeholder="rsenha">

		<select id="perfil" name="perfil">
			<option>Convidado</option>
			<option>Administrador</option>
			<option>Usuario</option>
		</select>
		
		<input type="submit" id="opcao" name="opcao" value="Adicionar">
		<input type="reset" id="reset" name="reset" value="Limpar">


	</form>
	<%@include file = "listagem_usuario.jsp" %>

</body>
</html>