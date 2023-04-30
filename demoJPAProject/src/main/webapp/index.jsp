<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spring Data JPA</title>
</head>

<body>
    <h1>Spring Data JPA Demo</h1>
    <h2>Employee Management Application</h2>
    <hr>
    <form method="post" action="addEmp">
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
    <h3>Search Employee</h3>
    <form method="post" action="findEmp">
        <h3>
            Emp ID: <input type="number" name="eid" id=""><br>
            <input type="submit" value="SUBMIT">
            <input type="reset" value="RESET"><br>
        </h3>
    </form>
    <hr>
    <h3>Update Employee</h3>
    <form method="post" action="updateEmp">
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
    <h3>Delete Employee</h3>
    <form method="post" action="deleteEmp">
        <h3>
            Emp ID: <input type="number" name="eid" id=""><br>
            <input type="submit" value="SUBMIT">
            <input type="reset" value="RESET"><br>
        </h3>
    </form>
    <hr>
    <h3>Display All Employee</h3>
    <form method="post" action="displayAllEmp">
        <h3>
            <input type="submit" value="SUBMIT">
        </h3>
    </form>
    <hr>
    <h3>Find By Designation</h3>
    <form method="post" action="findByDesignation">
        <h3>
            Designation: <input type="text" name="designation" id=""><br>
            <input type="submit" value="SUBMIT">
            <input type="reset" value="RESET"><br>
        </h3>
    </form>
    <hr>
    <h3>Find By Age Greater Than</h3>
    <form method="post" action="findByAge">
        <h3>
            Age: <input type="number" name="age" id=""><br>
            <input type="submit" value="SUBMIT">
            <input type="reset" value="RESET"><br>
        </h3>
    </form>
    <h3>Find By Designation order by age</h3>
    <form method="post" action="findByDesignationSortAge">
        <h3>
            Designation: <input type="text" name="designation" id=""><br>
            <input type="submit" value="SUBMIT">
            <input type="reset" value="RESET"><br>
        </h3>
    </form>

</body>

</html>