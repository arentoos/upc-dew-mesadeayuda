<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
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


 <script language="javascript" type="text/javascript">
//busca caracteres que no sean espacio en blanco en una cadena
function vacio(q) {
        for ( i = 0; i < q.length; i++ ) {
                if ( q.charAt(i) != " " ) {
                        return true
                }
        }
        return false
}
//valida que el campo no este vacio y no tenga solo espacios en blanco
function valida(F) {

        if( vacio(F.txtDescrip.value) == false  ) {
                alert("Introduzca Descripcion valida")
                return false
        } else {
               // alert("OK")
                //cambiar la linea siguiente por return true para que ejecute la accion del formulario
                return true
        }
}

</script>
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
	    <li><a href="Ayuda.jsp"><span>ayuda</span></a></li>
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
						    <h2 class="title">Detalle de Ticket del Cliente</h2>
</blockquote>
					  </blockquote>
					  <div class="entry">
					    <blockquote>
						      <blockquote>
                                                          <form id="form1" method="post" action="Login?login=${ticket.cliente.login}&clave=${ticket.cliente.clave}&operacion=crearComentario" onsubmit="return valida(this)">
						        <table width="481" border="1" cellpadding="0" cellspacing="0" class="post">
						              <tr>
						                <td colspan="2" align="center" bgcolor="#B60044" class="meta" ><strong>INFORMACION DEL USUARIO</strong></td>
				                  </tr>
						              <tr>
						                <td width="162" align="right" id="letrasTablas">Nombre completo:</td>
						                <td width="248">
						                  <p>
						                    <label for="listTipo"></label>
						                    <label for="txtnom"></label>
						                    <input name="txtnom" type="text" disabled="disabled" id="txtnom" value="${ticket.cliente.nombre}" />
						                  </p>
					                 </td>
					                  </tr>
						              <tr>
						                <td height="26" align="right"  id="letrasTablas">Email:</td>
						                <td>
						                  <p>
						                    <label for="listArea"></label>
						                    <label for="txtarea"></label>
						                    <input name="txtarea" type="text" disabled="disabled" id="txtarea" value="${ticket.cliente.email}" />
					                      </p>
					                    </td>
					                  </tr>
						              <tr>
						                <td height="26" align="right"  id="letrasTablas">Anexo:</td>
						                <td>
						                  <p>
						                    <label for="txtini"></label>
						                    <input name="txtini" type="text" disabled="disabled" id="txtini" value="${ticket.cliente.anexo}" />
					                      </p>
					                   </td>
				                  </tr>
						              <tr>
						                <td align="right" id="letrasTablas">Area</td>
						                <td>
						                  <p>
						                    <label for="txtfin"></label>
						                    <input name="txtfin" type="text" disabled="disabled" id="txtfin" value="${ticket.cliente.area}" />
					                      </p>
					                   </td>
					                  </tr>
						              <tr>
						                <td colspan="2" align="center" id="letrasTablas2"></td>
				                  </tr>
				                </table>
						        <table width="418" border="1" align="center" cellpadding="0" cellspacing="0">
						              <tr>
						                <td  ><table width="479" border="1" cellpadding="0" cellspacing="0" >
						                  <tr>
						                    <td colspan="4" bgcolor="#B60044" class="meta"><strong>Detalle</strong></td>
					                      </tr>
						                  <tr>
						                    <td width="65" id="letrasTablas3">Ticket:</td>
                                                                    <td width="404"  colspan="3" id="letrasTablas4"><input type="text" readonly="false" name="txtidTicket" id="txtidTicket" value="${ticket.idTicket}"/></td>

                                                                  </tr>
						                  <tr>
						                    <td id="letrasTablas3">Fecha de Creacion:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.fechaCreacion}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Area de Atencion:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.areaReportar}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Tipo de Solicitud:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.tipoSolicitud}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Categoria:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.categoria}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Ultima Actualizacion:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.fechaCierre}</td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Descripcion Breve:</td>
						                    <td colspan="3" id="letrasTablas4">${ticket.descripcion}</td>
					                      </tr> <tr>
						                    <td id="letrasTablas3">Historial:       </td>
                                                                    <td colspan="3" id="letrasTablas4">
    
    <c:forEach var="comentario" items="${ticket.comentarios}">

      
             ${comentario.fechaHora}  ;  ${comentario.idEmpleado.nombre} <BR>  Comentario:  ${comentario.texto} <BR>

      

    </c:forEach>


						                     </td>
					                      </tr>
						                  <tr>
						                    <td id="letrasTablas3">Comentarios</td>
						                    <td colspan="3">
						                      <p>
						                        <label for="txtDescrip"></label>
                                                <textarea cols="45" rows="2" name="txtDescrip" id="txtDescrip"></textarea>
                                                                      </p>

					                      </td>
                                                                    <tr><td id="letrasTablas3">Su solicitud fue Atendida</td>

                                                                        <td>
                                                                          <p>

						                       
                                                                              <select name="cmdConfirmar" id="cmdConfirmar" <c:if test="${ticket.estado!='Resuelto'}">disabled="disabled"</c:if> >
                                                                                  
                                                                            <option  value="Aceptar" >Aceptar</option>
                                                                            <option  value="Rechazar" >Rechazar</option>
                                                                            
                                                                        </select>
					                          </p>
                                                                        
                                                                        </td>

                                                                    </tr>
                                                                  
					                    </table></td>
		                
				                </table>
						            
				          </blockquote>
			            </blockquote>
				          </blockquote>
				        </blockquote>
						  
						    <blockquote>
							    <blockquote>
							      <blockquote>
							        <blockquote>
							  <table width="200" border="0" align="center">
							            <tr>
							              <td width="60"><input name="cmdCrear" type="submit" id="cmdCrear" value="Actualizar" /></td>
							              <td width="52">&nbsp;</td>
							              <td width="66"><input name="cmdcancel" type="button"  onclick="document.location='BandejaCliente.jsp'"  value="Regresar a Bandeja"/></td>
						                </tr>
						              </table>
                                                                    </form>
							        </blockquote>
							      </blockquote>
					          </blockquote>
							    <p>&nbsp;</p>
						    </blockquote>
					      
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
							  <li><a href="creaTicket.html">Crear Tickets </a></li>
							  <li><a href="#">Mis Ttickets Creados</a> (1) </li>
							  <li><a href="#">Mis tickets cerrados </a> (0)</li>
							  <li><a href="Encuesta.html">Encuesta(1) </a></li>
						  </ul>
					  </li> -->
						<li>
							<h2>Documentacion de ayuda</h2>
							<ul>
								<li>I<a href="#">Introducción</a></li>
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
