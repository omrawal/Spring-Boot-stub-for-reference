<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring Data JPA</title>
</head>

<body>
    <h1>Spring Data JPA REST Demo</h1>
    <h2>Employee Management Application</h2>
    <hr>
    <form method="post" action="/employee">
        <h3>
            Emp ID: <input type="number" name="eid" id=""><br>
            Name: <input type="text" name="ename" id=""><br>
            Age: <input type="number" name="age" id=""><br>
            Salary: <input type="number" name="salary" id=""><br>
            Designation: <input type="text" name="designation" id=""><br>
            <input type="submit" value="SUBMIT">
            <input type="reset" value="RESET"><br>
        </h3>
    </form>
    <hr>
</body>

</html>