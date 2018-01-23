   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Survey Index</title>
</head>
<body>
  <h1>DojoSurvey</h1>
  <form action="/login" method="post">

      <h4>Your Name: <input type="text" name="name" value=""></h4>
      <h4>Dojo Location:
          <select name="dojolocation">
              <option>Dallas</option>
              <option>DC</option>
              <option>Seattle</option>
              <option>Los Angeles</option>
              <option>Chicago<option> 
              <option>Tulsa<option>
              <option>Silicon Valley<option>
          </select>
      </h4>
      <h4>Favorite Language: <select name="favlang">
          <option>Java Script</option>
          <option>PHP</option>
          <option>Java</option>
          <option>Python<option>
          <option>Ruby<option>
      </select></h4>
      <h4>Comment (optional)</h4>
      <textarea name="text_field" placeholder="text" rows="4" cols="50"></textarea><br>
      <input type="submit" value="Submit">
  </form>

</body>
</html>