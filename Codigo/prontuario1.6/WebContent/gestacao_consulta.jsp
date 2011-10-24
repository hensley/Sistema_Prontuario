9<%-- 
    Document   : gestacao
    Created on : 09/09/2011, 01:45:42
    Author     : JORDANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="domainModel.Consulta" %>
<%@ page import="domainModel.Familia" %>

<% 
Familia familia = new Familia();
if(request.getAttribute("familia") != null){
    familia = (Familia) request.getAttribute("familia");
    //out.println(familia.getNome());
 }
%>
    
<!DOCTYPE html>

<%@include  file="jspf/topo_menu_principal.jspf" %>

<div id="consulta">
     <%
			Consulta consulta = (Consulta)request.getAttribute("gestacao_consulta");
                        
		%>
                
                    <form action="/gestacao_consulta" method="post">
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
                <form action="/gestacao_consulta" method="post">
                       <table width="800" border="0" align="center">
                                              <tr>
                                                <td width="107">Data da consulta:</td>
                                                <td width="148"><input type="text" name="data_consulta" id="data_consulta" /></td>
                                                <td width="114">Tipo da consulta:</td>
                                                <td width="143"><select id="tipo_consulta" name="tipo_consulta">
                                                                    <option value="dentista">Dentista</option>
                                                                    <option value="ginicologista">Ginicologista</option>
                                                                    <option value="clinico geral">Clinico Geral</option>
                                                                    <option value="fisioterapeuta">Fisioterapeuta</option>
                                                                    <option value="Obstetra">Obstetra</option>
                                                                    <option value="spicologo">Psicologo</option>
                                                                    <option value="nutricionista">Nutricionista</option>
                                                                </select>
                                                </td>
                                                    <td width="50">Medico:</td>
                                                    <td width="212"><select id="pessoa_f" name="pessoa_f">
                                                                        <option value="medico 1">medico 1</option>
                                                                        <option value="medico 2">2</option>
                                                                        <option value="medico 3">3</option>
                                                                        <option value="medico 4">4</option>
                                                                        <option value="medico 5">5</option>
                                                                        <option value="medico 6">6</option>
                                                                        </select>
                                                </td>
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
                </form>
</div>
<%@include  file="jspf/rodape_fim_conteudo.jspf" %>
