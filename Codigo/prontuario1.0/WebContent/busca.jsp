<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Buscas</title>
<link rel="stylesheet" type="text/css" href="D:\Java\workspace\Prontuario\WebContent\style.css" />
</head>
<body>

	<h1>BUSCAS</h1>
	<form action="/Prontuario/busca" method="post">
		<table>
				<td>
					Categoria: <br/>
						<select  name="busca">	
							<option value="VAZIO" selected="selected">selecione</option>
							<option value="cadastroFuncionario">FUNCIONARIOS</option>
							<option value="cadastroFamilia">FAMILIAS</option>
							<option value="cadastroPaciente">PACIENTES</option>						
						</select>
				</td>
				<tr>
					Código: <br/>
					<input type="text" name="codigo" size="20" maxlength="20" />
				</tr>
				
		</table>
		<table>
				
				<input name="cadastro" type="submit" value="OK"/>
		</table>
	
	</form>

</body>
</html>