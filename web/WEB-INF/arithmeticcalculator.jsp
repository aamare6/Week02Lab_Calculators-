
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="text" name="first" value="${firstNum}">
            <br>
            <label>Second: </label>
            <input type="text" name="second" value="${secondNum}">
            <br>
            <input type="submit" name="calc" value="+" />
            <input type="submit" name="calc" value="-" />
            <input type="submit" name="calc" value="*" />
            <input type="submit" name="calc" value="%" />
        </form>
        
        <div>${arithMessage}</div>
        <br>
        
        <div>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
