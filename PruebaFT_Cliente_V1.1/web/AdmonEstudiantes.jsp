<%@page import="java.util.List"%>
<%@page import="servicios.Estudiante"%>
<%@page import="Modelo.EstudianteService"%>
<%--@elvariable id="estudiantes" type="java.util.List"--%>
<%--@elvariable id="listaPaises" type="java.util.List"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Administrar Estudiantes</title>
</head>
<body>
<%-- Verificar si existe un error --%>
<% if (request.getAttribute("error") != null) { %>
<div class="alert alert-danger alert-dismissible fade show" role="alert">
    <strong>Error!</strong> <%= request.getAttribute("error") %>
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<% } %>

<% if (request.getAttribute("operacion") != null) { %>
<div class="alert alert-success alert-dismissible fade show" role="alert">   
    <div>
        <svg xmlns="http://www.w3.org/2000/svg" class="bi bi-check-circle-fill flex-shrink-0" viewBox="0 0 16 16" role="img" aria-label="Warning:" width="20" height="20">
            <path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
        </svg>
        <%= request.getAttribute("operacion") %>
    </div>
    <button type="button" class="btn-close float-end" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<% } %>
<div class="d-flex">
    <div class="card col-sm-3" style="height: fit-content; margin-right: 40px">
        <% if (request.getAttribute("tipoFormulario") == null) { %>
            <div class="card-body">
            <form action="Controlador?menu=AdmonEstudiantes" method="POST">
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getIDEstudiante()}" name="textID_estudiante" class="form-control" placeholder="ID Estudiante" autocomplete="off">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getNombre()}" name="textNombre" class="form-control" placeholder="Nombre" autocomplete="off">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getApellido()}" name="textApellido" class="form-control" placeholder="Apellido" autocomplete="off">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getTelefono()}" name="textTelefono" class="form-control" placeholder="Telefono" autocomplete="off">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <select name="paisSeleccionado" class="form-select" aria-label="Default select example">
                        <option selected>Seleccione un pais</option>
                         <c:forEach var="Email" items="${listaPaises}">
                            <option value="${Email}">${Email}</option>
                        </c:forEach>
                    </select>
                </div>
                <div style="text-align: center; margin-top: 20px">
                    <button style="border: none; margin-right: 40px" class="btn btn-success" type="submit" name="accion" value="CREATE">CREAR</button>
                </div>
            </form>
        </div>
        <%}%>
        <% if (request.getAttribute("tipoFormulario") != null) { %>
            <div class="card-body">
            <form action="Controlador?menu=AdmonEstudiantes" method="POST">
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getIDEstudiante()}" name="textID_estudiante" class="form-control" placeholder="ID Estudiante" readonly>
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getNombre()}" name="textNombre" class="form-control" placeholder="Nombre" autofocus>
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getApellido()}" name="textApellido" class="form-control" placeholder="Apellido">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getTelefono()}" name="textTelefono" class="form-control" placeholder="Telefono">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Estudiante.getEmail()}" name="textTelefono" class="form-control" placeholder="Telefono" disabled>
                </div>
                <div style="text-align: center; margin-top: 20px">
                    <button style="border: none" class="btn btn-primary" type="submit" name="accion" value="UPDATE">ACTUALIZAR</button>
                </div>
            </form>
        </div>
        <%}%>
    </div>
    <div style="margin-right: 20px" class="col-sm-8">
        <table class="table table-hover">
    <thead>
        <th>IDENTIFICACIÓN</th>
        <th>NOMBRE</th>
        <th>APELLIDO</th>
        <th>TELEFONO</th>
        <th>EMAIL</th>
    </thead>
    <% 
        EstudianteService estudiante = new EstudianteService();
        List<Estudiante> lista = estudiante.read();
        for(Estudiante e: lista){
    %>
    <tr>
        <td> <%= e.getIDEstudiante()%> </td>
        <td> <%= e.getNombre()%> </td>
        <td> <%= e.getApellido()%> </td>
        <td> <%= e.getEmail()%> </td>
        <td> <%= e.getTelefono()%> </td>
        <td> 
            <form action="Controlador?menu=AdmonEstudiantes" method="POST">
                <input type="hidden" name="menu" value="AdmonEstudiantes">
                <input type="hidden" name="id" value="<%= e.getIDEstudiante()%>">
                <button style="border: none;" class="btn btn-warning" type="submit" name="accion" value="EDIT">EDITAR</button>
                <!-- Botón de Eliminar -->
                <button style="border: none;" class="btn btn-danger" type="button" onclick="setEstudianteId(<%= e.getIDEstudiante()%>)" data-bs-toggle="modal" data-bs-target="#eliminarEstudianteModal">ELIMINAR</button>       
            </form>
        </td>
    </tr>
    <%}%>
</table>

<!-- Modal Reutilizable de Eliminar Estudiante -->
<div class="modal fade" id="eliminarEstudianteModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="eliminarEstudianteModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="eliminarEstudianteModalLabel">Desasignar Estudiante</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <p>¿Estás seguro de que deseas eliminar este estudiante?</p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                <!-- Formulario dentro del modal -->
                <form action="Controlador?menu=AdmonEstudiantes" method="POST">
                    <input type="hidden" name="menu" value="AdmonEstudiantes">
                    <input type="hidden" name="id" id="estudianteId" value="">
                    <button style="border: none;" class="btn btn-danger" type="submit" name="accion" value="DELETE">CONFIRMAR</button>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
    // JavaScript para establecer el ID del estudiante seleccionado en el modal
    function setEstudianteId(estudianteId) {
        document.getElementById('estudianteId').value = estudianteId;
    }
</script>
    </div>
</div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>