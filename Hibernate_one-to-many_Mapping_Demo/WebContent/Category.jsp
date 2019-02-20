<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
<style type="text/css">
.error
{
color:red;font-weight: bold;
}
</style>
</head>
<body>
  
          <form:form action="category"  commandName="catForm">
            <table>
               
                <tr>
                    <td>Category ID:</td>
                    <td><form:input path="catId"/></td>
                    <td><form:errors path="catId" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Category name:</td>
                    <td><form:input path="catName"/></td>
                     <td><form:errors path="catName" cssClass="error"/></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Add Category" /></td>
                </tr>
            </table>
        </form:form>

</body>
</html>