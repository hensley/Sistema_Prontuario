<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CADASTRO</title>
<link rel="stylesheet" type="text/css" href="D:\Java\workspace\Prontuario\WebContent\style.css" />
</head>
<body>

	<h1>CADASTROS</h1>
	<form action="/Prontuario/cadastro" method="post">
		<table>
				<td>
					CADASTRO: <br/>
						<select  name="cadastro">	
							<option value="VAZIO" selected="selected">selecione</option>
							<option value="cadastroFuncionario">FUNCIONARIO</option>
							<option value="cadastroFamilia">FAMILIA</option>
							<option value="cadastroPaciente">PACIENTE</option>						
						</select>
				</td>
				
		</table>
		<table>
				
				<input name="cadastro" type="submit" value="OK"/>
		</table>
	
	</form>
	

</body>
</html>