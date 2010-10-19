    <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--

Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Title      : Undertaking 
Version    : 1.0
Released   : 2010821
Description: A two-column web design, best for your personal and business blogging.

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <title>Mesa de Ayuda en Linea</title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <link href="default.css" rel="stylesheet" type="text/css" />
</head>
<body>
<!-- start header -->
<div id="header">
	<div id="logo">
		<h1>Ayudate.com</h1>
		<p><a href="http://www.freecsstemplates.org/">Help Desk en linea</a></p>
	</div>
	<div id="menu">
	  <ul>
	    <li class="current_page_item"></li>
	    <li><a href="#"><span>inicio</span></a></li>
	    <li><a href="#"><span>ayuda</span></a></li>
	    <li></li>
	    <li><a href="#"><span>Links</span></a></li>
	    <li><a href="#"><span>Contact</span></a></li>
      </ul>
		<ul>
	    <li class="current_page_item"></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
</div>
<hr />
<!-- end header -->
<!-- start page -->
<div id="wrapper">
	<div id="page">
		<div id="page-bgtop">
			<div id="page-bgbtm">
				<div id="content">
					<div class="post">
					<!--	<p class="date">set<b>22</b></p> -->
				    <blockquote>
						  <blockquote>
						    <h2 class="title">Detalle del Ticket - Tecnico</h2>
</blockquote>
					  </blockquote>
					  <div class="entry">
					    <blockquote>
						      <blockquote>
						        <table width="481" border="1" cellpadding="0" cellspacing="0" class="post">
						              <tr>
						                <td colspan="2" align="center" bgcolor="#B60044" class="meta" ><strong>DATOS DEL CLIENTE</strong></td>
				                  </tr>
						              <tr>
						                <td width="162" align="right" id="letrasTablas">Nombre completo:</td>
						                <td width="248"><form id="form2" method="post" action="">
						                  <p>
						                    <label for="listTipo"></label>
						                    <label for="txtnom"></label>
						                    <input name="txtnom" type="text" disabled="disabled" id="txtnom" value="${ticket.cliente.nombre}" />
						                  </p>
					                    </form></td>
					                  </tr>
						              <tr>
						                <td height="26" align="right"  id="letrasTablas">Email:</td>
						                <td><form id="form4" method="post" action="">
						                  <p>
						                    <label for="listArea"></label>
						                    <label for="txtarea"></label>
						                    <input name="txtarea" type="text" disabled="disabled" id="txtarea" value="${ticket.cliente.email}" />
					                      </p>
					                    </form></td>
					                  </tr>
						              <tr>
						                <td height="26" align="right"  id="letrasTablas">Anexo:</td>
						                <td><form id="form3" method="post" action="">
						                  <p>
						                    <label for="txtini"></label>
						                    <input name="txtini" type="text" disabled="disabled" id="txtini" value="${ticket.cliente.anexo}" />
					                      </p>
					                    </form></td>
				                  </tr>
						              <tr>
						                <td align="right" id="letrasTablas">Area:</td>
						                <td><form id="form5" method="post" action="">
						                  <p>
						                    <label for="txtfin"></label>
						                    <input name="txtfin" type="text" disabled="disabled" id="txtfin" value="${ticket.cliente.area}" />
					                      </p>
					                    </form></td>
					                  </tr>
						              <tr>
						                <td colspan="2" align="center" id="letrasTablas2"></td>
				                  </tr>
				                </table>
                                                                        <div><span id="lineaSepara"><table width="482" border="1" align="center" cellpadding="0" cellspacing="0">
                                        <tr>
                                          <td width="413" align="center" bgcolor="#B60044" class="meta" ><strong>Informacion del area</strong></td>
                                     </tr>
                                </table></span></div>
                                   
