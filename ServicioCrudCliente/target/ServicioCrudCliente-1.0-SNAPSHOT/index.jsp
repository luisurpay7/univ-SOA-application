<%-- 
    Document   : index
    Created on : Jun 19, 2022, 7:19:26 PM
    Author     : lurpays
--%>

<%@page import="test.User"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        
        <title>Sistemas distribuidos G4</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="card">
                <div class="card-header">
                    <a class="btn btn-primary">Nuevo Usuario</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRES</th>
                                <th>APELLIDOS</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <body>
                            <%
                            UserService user = new UserService();
                            List<User> datos = user.listar();
                            for(User u:datos){
                                %>
                            <tr>
                                <td><%= u.getId()%></td>
                                <td><%= u.getFname()%></td>
                                <td><%= u.getLname()%></td>
                                <td>
                                    <a class="btn btn-warning">Edit</a>
                                    <a class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                                
                            <%
                            }
                            %>
                        </body>

                    </table>
                    
                </div>
                
            </div>
        </div>
        
        
        
        
    </body>
</html>
