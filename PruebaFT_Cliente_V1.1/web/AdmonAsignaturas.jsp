<%--@elvariable id="asignatura" type="Modelo.Asignatura"--%>
<%--@elvariable id="asignaturas" type="java.util.List"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="servicios.Asignatura" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Administrar Estudiantes</title>
</head>
<body>
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
    <div class="card col-sm-4" style="height: fit-content; margin-right: 60px">
        <% if (request.getAttribute("tipoFormulario") == null) { %>
        <div class="card-body">
            <form action="Controlador?menu=AdmonAsignaturas" method="POST">
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Asignatura.getIdAsignatura()}" name="textID_asignatura" class="form-control" placeholder="ID Asignatura" autocomplete="off">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Asignatura.getNombre()}" name="textNombre" class="form-control" placeholder="Nombre" autocomplete="off">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Asignatura.getDepartamento()}" name="textDepartamento" class="form-control" placeholder="Departamento" autocomplete="off">
                </div>
                <div style="text-align: center; margin-top: 20px">
                    <button style="border: none; margin-right: 40px" class="btn btn-success" type="submit" name="accion" value="CREATE">CREAR</button>
                </div>
            </form>
        </div>
        <% } %>
        <% if (request.getAttribute("tipoFormulario") != null) { %>
            <div class="card-body">
            <form action="Controlador?menu=AdmonAsignaturas" method="POST">
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Asignatura.getIdAsignatura()}" name="textID_asignatura" class="form-control" placeholder="ID Asignatura" readonly>
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Asignatura.getNombre()}" name="textNombre" class="form-control" placeholder="Nombre">
                </div>
                <div class="form-group" style="margin-top: 20px">
                    <input type="text" value="${Asignatura.getDepartamento()}" name="textDepartamento" class="form-control" placeholder="Departamento">
                </div>
                <div style="text-align: center; margin-top: 20px">
                    <button style="border: none" class="btn btn-primary" type="submit" name="accion" value="UPDATE">ACTUALIZAR</button>
                </div>
            </form>
        </div>
        <% } %>
    </div>
    
    <div class="col-sm-7">
    <table class="table table-hover" style="margin-right: 50px">
        <thead>
            <th>ID Asignatura</th>
            <th>NOMBRE</th>
            <th>DEPARTAMENTO</th>
        </thead>
        <tbody>
            <c:forEach var="asig" items="${asignaturas}">
                <tr>
                    <td>${asig.idAsignatura}</td>
                    <td>${asig.nombre}</td>
                    <td>${asig.departamento}</td>
                    <td>
                        <form action="Controlador?menu=AdmonAsignaturas" method="POST">
                            <input type="hidden" name="menu" value="AdmonAsignaturas">
                            <input type="hidden" name="id" value="${asig.idAsignatura}">
                            <button style="border: none;" class="btn btn-warning" type="submit" name="accion" value="EDIT">EDITAR</button>
                            <!-- Botón de Eliminar -->
                            <button style="border: none;" class="btn btn-danger" type="button" onclick="setAsignaturaId('${asig.idAsignatura}')" data-bs-toggle="modal" data-bs-target="#eliminarAsignaturaModal">ELIMINAR</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

    <!-- Modal Reutilizable de Eliminar Asignatura -->
    <div class="modal fade" id="eliminarAsignaturaModal" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="eliminarAsignaturaModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="eliminarAsignaturaModalLabel">Desasignar Asignatura</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <p>¿Estás seguro de que deseas eliminar esta asignatura?</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                    <!-- Formulario dentro del modal -->
                    <form action="Controlador?menu=AdmonAsignaturas" method="POST">
                        <input type="hidden" name="menu" value="AdmonAsignaturas">
                        <input type="hidden" name="id" id="asignaturaId" value="">
                        <button style="border: none;" class="btn btn-danger" type="submit" name="accion" value="DELETE">CONFIRMAR</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    // JavaScript para establecer el ID de la asignatura seleccionada en el modal
    function setAsignaturaId(asignaturaId) {
        document.getElementById('asignaturaId').value = asignaturaId;
    }
</script>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>
