<%-- 
    Document   : login
    Created on : 16 ago 2024, 10:48:09 p.m.
    Author     : grenn
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.titulo"/></title><%-- variable del archivo de propiedades "titulo" --%>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1><%-- Variable del archivo de propiedades "titulo" --%>
        <s:form action="validarUsuario"><%-- variable que refiere dentro de la clase ValidarUsuarioAction.java --%>
            <s:textfield key="form.usuario" name="usuario"/><%-- Referencia a la variable usuario en properties y al metodo en action --%>
            <s:password key="form.password" name="password"/><%-- Referencia a la variable password  en properties y al metodo en action --%>
            <s:submit  key="form.boton" name="submit"/><%--Variable del archivo de propiedades "boton" --%>
        </s:form>
        
    </body>
</html>
