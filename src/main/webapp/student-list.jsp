<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
  <c:out value="${Students}"/>
    <div class="container">
        <table class="table">
            <thead>
              <tr>
                
                <th scope="col">First</th>
                <th scope="col">Last</th>
                <th scope="col">Handle</th>
              </tr>
            </thead>
            <tbody>
                <c:forEach var="student" items="${Students}">
                     <tr>                        
                        <td><c:out value="${student.getName}"/></td>
                        <td><c:out value="${student.getClg()}"/></td>
                        <td><c:out value="${student.getCls()}"/></td>
                    </tr> 
                </c:forEach>
              
              
            </tbody>
          </table>
    </div>
</body>
</html>