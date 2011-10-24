<%-- 
    Document   : preventivo
    Created on : 04/10/2011, 18:30:55
    Author     : Pablo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="domainModel.Consulta" %>
<%@ page import="domainModel.Exame" %>
<%@ page import="domainModel.Familia" %>
<%@ page import="domainModel.Coleta" %>
<% 
Familia familia = new Familia();
if(request.getAttribute("familia") != null){
    familia = (Familia) request.getAttribute("familia");
    //out.println(familia.getNome());
 }
%>
<%@include  file="jspf/topo_menu_principal.jspf" %>


     <%
			Coleta coleta = (Coleta)request.getAttribute("cadastro_preventivo_coleta");
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
                                  
                                  
<form action="/coleta" method="post">
<table width="800" border="1">
  <tr>
    <td><table width="800" border="0">
      <tr>
        <td>Data da coleta:</td>
        <td><input type="text" name="data_coleta" id="data_coleta" /></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>Funcionario responsavel:</td>
        <td><select id="funcionario_responsavel_preventivo"name="funcionario_responsavel_preventivo">
        <option value="f1">f1</option>
  	<option value="f2">f2</option>
        <option value="f3">f3</option>
        </select>
        </td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>PSF:</td>
        <td><select id="psf" name="psf">
        <option value="1">psf1</option>
  	<option value="2">pSF2</option>
        <option value="3">pSF3</option>
        </select>
        </td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td><input type="submit" name="Save"  value="Salvar" /></td>
        <td><input type="submit" name="Voltar"  value="Voltar" /></td>
      </tr>
    </table></td>
  </tr>
</table>
</form>

<%@include  file="jspf/rodape_fim_conteudo.jspf" %>
