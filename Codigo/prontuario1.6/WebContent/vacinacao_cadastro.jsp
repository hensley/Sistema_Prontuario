<%-- 
    Document   : vacinacao
    Created on : 04/10/2011, 17:31:00
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="domainModel.Consulta" %>
<%@ page import="domainModel.Exame" %>
<%@ page import="domainModel.Familia" %>
<%@ page import="domainModel.Crianca" %>
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
			Crianca crianca = (Crianca)request.getAttribute("cadastro_vacinacao_crianca");
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
                                  
                                  
<form action="/vacinacao_crianca" method="post">
<table width="800" border="0">
  <tr>
    <td>Nome da criança:</td>
    <td><input type="text" name="nome_crianca" id="nome_crianca" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Data de nascimento:</td>
    <td><input type="text" name="data_nascimento_crianca" id="data_nascimento_crianca" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Sexo:</td>
    <td><input type="radio" name="sexo_crianca" id="sexo" value="masculino" />Masculino <br />
    	<input type="radio" name="sexo_crianca" id="sexo" value="feminino" />Feminino
    </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Peso:</td>
    <td><input type="text" name="peso" id="peso" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Altura:</td>
    <td><input type="text" name="altura" id="altura" /></td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>Data do cadastro:</td>
    <td><input type="text" name="data_cadastro" id="data_cadastro" /></td>
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

