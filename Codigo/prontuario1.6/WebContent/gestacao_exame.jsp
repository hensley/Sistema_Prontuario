9<%-- 
    Document   : gestacao
    Created on : 09/09/2011, 01:45:42
    Author     : JORDANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="domainModel.Consulta" %>
<%@ page import="domainModel.Exame" %>
<%@ page import="domainModel.Familia" %>
<%@ page import="domainModel.Exame" %>
<% 
Familia familia = new Familia();
if(request.getAttribute("familia") != null){
    familia = (Familia) request.getAttribute("familia");
    //out.println(familia.getNome());
 }
%>
    
<!DOCTYPE html>

<%@include  file="jspf/topo_menu_principal.jspf" %>

<div id="exame">
     <%
			Exame exame = (Exame)request.getAttribute("conteudo_gestacao_cadastro_exame");
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
                                  
                                  
       <form action="/gestacao_exames" method="post">
                <table width="800" border="0" align="center">
                                  <tr>
                                    <td width="107">Data do exame:</td>
                                    <td width="148"><input type="text" name="data_exame" id="data_exame" /></td>
                                    <td width="114">Tipo de exame:</td>
                                    <td width="143"><select id="tipo_exame" name="tipo_exame">
                                                        <option value="ABO-RH">ABO-RH</option>
                                                        <option value="ANTI-HIV">ANTI-HIV</option>
                                                        <option value="COMBS.INDIRETO">COMBS.INDIRETO</option>
                                                        <option value="GLICEMIA DE JEJUM">GLICEMIA DE JEJUM</option>
                                                        <option value="HB/HT">HB/HT</option>
                                                        <option value="HBsAG">HBsAG</option>
                                                        <option value="TOXOPLASMOSE">TOXOPLASMOSE</option>
                                                        <option value="ULTRASONOGRAFIA">ULTRASONOGRAFIA</option>
                                                        <option value="URINA 1">URINA 1</option>
                                                        <option value="VDRL">VDRL</option>
                                                    </select>
                                    </td>
                                    <td width="50">Laboratorio:</td>
                                    <td width="212"><select id="laboratorio" name="laboratorio">
                                    					<option value="sao geraldo">sao geraldo</option>
                                                        <option value="sao jose">sao jose</option>
                                                        <option value="sao matheus">sao matheus</option>
                                                        <option value="sao joao">sao joao</option>
                                                        <option value="sao pedro">sao pedro</option>
                                                        <option value="santo antonio">santo antonio</option>
                                                        </select> </td>
                                  </tr>
                                  <tr>
                                    <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                    <td>&nbsp;</td>
                                    <td><br />
                                    	<br />
                                        <br />
                                    			<input type="reset" name="limpar_formulario" id="limpar_formulario" value="Limpar Formulario" />     
                                                        <input type="submit" name="Save"  value="Salvar" />
                                  </tr>
                                </table>

<%@include  file="jspf/rodape_fim_conteudo.jspf" %>