<table width="418" border="1" align="center" cellpadding="0" cellspacing="0">
						              <tr>
						                <td  ><table width="479" border="1" cellpadding="0" cellspacing="0" >
						                  <tr>
						                    <td width="65" id="letrasTablas3">Grupo de Soporte</td>
						                    <td width="194" align="center" id="letrasTablas2"><form id="form6" method="post" action="">
				                            <p>
						                          <label for="cmd_soporte"></label>
						                          <select name="cmd_soporte" id="cmd_soporte">
						                            <option value="0" selected="selected">${ticket.areaReportar}</option>
                                                                            <option value="1">Soporte Tecnologico</option>
						                            <option value="1">Desarrollo de Software</option>
						                            <option value="2">Redes y Comunicaciones</option>
	                                        </select>
					                            </p>
				                            </form></td>
						                    <td width="66" align="center" id="letrasTablas3">Tecnico</td>
						                    <td width="144" align="center" id="letrasTablas2"><form id="form7" method="post" action="">
						                      <p>
						                        <label for="txtSoporte"></label>
						                        <input name="txtSoporte" type="text" disabled="disabled" id="txtSoporte" value="${ticket.tecnico.nombre}" />
					                          </p>
					                        </form></td>
					                      </tr>
						                  <tr id="letrasTablas3">
						                    <td>Estado Ticket</td>
						                    <td><form id="form8" method="post" action="">
						                      <p>
						                        <label for="cmdEstado"></label>
						                        <select name="cmdEstado" id="cmdEstado">
						                          <option value="0" selected="selected">${ticket.estado}</option>
						                          <option value="1">En progreso</option>
						                          <option value="2">Esperando respuesta</option>
						                          <option value="3">Cerrado</option>
					                            </select>
					                          </p>
					                        </form></td>
						                    <td>&nbsp;</td>
						                    <td>&nbsp;</td>
					                      </tr>
						                  <tr>
						                    <td colspan="4" bgcolor="#B60044" class="meta"><strong>Detalle</strong></td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Ticket:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.idTicket}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Fecha Creacion:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.fechaCreacion}</td>
					                      </tr>
                                                              <!--    <tr>
						                    <td id="letrasTablas3">Area:</td>
						                    <td colspan="3" id="letrasTablas4">Jefatura de Ventas Presenciales</td>
					                      </tr> -->
						                  <tr>
						                    <td id="letrasTablas3">Tipo Solicitud:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.tipoSolicitud}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Categoria:</td>
						                    <td colspan="3" >${ticket.categoria}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Ultima actualizacion:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.fechaCierre}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Descripcion Breve:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.descripcion}</td>
					                      </tr>
                                                              <tr>
						                    <td id="letrasTablas3">Historial:</td>
						                    <td colspan="3" id="letrasTablas4"></td>
                                                              </tr>
						                  <tr>
						                    <td id="letrasTablas3">Comentario:</td>
						                    <td colspan="3"><form id="form9" method="post" action="">
						                      <p>
						                        <label for="txtDescrip"></label>
                                                                        <textarea cols="50" rows="2"  name="txtDescrip" id="txtDescrip"></textarea>
					                          </p>
					                        </form></td>
					                      </tr>
					                    </table>
                                                                </td>
		                </tr>
				                </table>
				          </blockquote>
			            </blockquote>
				          </blockquote>
				        </blockquote>
						  <form id="form1" method="post" action="Login">
						    <blockquote>
							    <blockquote>
							      <blockquote>
							        <blockquote>
							        							          <table width="200" border="0" align="center">
							            <tr>
							              <td width="60"><input name="1" type="reset" id="cmdCrear" value="Actualizar" /></td>
							              <td width="52">&nbsp;</td>
							              <td width="66"><input name="2" type="submit" id="cmdBorrar" value="Regresar a Bandeja" /></td>
						                </tr>
						              </table>
							        </blockquote>
							      </blockquote>
					          </blockquote>
							    <p>&nbsp;</p>
						    </blockquote>
					      </form>
						  <p>&nbsp;</p>
				      </div>
					</div>
					<div class="post">
						<p>&nbsp;</p>
						<h2 class="title"><br />
				      </h2>
				  </div>
					<div class="post">
					  <div class="entry"> </div>
					</div>
				</div>
				<div id="sidebar">
					<ul>
				<!--	  <li id="categories">
						<h2>Opciones de Tickets</h2>
						  <ul>
							  <li><a href="#">Mis tickets asignados </a>(4) </li>
							  <li><a href="#">Tckets pendientes del grupo</a> (1) </li>
							  <li><a href="#">Tickets cerrados del grupo(4) </a></li>
							  <li></li>
						  </ul>
					  </li> -->
						<li>
							<h2>Ayuda</h2>
							<ul>
								<li>I<a href="#">ntroducción</a></li>
								<li><a href="#">Caracteristicas</a></li>
								<li></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- end page -->
<!-- start footer -->
<div id="footer">
	<p id="legal">&nbsp;</p>
	<!-- end footer -->
</div>
</body>
</html>
