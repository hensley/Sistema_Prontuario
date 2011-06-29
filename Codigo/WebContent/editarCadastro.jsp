<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="domainModel.Pessoa,java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Editar Cadastro</title>
<link rel="stylesheet" type="text/css" href="D:\Java\workspace\Prontuario\WebContent\style.css" />
</head>
<body>
		<%
			Pessoa pessoa = (Pessoa)request.getAttribute("pessoas");
		%>
			<h1>EDITAR CADASTRO</h1>
			<form action="/Prontuario/editingRegistry" method="post">
				<br/>
				<table>
						<tr>
							 <td>
							  Código do Funcionario: <br/>
							  <input type="text" name="idPessoa" size="20" maxlength="20" />							  
							 </td>
							
						</tr>
						<tr>
							<td>
							<input type="submit" name="EnviarConsulta" size="20" maxlength="20" />
							</td>
						</tr>
				</table>
				
				<br/>
				<br/>			
				
			<form/>		
			
</body>
</html>