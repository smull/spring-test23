<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 31.03.2015
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<c:set var="content" value="${pageContext.request.contextPath}" />
<html>
<head>
    <title>UserRest page</title>
    <script src="http://code.jquery.com/jquery-1.11.1.js"></script>
    <script src="${content}/js/user.js"></script>
</head>
<body>

  <div>Get All Users</div>
  <button id="buttonGetAllUsers">Get All</button>


  <div>Get By ID</div>
  <div>Input ID</div>
  <input id="getById" type="text">
  <button id="buttonGetById">GET</button>




  <div>Create User</div>
  <div>ID user</div>
  <input id="id" name="id" type="text">
  <div>First Name User</div>
  <input id="firstName" name="firstName" type="text">
  <div>Last Name User</div>
  <input id="lastName" name="lastName" type="text">
  <div>Age User</div>
  <input id="age" name="age" type="text">
  <button id="buttonCreateUser">Create</button>


  <div>Delete User</div>
  <div>ID user</div>
  <input id="deleteId" type="text">
   <button id="buttonDeleteUser">Delete</button>


  <div>Update User</div>
  <div>ID user</div>
  <input id="updateId" type="text">
  <div>First Name User</div>
  <input id="updateFirstName" type="text">
  <div>Last Name User</div>
  <input id="updateLastName" type="text">
  <div>Age User</div>
  <input id="updateAge" type="text">
  <button id="buttonUpdateUser">Update</button>


  <div>Results</div>
  <div>ID user</div>
  <div id="idUser"></div>
  <div>First Name User</div>
  <div id="firstNameUser"></div>
  <div>Last Name User</div>
  <div id="lastNameUser"></div>
  <div>Age User</div>
  <div id="ageUser"></div>


  <div class="row">
    <div class="col-md-6">
      <h2>Table</h2>
      <table class="table table-striped">
        <thead>
        <tr>
          <th>ID User</th>
          <th>FirstName</th>
          <th>LastName</th>
          <th>Age</th>
        </tr>
        </thead>
        <tbody id="tbody">
        <tr>
          <td></td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
        </tbody>
      </table>
    </div>
    </div>

</body>
</html>
