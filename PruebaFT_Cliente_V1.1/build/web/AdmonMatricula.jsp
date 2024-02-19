<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="listaAsignatura" type="java.util.List"--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="servicios.Estudiante" %>
<%@ page import="servicios.Asignatura" %>
<%@ page import="servicios.AsignarMateria" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Asignar Asignaturas</title>
</head>
<body>
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
    <div class="col-sm-12">
        <div class="card">
            <div class="card-body">
                <form action="Controlador?menu=AdmonMatricula" method="POST">
                    <div class="d-flex col-sm-5 ml-auto">
                        <select name="tipoConsulta" class="form-select" aria-label="Default select example">
                                <option selected>Valor a Consultar</option>
                                <option value="Xestudiante">ID del Estudiante</option>
                                <option value="Xmateria">ID de la Materia</option>
                        </select>
                        <input type="text" name="id" class="form-control" placeholder="ID a consultar">
                        <input type="submit" name="accion" value="Consultar" class="btn btn-outline-info">
                    </div>
                </form>
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <th>ID ASIGNATURA</th>
                        <th>
                            NOMBRE
                            ASIGNATURA
                        </th>
                        <th>DEPARTAMENTO</th>
                        <th>ID ESTUDIANTE</th>
                        <th>NOMBRE ESTUDIANTE</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="dato" items="${listaAsignatura}">
                        <tr>
                            <td>${dato.getIDAsignatura()}</td>
                            <td>${dato.nombreAsignatura}</td>
                            <td>${dato.nombreDepartamento}</td>
                            <td>${dato.getIDEstudiante()}</td>
                            <td>${dato.nombreEstudiante} ${dato.apellidoEstudiante}</td>
                            <td>
                                <form action="Controlador?menu=AdmonMatricula" method="POST">
                                    <input type="hidden" name="menu" value="AdmonMatricula">
                                    <input type="hidden" name="id_estudiante" value="${dato.getIDEstudiante()}">
                                    <input type="hidden" name="id_asignatura" value="${dato.getIDAsignatura()}">
                                    <button style="border: none;margin-top: 10px;" class="btn btn-danger" type="button" data-bs-toggle="modal" data-bs-target="#staticBackdrop">DESASIGNAR</button>
                                 </form>
                            </td>
                        </tr>
                        <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="staticBackdropLabel">Desasignar Materia</h5>
                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <p>¿Esta seguro de realizar esta operación?</p>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                                        <form action="Controlador?menu=AdmonMatricula" method="POST">
                                            <input type="hidden" name="menu" value="AdmonMatricula">
                                            <input type="hidden" name="id_estudiante" value="${dato.getIDEstudiante()}">
                                            <input type="hidden" name="id_asignatura" value="${dato.getIDAsignatura()}">
                                            <button style="border: none;" class="btn btn-danger" type="submit" name="accion" value="DELETE">DESASIGNAR</button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>