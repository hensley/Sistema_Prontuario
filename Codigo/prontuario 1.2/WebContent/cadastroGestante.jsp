
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="domainModel.Gestante" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>CADASTRO DE Gestante</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
    <body>

		<h1>CADASTRO DE PACIENTE</h1>
		<%
			Gestante gestante = (Gestante)request.getAttribute("cadastroGestante");
		%>
			<form action="/cadastroGestante" method="post">
                            
                            
                            
                            
                            
                            <table>
						<tr>
							<td>
							Código da Paciente:</br>
							<input type="text" name="idPaciente" size="20" maxlength="20"/>
							</td>
						</tr>
						<tr>
						 	<td>
						  		Recen Nascido menos de 2,500g ?:<br/>
						  		<input type="text" name="recen" size="40" maxlength="60"/>
						  	</td>
						  	<td>
						  		Aborto Anteriro?:<br/>
						  		<input type="text" name="aborto" size="40" maxlength="12"/>
						 	</td>							 						
						</tr>
						<tr>
							<td>
						  		Estado Civil:<br/>
						  		<input type="text" name="estadocivil" size="40" maxlength="60"/>
						  	</td>
						  	<td>						  	
						  		Gestação Anterior?:<br/>
						  		<input type="text" name="gestacaoant" size="40" maxlength="60"/>
                                                                 
						 	</td>
						</tr>
						<tr>
							<td>
								Último dia da Menstruação:<br/>
                                                                <input type="text" name="dum" size="40" maxlength="60"/>
                                                                
							</td>
														
						</tr>
						</br>
				</table>	
				
				</br>
				
					<input name="save" type="submit" value="Salvar"/>
			  		
						
			</form>

</body>
</html>

