<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="Asignatura" type="Modelo.Asignatura"--%>
<%--@elvariable id="Estudiante" type="Modelo.Estudiante"--%>
<%--@elvariable id="listaAsignatura" type="java.util.List"--%>
<%--
  Created by IntelliJ IDEA.
  User: M
  Date: 22/01/2024
  Time: 8:31 p. m.
  To change this template use File | Settings | File Templates.
--%>
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
        <div class="col-sm-4"style="margin-right: 30px">
            <div class="card">
                <form action="Controlador?menu=Asignar_Asignaturas" method="POST">
                    <div class="card-body">
                        <div class="form-group">
                            <label>Datos del Estudiante</label>
                        </div>
                        <div class="form-group d-flex" style="margin-top: 10px">
                            <div class="col-sm-6 d-flex" style="margin-right: 20px">
                                <input type="text" name="id_estudiante" class="form-control" placeholder="ID">
                                <input type="submit" name="accion" value="BuscarEstudiante" class="btn btn-primary btn-sm">
                            </div>
                            <div class="col-sm-5">
                                <input type="text" name="nombreEstudiante" value="${Estudiante.nombre} ${Estudiante.apellido}" class="form-control" disabled>
                            </div>
                        </div>
                        <div class="form-group" style="margin-top: 20px;">
                            <label>Datos Asignatura</label>
                        </div>
                        <div class="form-group d-flex" style="margin-top: 10px">
                            <div class="col-sm-6 d-flex" style="margin-right: 20px">
                                <input type="text" name="id_asignatura" class="form-control" placeholder="ID">
                                <input type="submit" name="accion" value="BuscarAsignatura" class="btn btn-primary btn-sm">
                            </div>
                            <div class="col-sm-5">
                                <input type="text" name="nombreAsignatura" value="${Asignatura.nombre}" class="form-control" disabled>
                            </div>
                        </div>
                        <div style="margin-top: 20px; text-align: center">
                            <input type="submit" name="accion" value="Agregar" class="btn btn-outline-primary">
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <div class="col-sm-7">
            <div class="card">
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID ASIGNATURA</th>
                                <th>
                                    NOMBRE
                                    ASIGNATURA
                                </th>
                                <th>DEPARMENTO</th>
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
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="card-footer">
                    <div>
                        <form action="Controlador?menu=Asignar_Asignaturas" method="POST">
                            <input type="submit" name="accion" value="Matricular" class="btn btn-success">
                            <input type="submit" name="accion" value="Cancelar" class="btn btn-danger">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js" integrity="sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+" crossorigin="anonymous"></script>
</body>
</html>

