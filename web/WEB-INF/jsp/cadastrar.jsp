<%-- 
    Document   : cadastrar
    Created on : 05/09/2024, 15:13:52
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro</h1>
        
        <div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Nome</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Nome" name="nome">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">Admissão</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="aa/mm/dd" name="admissao">
</div>
         <div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">CPF</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="CPF" name="cpf">
</div>
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">Senha</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Senha" name="senha">
</div>
         <select class="form-select" aria-label="Default select example" name="area">
  <option selected>Area</option>
  <option value="1">Exatas</option>
  <option value="2">Humanas</option>
  <option value="3">Biologicas</option>
</select>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
