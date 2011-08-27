<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="domainModel.Familia" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Registro de Familia</title>
<link rel="stylesheet" type="text/css" href="D:\Java\workspace\Prontuario\WebContent\style.css" />
</head>
<body>

		<%
			Familia familia = (Familia)request.getAttribute("familias");
		%>
		<h1>CADASTRO DE FAMÍLIA</h1>	
		
		<h2>ENDEREÇO</h2>
			<form action="/Prontuario/cadastroFamilia" method="post">
				<table>					
					
					<tr>
						<td>
						  Logradouro: <br/>
						   <input type="text" name="logradouro" size="40" maxlength="150" value=<%if(familia!=null){out.print(familia.getLogradouro());}%>/>
						</td>
						<td>
						  Bairro: <br/>
						   <input type="text" name="bairro" size="40" maxlength="150" value=<%if(familia!=null){out.print(familia.getBairro());}%>/>
						</td>
					</tr>
					<tr>
						<td>
						  Numero: <br/>
						   <input type="text" name="numero" size="40" maxlength="150" value=<%if(familia!=null){out.print(familia.getNumero());}%>/>
						</td>
						<td>
						  Complemento: <br/>
						   <input type="text" name="complemento" size="40" maxlength="150" value=<%if(familia!=null){out.print(familia.getComeplemento());}%>/>
						</td>					
					</tr>
					
					<tr>
						<td>
							Cep:<br/>
							<input type="text" name="cep" size="40" maxlength="100" value=<%if(familia!=null){out.print(familia.getCep());}%>/>
						</td>
						<td>
							Data de Cadastro: <br/>
							<input type="text" name="data_cadastro" size="40" maxlength="100" value=<%if(familia!=null){out.print(familia.getData_cadastro());}%>/>
						</td>
					</tr>
					
					<tr>
					<td>
						  Cidade: <br/>
						   <input type="text" name="cidade" size="40" maxlength="150" value=<%if(familia!=null){out.print(familia.getCidade());}%>/>
						</td>
						<td>						   
					</tr>				
				</table>
				
				<br/>
				<input name="save" type="submit" value="Salvar"/>
			  	<input name="limpar" type="reset" value="Limpar" />
			  
			</form>
</body>
</html>