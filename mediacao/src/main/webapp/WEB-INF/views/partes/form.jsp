<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro da parte</title>
</head>
<body>
	<form action="/mediacao/partes" method="post">
		<div>
			<label>Nome: </label>
			<input type="text" name="nome">
		</div>
		
		<select name="orgaos">
			<option value="volvo">Volvo</option>
  			<option value="saab">Saab</option>
		</select>
		<div>
			<label>dada: </label>
			<input type="date" name="data">
		</div>
		
	   
	    
	    <button type="submit">Cadastrar</button>
	</form>
</body>
</html>