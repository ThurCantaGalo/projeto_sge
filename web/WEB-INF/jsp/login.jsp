<%-- 
    Document   : login
    Created on : 05/09/2024, 14:26:22
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Login</title>
    </head>
    <body>
        <style>
            h1{
                text-align: center;
            }
            
        </style>
        <h1>Login</h1>
        <form action="./login" method="post">
        <div class="form-floating mb-3">
  <input type="text" class="form-control" id="floatingInput" placeholder="CPF" name="cpf">
  <label for="floatingInput">CPF</label>
</div>
<div class="form-floating">
    <input type="password" class="form-control" id="floatingPassword" placeholder="Senha" name="senha">
  <label for="floatingPassword">Senha</label>
</div>
           
        <button type="submit" class="btn btn-primary">Logar</button>
        </form>
        
        <a href="./cadastrar">Cadastrar-se</a>  
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
