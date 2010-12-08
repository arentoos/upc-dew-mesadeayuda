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

        if( vacio(F.txtdescripcion.value) == false  ) {
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
						<p class="date">Dic<b>10</b></p>
				    <blockquote>
						  <blockquote>
						    <h2 class="title">Creación de  ticket</h2>
</blockquote>
					  </blockquote>
					  <div class="entry">
					    <blockquote>
						      <blockquote>
                                                          <form id="form1" method="post" action="Login?login=${empleado.login}&clave=${empleado.clave}&operacion=crearTicket" onsubmit="return valida(this)">
						        <table width="500" border="1" cellpadding="0" cellspacing="0" class="post">
						              <tr>
						                <td colspan="4" align="center" bgcolor="#B60044" class="meta" ><strong>DATOS DEL CLIENTE</strong></td>
				                  </tr>
						              <tr>
						                <td width="100" align="right" id="letrasTablas">Cliente:</td>
						                <td width="200">
						                  <p>
						                    <input name="txtusu" type="text" disabled="disabled" id="txtusu" value="${empleado.nombre}" />
					                      </p>
					                    </td>
						                <td width="47" align="right" id="letrasTablas">Email:</td>
						                <td width="144">
						                  <p>
						                    <label for="txtEmail"></label>
						                    <input name="txtEmail" type="text" disabled="disabled" id="txtEmail" value="${empleado.email}" />
					                      </p>
					                    </td>
					                  </tr>
						              <tr>
						                <td height="26" align="right"  id="letrasTablas">Area:</td>
						                <td>
						                  <p>						                    <label for="listArea"></label>
						                    <label for="txtarea"></label>
						                    <input name="txtarea" type="text" disabled="disabled" id="txtarea" value="${empleado.area}" />
					                      </p>
					                    </td>
						                <td align="right" id="letrasTablas">Anexo:</td>
						                <td>
						                  <p>
						                    <label for="txtanexo"></label>
						                    <input name="txtanexo" type="text" disabled="disabled" id="txtanexo" value="${empleado.anexo}" />
					                      </p>
					                   </td>
					                  </tr>
						              <tr>
						                <td>&nbsp;</td>
						                <td>&nbsp;</td>
						                <td>&nbsp;</td>
						                <td>&nbsp;</td>
					                  </tr>
				                </table>
                                                                        <div><span id="lineaSepara"><table width="500" border="1" align="center" cellpadding="0" cellspacing="0">
                                        <tr>
                                            <td colspan="4" align="center" class="meta"> <strong>Informacion del Ticket</strong></td>
                                     </tr>
                                    </table></span></div>

<table width="500" border="1" align="center" cellpadding="0" cellspacing="0">
						              <tr>
						                <td  width="90" align="right" id="letrasTablas"> Asunto:</td>
						                <td width="500">
						                  <p>
						                    <label for="listArea"></label>
						                    <select name="listArea" id="listArea">
						                      <option value="8">Incidencias</option>
						                      <option value="9">Requerimientos</option>
						                      <option value="10">Consultas</option>
                                            </select>
					                      </p>
					                    </td>
	                    </tr>
						              <tr>
						                <td align="right" id="letrasTablas">Area:</td>
						                <td>
						                  <p>
						                    <label for="listCategoria"></label>
						                    <select name="listCategoria" id="listCategoria">
						                      <option value="12">Soporte Tecnologico</option>
						                      <option value="11">Desarrollo de Software</option>
						                      <option value="13">Redes y Comunicaciones</option>
                                            </select>
					                      </p>
					                   </td>
					                  </tr>
						              <tr>
						                <td align="right" id="letrasTablas">Categoria:</td>
						                <td>
						                  <p>
						                    <label for="listCategoria"></label>
						                    <select name="listCategoria2" id="listCategoria" >
						                      <option value="15">Hardware</option>
						                      <option value="16">Software</option>
                                                                      <option value="17">Plataforma </option>

					                        </select>
					                      </p>
					                   </td>
		                </tr>
						              <tr>
						                <td align="right" id="letrasTablas">Descripcion:</td>
                                                                <td>
						                  <p>
                                                                      <label  for="txtdescripcion"> </label>
                                                                      <textarea cols="50" rows="6" name="txtdescripcion" id="txtdescripcion"></textarea>
						                  </p>
					                    </td>
		                </tr>
						              <tr>
						         
		                </tr>
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
							              <td width="60"><input name="cmdCrear" type="submit" id="cmdCrear" value="Crear ticket" /></td>
							              <td width="52">&nbsp;</td>
							          <!--    <td width="66"><input name="cmdBorrar" type="submit" id="cmdBorrar" value="Borrar" /></td> -->
                                                                      <td width="66"><input name="cmdcancel" type="button"  onclick="document.location='BandejaCliente.jsp'"  value="Regresar a Bandeja"/></td>
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
					  <li id="categories">
						<!--<h2>Opciones de Tickets</h2>
						 // <ul>
							  <li><a href="#">Crear Tickets(1) </a></li>
							  <li><a href="DetalleTicket_cliente.html">Mis tickets creados </a>(1) </li>
							  <li><a href="#">Mis tickets cerrados </a> (1) </li>
							  <li><a href="Encuesta.html">Encuesta(1) </a></li>
							  <li></li>
						  </ul>
      --->
					  </li>
						<li>
							<h2>Documentación de ayuda</h2>
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
