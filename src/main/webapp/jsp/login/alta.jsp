<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<!-- Para validar doble contraseÃ±a -->
<script type="text/javascript">

    function res() {
        var clave = document.getElementById('clave');
        var clave2 = document.getElementById('clave2');

        var resultado = document.getElementById('resultado');
      
         if (clave.value == clave2.value)
              resultado.innerHTML = "Correcto";
        else  
              resultado.innerHTML = "No es correcto";
        }
</script>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="generator" content="Hugo 0.88.1">
    <title>RegistroUsuario</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">

    

    <!-- Bootstrap core CSS -->
<link href="../../css/bootstrap.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="../../css/signin.css" rel="stylesheet">
  </head>
<body class="text-center">

    
<main class="form-signin">
  <%
	String mensaje = (String) request.getAttribute("mensaje");
	if(mensaje == null) {
		mensaje = "";
	}
%>

  <form  action="<%=request.getContextPath()%>/alta" method="post">
  
    
    <h1 id="iniciarSesion" class="h3 mb-3 fw-normal">REGISTRO USUARIO</h1>
    <img class="mb-4" src="../../css/iconslogin.png" alt="" width="72">

    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="Nombre" name="nombre">
      <label for="floatingInput">Nombre</label>
    </div>
    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="Primer Apellido" name="apellido1">
      <label for="floatingInput">Primer Apellido</label>
    </div>
    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="Segundo Apellido" name="apellido2">
      <label for="floatingInput">Segundo Apellido</label>
    </div>
     <div class="form-floating">
      <input type="email" class="form-control" id="floatingInput" placeholder="email" name="email">
      <label for="floatingInput">email</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Contraseñaa" name="clave">
      <label for="floatingPassword">Contraseña</label>
    </div>
     <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Repetir contraseña" name="clave2">
      <label for="floatingPassword">Repetir Contraseña</label>
    </div>

    <button id="enviar" class="w-100 btn btn-lg btn-primary" onclick="res()" type="submit">Registrar</button>
    <div id="resultado"></div>
    <p class="mt-5 mb-3 text-muted">&copy; Serbatic 2021</p>
  </form >

</main>
<%= mensaje %> 

    
  </body>
</html>