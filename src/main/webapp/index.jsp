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

<% out.print("This is  scriptlet tag");%></br>
<%= "This is Expression tag"%>
<p>Current Time: <%= java.util.Calendar.getInstance().getTime() %></p></br>
<%!
String str="This is expression tag";
int cube(int n){
return n*n*n;
}
%>
<%= "Cube of 3 is : "+cube(3) %>
<%= str %>
  <div class="container">
    <a href="/HelloMaven/homepage">List Students</a>
  </div>
    <div class="container">
    <form action="/HelloMaven/homepage" method="post">
      <div class="form-group">
        <label for="name">Student Name:</label>
        <input type="text" class="form-control" name="name">
      </div>
      <div class="form-group">
        <label for="clg">College:</label>
        <input type="text" class="form-control" name="clg">
      </div>
          <div class="form-group">
            <label for="cls">Standard:</label>
            <input type="text" class="form-control" name="cls">
          </div>
      <button type="submit" class="btn btn-default">Submit</button>
    </form>

    </div>
</body>
</html>