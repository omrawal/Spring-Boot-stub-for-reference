<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
</head>
<body>
    <h1>This is welcome page</h1>
    <h2>Welcome! <%= request.getParameter("user") %></h2>
    <h2>Welcome! <%= session.getAttribute("fullname") %></h2>
    ${user}
</body>
</html>