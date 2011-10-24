<%-- 
    Document   : cadastro_gestante
    Created on : 09/09/2011, 02:21:09
    Author     : JORDANA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="domainModel.Consulta" %>
<%@ page import="domainModel.Exame" %>
<%@ page import="domainModel.Familia" %>
<%@ page import="domainModel.Gestante" %>

<% 
Familia familia = new Familia();
if(request.getAttribute("familia") != null){
    familia = (Familia) request.getAttribute("familia");
    //out.println(familia.getNome());
 }
%>

<%@include  file="jspf/topo_menu_principal.jspf" %>

 <div id="cadastro_gestante">

                
                    <form action="/gestacao_cadastro" method="post">
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
                                  
                   <%
			Gestante gestante = (Gestante)request.getAttribute("gestacao_cadastro");
		%>               
                <form action="/gestacao_cadastro" method="post">
                <p><h1 align="center">Cadastro de Gestante </h1></p>
                <table width="80%" height="300px" border="0" align="center">
                    
                    
                  <tr>
                        <td align="right">Recen Nascido:</td>
                        <td><input type="radio" name="recen" id="recen" value="sim" />Sim <br />
                        <input type="radio" name="recen" id="recen" value="nao" />Não
                        </td>
                        <td align="right">Aborto:</td>
                        <td><input type="radio" name="aborto" id="aborto" value="sim" />Sim <br />
                        <input type="radio" name="aborto" id="aborto" value="nao" />Não
                        <td align="right">Estado Civil:</td>
                        <td><input type="text" name="estadocivil" id="estadocivil" /></td>
                        <td>&nbsp;</td>   
                 </tr>
                     
                  <tr>
                        
                        <td align="right">Ultimo dia de Menstruacao:</td>
                        <td><input type="text" name="dum" id="dum" /></td>
                        <td align="right">Data Provavel do Parto:</td>
                        <td><input type="text" name="dpp" id="dpp" /></td>
                  
                       
                        
                      
                  </tr>
                        <td align="right">Paciente:</td>
                        <td><input type="text" name="paciente" id="paciente" /></td>
                        <td align="right">Gestacao Anterior:</td>
                        <td><input type="radio" name="gestacaoant" id="gestacaoant" value="sim" />Sim <br />
                        <input type="radio" name="gestacaoant" id="gestacaoantt" value="nao" />Não
                  <tr>
                        
                        
                  </tr>
                      <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                        <td><p>&nbsp;
                          </p>
                          <p>&nbsp;</p>
                          <p>
                            <input type="reset" name="limpar" id="limpar" value="Limpar Formulario" />
                        </p></td>
                        <td><p>&nbsp;
                          </p>
                          <p>&nbsp;</p>
                          <p>
                            <input type="submit" name="Save"  value="Salvar" />
                        </p></td>
                      </tr>
                    </table>
                 </form>
              </div>
                
<%@include  file="jspf/rodape_fim_conteudo.jspf" %>
