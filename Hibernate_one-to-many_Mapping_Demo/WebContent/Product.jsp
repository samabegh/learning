<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <form:form action="productchk" method="post" commandName="prodForm">
            <table>
             <tr>
                    <td>Category ID:</td>
                    <td><form:input path="catId"/></td>
                    <td><form:errors path="catId"/></td>
             </tr>
            
               
                <tr>
                    <td>Product ID:</td>
                    <td><form:input path="prod_id"/></td>
                    <td><form:errors path="prod_id"/></td>
                </tr>
                <tr>
                    <td>Product name:</td>
                    <td><form:input path="prod_Name"/></td>
                     <td><form:errors path="prod_id"/></td>
                </tr>
                <tr>
                <td>Product Price</td>
                <td><form:input path="prod_price"/></td>
                <td><form:errors path="prod_price"/>
                </tr>
                 <tr>
                    <td colspan="2" align="center"><input type="submit" value="Add Product" /></td>
                </tr>
                </table>
                </form:form>


</body>
</html>