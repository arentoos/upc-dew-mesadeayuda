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
	    <li><a href=="#"><span>inicio</span></a></li>
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
						<p class="date">set<b>22</b></p>
				    <blockquote>
						  <blockquote>
						    <h2 class="title">Bandeja de Tickets</h2>
</blockquote>
					  </blockquote>
					  <div class="entry">
					    <blockquote>
					      <blockquote>
					        <table width="480" border="1" cellpadding="0" cellspacing="0" class="post">
				              <tr>
						                <td colspan="2" align="center" bgcolor="#B60044" class="meta" >&nbsp;</td>
				                  </tr>
						              <tr>
						                <td width="171" align="right" id="letrasTablas">Tipo de solicitud:</td>
						                <td width="267"><form id="form2" method="post" action="">
						                  <p>
						                    <label for="listTipo"></label>
						                    <select name="listArea2" id="listArea2">
						                      <option value="0" selected="selected">Todos</option>
					                          <option value="1">Incidencias/Averias</option>
					                          <option value="2">Requerimiento</option>
					                          <option value="3">Consultas</option>
				                            </select>
						                  </p>
					                    </form></td>
					                  </tr>
						              <tr>
						                <td height="26" align="right"  id="letrasTablas">Persona de Soporte</td>
                                                                <td height="26" align="left"  id="letrasTablas">${empleado.nombre}</td>
					                  </tr>
						              <tr>
						                <td colspan="2" align="center" id="letrasTablas2"><form id="form12" method="post" action="">
						                  <p>
						                    <input type="submit" name="cmdActualizar" id="cmdActualizar" value="Actualizar" />
					                      </p>
					                    </form></td>
				                  </tr>
				                </table>
                                                                        <div><span id="lineaSepara"><table width="480" border="1" align="center" cellpadding="0" cellspacing="0">
                                        <tr>
                                          <td width="413" bgcolor="#B60044"> <strong class="meta">Informacion del Ticket</strong></td>
                                     </tr>
                                    </table></span></div>
                                   
<table width="480" border="1" align="center" cellpadding="0" cellspacing="0">
						              <tr>
						                <td  ><table width="480" border="1" cellpadding="0" cellspacing="0">
						                  <tr>
						                    <td width="28" align="center" id="letrasTablas2">ID</td>
						                    <td width="57" align="center" id="letrasTablas2">Tipo</td>
						                    <td width="66" align="center" id="letrasTablas2">Persona de Soporte</td>
						                    <td width="56" align="center" id="letrasTablas2">Descripción</td>
						                    <td width="47" align="center" id="letrasTablas2">Usuario</td>
						                    <td width="62" align="center" id="letrasTablas2">Fecha Creacion</td>
						                    <td width="28" align="center" id="letrasTablas2">Fecha Cierre</td>
						                    <td width="89" align="center" id="letrasTablas2">Estado</td>
					                      </tr>
						                  
					                    </table></td>
		                </tr>
				                </table>
						        <table border="2" width="480" cellpadding="0" cellspacing="0" >
    <tr>
                <td width="28" align="center" id="letrasTablas">ID</td>
                <td width="57" align="center" id="letrasTablas">Tipo</td>
                <td width="66" align="center" id="letrasTablas">Persona de Soporte</td>
                <td width="56" align="center" id="letrasTablas">Descripcion</td>
                <td width="47" align="center" id="letrasTablas">Usuario</td>
                <td width="62" align="center" id="letrasTablas">Fecha Creacion</td>
                <td width="28" align="center" id="letrasTablas">Fecha Cierre</td>
                <td width="89" align="center" id="letrasTablas">Estado</td>
</tr>
    <c:forEach var="ticket" items="${empleado.tickets}">

        <tr>
            <td><a href="BandejaSoporte?idticket=${ticket.idTicket}" >${ticket.idTicket}</a></td>
            <td> ${ticket.tipoSolicitud}<br/></td>
            <td> ${ticket.tecnico.nombre}</td>
            <td> ${ticket.descripcion}</td>
            <td> ${ticket.cliente.nombre}<br/></td>
            <td> ${ticket.fechaCreacion}</td>
            <td> ${ticket.fechaCierre}<br/></td>
            <td> ${ticket.estado}<br/></td>
        </tr>

    </c:forEach>

 </table>
				          </blockquote>
			            </blockquote>
				          </blockquote>
				        </blockquote>
						
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
						<h2>Opciones de Tickets</h2>
						  <ul>
							  <li><a href="#">Mis tickets asignados </a>(4) </li>
							  <li><a href="#">Tckets pendientes del grupo</a> (1) </li>
							  <li><a href="#">Tickets cerrados del grupo(4) </a></li>
							  <li></li>
						  </ul>
					  </li>
						<li>
							<h2>documentacion de ayuda</h2>
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
