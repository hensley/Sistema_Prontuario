<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="domainModel.Paciente" %>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CADASTRO DE PACIENTE</title>
<link rel="stylesheet" type="text/css" href="D:\Java\workspace\Prontuario\WebContent\style.css" />
</head>

<body>

		<h1>CADASTRO DE PACIENTE</h1>
		<%
			Paciente paciente = (Paciente)request.getAttribute("cadastroPaciente");
		%>
			<form action="/Prontuario/cadastroPaciente" method="post">
				<table>
						<tr>
							<td>
							Código da Familia:</br>
							<input type="text" name="idfamilia" size="20" maxlength="20"/>
							</td>
						</tr>
						<tr>
						 	<td>
						  		Nome:<br/>
						  		<input type="text" name="nome" size="40" maxlength="60"/>
						  	</td>
						  	<td>
						  		Data Nascimento:<br/>
						  		<input type="text" name="dataNascimento" size="40" maxlength="12"/>
						 	</td>							 						
						</tr>
						<tr>
							<td>
						  		Idade:<br/>
						  		<input type="text" name="idade" size="40" maxlength="60"/>
						  	</td>
						  	<td>						  	
						  		Ocupação:<br/>
						  		<input type="text" name="ocupacao" size="40" maxlength="60"/>
						 	</td>
						</tr>
						<tr>
							<td>
								Sexo:<br/>
							   <select  name="sexo">	
									<option value="VAZIO" selected="selected">selecione</option>
									<option value="masculino">MASCULINO</option>
									<option value="feminino">FEMININO</option>
							   </select>
							</td>
							<td>							
								Alfabetizado:</br>
								<input type="radio" name="sim" value="1"/>Sim</br>
								<input type="radio" name="nao" value="1"/>Não</br>							
							</td>							
						</tr>
						</br>
				</table>	
				
				</br>
				
					<input name="save" type="submit" value="Salvar"/>
			  		<input name="limpar" type="reset" value="Limpar" />
						
			</form>

</body>
</html>