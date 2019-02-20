<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>NOBS Technologies</h2>
        <table border="0" width="90%">
        <center>
        <form:form action="loginPage" commandName="LFBO" >
                <tr>
                    <td align="left" width="20%">User Name: </td>
                    <td align="left" width="40%"><form:input path="uname" size="30"/></td>
                   <!-- <td align="left"><form:errors path="uname" cssClass="error"/></td> --> 
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><form:password path="pwd" size="30"/></td>
                   <!--  <td><form:errors path="pwd" cssClass="error"/></td> --> 
                </tr>
                <tr>
                    <td></td>
                    <td align="center"><input type="submit" value="Login"/></td>
                    <td></td>
                </tr>
        </form:form>
        </center>
        </table>
    </div>
</body>
</html>