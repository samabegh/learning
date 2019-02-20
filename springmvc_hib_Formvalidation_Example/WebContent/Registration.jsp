<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
  
          <form:form action="student"  commandName="StudentForm">
            <table>
               
                <tr>
                    <td>Student Name:</td>
                    <td><form:input path="StudentName"/></td>
                    <td><form:errors path="StudentName"/></td>
                </tr>
                <tr>
                    <td>Student Address:</td>
                    <td><form:input path="StudentAddress"/></td>
                     <td><form:errors path="StudentAddress"/></td>
                </tr>
               
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>

</body>
</html>