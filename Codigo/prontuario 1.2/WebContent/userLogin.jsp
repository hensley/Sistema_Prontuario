<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="domainModel.Familia" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@include  file="Cabecalho.jspf" %>
<body>
	<form action="/login" method="post">
		<h1>ACESSO AO PRONTUARIO</h1>
			
			<table>
				<tr>
					<td>
						Usuario: <br/>
						<input type="text" name="usuario" size="35" maxlength="35"/>
					</td>
                                    
                                    
                                    
                                    
					<td>
						Senha: <br/>
						<input type="password" name="senha" size="35" maxlength="35"/>
					</td>
				</tr>
			</table>		
			<table>
				<tr>
					<td>
					<br/>
					  <input name="login" type="submit" value="Entrar"  />
                                          
					</td>			  
				</tr>
			</table>
	</form>
</body>
</html>