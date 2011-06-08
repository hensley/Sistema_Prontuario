<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="domainModel.Pessoa" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<%
		Pessoa medico = (Pessoa)request.getAttribute("medico");
	%>
	<form action="/prontuario/Medico" method="post" >
		
		<table border="0" width="960"> 
 
		<tr>
		 <td>
		    Código Pessoa: <br/>
		 <input type="text" name="codigo_pessoa" size="20" /> </td>
		 <td>
		    Nome Paciente: <br/>
		 <input type="text" name="nome_paciente" size="40" maxlength="150"/> </td>
		 <td></td>
		</tr>
		<tr>
		 <td>
		    RG: <br/>
		 <input type="text" name="rg" size="20" maxlength="15"/> </td>
		 <td>
		    CPF: <br/>
		 <input type="text" name="cpf" size="20" maxlength="11"/> </td>
		 <td></td>
		</tr>
		<tr>
		 <td>
		    Conselho Classe: <br/>
		  <input type="text" name="conselho_classe" size="40" maxlength="100"/>
		 </td>
		 <td>
		    Logradouro: <br/>
		  <input type="text" name="logradouro" size="40" maxlength="100"/>
		 </td>
		 <td></td>
		</tr>
		<tr>
		 <td>
		    Número: <br/>
		  <input type="text" name="numero" size="20" maxlength="20"/>
		 </td>
		 <td>
		    Complemento: <br/>
		  <input type="text" name="complemento" size="20" maxlength="150"/>
		 </td>
		 <td></td>
		</tr>
		<tr>
		 <td>
		    Bairro: <br/>
		  <input type="text" name="bairro" size="40" maxlength="150"/>
		 </td>
		 <td>
		    Cidade: <br/>
		  <input type="text" name="cidade" size="40" maxlength="150"/>
		 </td>
		 <td>
		     Estado: <br/>
		 <select  name="estado">        
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
		          <option value="MINAS GERAIS" selected="selected">MG</option>
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
		<tr>
		<td>
		    Telefone fixo: <br/>
		  <input type="text" name="telefone_fixo" size="20" maxlength="50"/>
		</td>
		 <td>
		    Telefone Celular: <br/>
		  <input type="text" name="telefone_celular" size="20" maxlength="50"/>
		 </td>
		 </tr>
		 <tr>
		 <td>
		    Especialidade: <br/>
		  <input type="text" name="especialidade" size="40" maxlength="150"/>
		 </td>
		 <td>
		    Selecione Sexo: <br/>
		  <input type="radio" name="sexo" value="masculino" /> masculino
		  <input type="radio" name="sexo" value="feminino" /> feminino
		 </td>
		</tr>
		<tr>
		 <td>
		    Data Nascimento: <br/>
		  <input type="text" name="data_nascimento" size="20" maxlength="10"/>
		 </td>
		 <td>
		    Profissão: <br/>
		  <input type="text" name="profissao" size="40" maxlength="150"/>
		 </td>
		 <td></td>
		</tr>
		<tr>
		 <td></td>
		 <td>
		    <br/> <br/> <br/>
		 <input name="save" type="submit" value="Salvar"  />
		  <input name="limpar" type="reset" value="Limpar" />
		  
		  
		 </td>
		 <td></td>
		</tr>
		</table>
		
	</form>
</body>
</html>