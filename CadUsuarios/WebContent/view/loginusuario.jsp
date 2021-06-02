<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login usuario</title>
</head>
<body>
	<form action="../ServletUsuario">
		<input type="email" id="email" name="email" placeholder="E-Mail">
		
		<input type="password" id="senha" name="senha" placeholder="senha">
		
		<input type="submit" id="opcao" name="opcao" value="Logar">
		
	</form>
	<a href="addusuario.jsp">Cadastrar Usuario</a>

</body>
</html>