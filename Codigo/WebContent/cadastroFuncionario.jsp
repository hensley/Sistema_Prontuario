<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="domainModel.Pessoa" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<title>Cadastro</title>
		<link rel="stylesheet" type="text/css" href="D:\Java\workspace\Prontuario\WebContent\style.css" />	
		
		<SCRIPT LANGUAGE='Javascript'>		
			function bemvindo() {
				window.alert("Registro de Funcionarios");
			}
		</SCRIPT>	
		
	</head>
	
		<body onLoad=bemvindo()>	
		
		
		<%
			Pessoa pessoa = (Pessoa)request.getAttribute("pessoas");
		%>
			<h1>CADASTRO DE FUNCIONÁRIOS</h1>			
			<h2>DADOS PESSOAIS</h2>	
			 			
			
			<form action="/Prontuario/cadastroFuncionario" method="post">
			
				<table border="0" width="960">
					<tr>
						 <td>
						  Nome: <br/>
						  <input type="text" name="nome" size="120" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getNome());} %>/>
						 </td>
						
					</tr>
				
				</table>
			
				<table border="0" width="960">				
				
				<tr>
					<td>
					  Identidade: <br/>
					  <input type="text" name="rg" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getRg());} %>/>
					</td>
				     <td>
					  CPF: <br/>
					   <input type="text" name="cpf" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getCpf());} %>/>
					 </td>
					 
				</tr>
	
				<tr>
					<td>
					  Conselho de Classe: <br/>
					   <input type="text" name="conselho_classe" size="40" maxlength="150"/>
					</td>
					<td>
					  Profissao: <br/>
					   <select  name="profissao">	
							<option value="VAZIO" selected=<%if(pessoa!=null){out.print(pessoa.getProfissao());}else{out.println("VAZIO");} %>">selecione</option>
							<option value="Medico(a)">MEDICO</option>
							<option value="Enfermeiro(a)">ENFERMEIRO</option>
							<option value="Agente">AGENTE DE SAÚDE</option>
							<option value="Dentista">DENTISTA</option>
					   </select>
					</td>	
					
				</tr>	
					
				<tr>
				     <td>
					  Tel. Fixo: <br/>
					   <input type="text" name="telefone_fixo" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getTelefone_fixo());} %>/>
					 </td>
					 <td>
					  Tel. Celular: <br/>
					   <input type="text" name="telefone_celular" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getTelefone_celular());} %>/>
					 </td>
				</tr>	
				
				<tr>
					<td>
					  Data Nascimento: <br/>
					   <input type="text" name="data_nascimento" size="40" maxlength="100" value=<%if(pessoa!=null){out.print(pessoa.getData_nascimento());} %>/>
					</td>
				     <td>
					  Sexo: <br/>
					   <select  name="sexo">	
							<option value="VAZIO" selected="selected">selecione</option>
							<option value="masculino">MASCULINO</option>
							<option value="feminino">FEMININO</option>
					   </select>
					</td>					 
				</tr>
				
				</table>
				
				<h2>ENDEREÇO</h2>
				
				<table>					
					
					<tr>
						<td>
						  Logradouro: <br/>
						   <input type="text" name="logradouro" size="40" maxlength="150"value=<%if(pessoa!=null){out.print(pessoa.getLogradouro());} %>/>
						</td>
						<td>
						  Bairro: <br/>
						   <input type="text" name="bairro" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getBairro());} %>/>
						</td>
					</tr>
					<tr>
						<td>
						  Numero: <br/>
						   <input type="text" name="numero" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getNumero());} %>/>
						</td>
						<td>
						  Complemento: <br/>
						   <input type="text" name="complemento" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getComeplemento());} %>/>
						</td>					
					</tr>
					
					<tr>
					<td>
						  Cidade: <br/>
						   <input type="text" name="cidade" size="40" maxlength="150" value=<%if(pessoa!=null){out.print(pessoa.getCidade());} %>/>
						</td>
						<td>
						   Estado: <br/>
						  <select  name="estado">		
							 <option value="VAZIO" selected="selected">selecione</option>
							 <option value="ACRE">AC</option>
							 <option value="ALAGOAS">AL</option>
							 <option value="AMAZONAS">AM</option>
							 <option value="AMAP&Aacute;">AP</option>
							 <option value="BAHIA">BA</option>
							 <option value="CEARA">CE</option>
							 <option value="DISTRITO FEDERAL">DF</option>
							 <option value="ESPIRITO SANTO">ES</option>
							 <option value="GOIAS">GO</option>
							 <option value="MARANH&Atilde;O">MA</option>
							 <option value="MINAS GERAIS">MG</option>
							 <option value="MATOGROSSO SUL">MS</option>
							 <option value="MT">MT</option>
							 <option value="PAR&Aacute;">PA</option>
							 <option value="PARA&Iacute;BA">PB</option>
							 <option value="PERNAMBUCO">PE</option>
							 <option value="PIAU&Iacute;">PI</option>
							 <option value="PARAN&Aacute;">PR</option>
							 <option value="RIO DE JANEIRO">RJ</option>
							 <option value="RIO GRANDE DO NORTE">RN</option>
							 <option value="ROND&Ocirc;NIA">RO</option>
							 <option value="RORAIMA">RR</option>
							 <option value="RIO GARNDE DO SUL">RS</option>
							 <option value="SANTA CATARINA">SC</option>
							 <option value="SERGIPE">SE</option>
							 <option value="S&Atilde;O PAULO">SP</option>
							 <option value="TOCATINS">TO</option>
							</select>
						</td>
					</tr>
				
				</table>
				
			  <br/>
			  <input name="save" type="submit" value="Salvar"/>
			  <input name="limpar" type="reset" value="Limpar" />
				
			</form>
		
		</body>
</html>