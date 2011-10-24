<%-- 
    Document   : vacinacao
    Created on : 04/10/2011, 17:31:00
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="domainModel.Consulta" %>
<%@ page import="domainModel.Exame" %>
<%@ page import="domainModel.Familia" %>
<%@ page import="domainModel.Vacina" %>
<% 
Familia familia = new Familia();
if(request.getAttribute("familia") != null){
    familia = (Familia) request.getAttribute("familia");
    //out.println(familia.getNome());
 }
%>
<!DOCTYPE html>

<%@include  file="jspf/topo_menu_principal.jspf" %>


     <%
			Vacina vacina = (Vacina)request.getAttribute("cadastro_vacinacao_vacina");
		%>
                
                    <form action="/gestacao_consultas" method="post">
                                <table width="800" border="0" align="center">
                                  <tr>
                                    <td width="104">Busca por CPF:</td>
                                    <td width="149"><input type="text" name="cpf" id="cpf" /></td>
                                    <td width="533"><input type="submit" name="pesquisar" id="pesquisar" value="Pesquisar" /></td>
                                 
                                  </tr>
                                </table>	
                                <table width="800" border="0" align="center">
                                  <tr>
                                    <td width="117">Nome do paciente:</td>
                                    <td width="673"><input name="nome" type="text" id="nome" value="<%=familia.getNome()%>"  readonly="readonly" /></td>
                                  </tr>
                                </table>
     </form>
                                  
                                  
<form action="/vacina" method="post">
<table width="800" border="0">
  <tr>
    <td>Filho:</td>
    <td><select id="filho"name="filho">
        <option value="filho 1">filho 1</option>
  		<option value="filho 2">2</option>
        <option value="filho 3">3</option>
        </select>
    </td>
  </tr>
</table>
<table width="800" border="0">
  <tr>
    <td>Tipo da Vacina:</td>
    <td><select id="tipo_vacina"name="tipo_vacina">
        <option value="tipo 1">1</option>
  		<option value="tipo 2">2</option>
        <option value="tipo 3">3</option>
        </select>
    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Data da aplicação:</td>
    <td><input type="text" name="data_aplicacao" id="data_aplicacao" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Funcionario responsavel</td>
    <td><select id="funcionario_responsavel"name="funcionario_responsavel">
        <option value="1">1</option>
  		<option value="2">2</option>
        <option value="3">3</option>
        </select>
    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
     <td><input type="submit" name="Save"  value="Salvar" /></td>
  </tr>
</table>
</form>
<%@include  file="jspf/rodape_fim_conteudo.jspf" %>

