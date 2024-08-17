<%-- 
    Document   : bienvenido
    Created on : 16 ago 2024, 10:48:15 p.m.
    Author     : grenn
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="bienvenido.titulo"/></title><%--Variable properties titulo --%>
    </head>
    <body>
        <h1><s:text name="bienvenido.titulo"/></h1><%-- Variable properties titulo--%>
        <h2><s:text name="bienvenido.mensaje"/></h2><%-- Variable properties mensaje--%>
        <br/>
        <s:text name="form.usuario"/><s:property value="usuario"/><%-- Variable properties usuario--%>
        <s:text name="form.password"/><s:property value="password"/><%-- Variable properties password--%>
        <br/>
        <%-- Variable properties "Regresar" que redirige a la variable dentro de la clase LoginAction.java para mostrar el login.jsp--%>
        <a href="<s:url action="login"/>"><s:text name="bienvenido.regresar"/></a>
    </body>
</html>
