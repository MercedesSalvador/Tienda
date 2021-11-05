<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="generator" content="Hugo 0.88.1">
    <title>Login</title>

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
  <form  action="<%=request.getContextPath()%>/Login" method="post">
  
    
    <h1 id="iniciarSesion" class="h3 mb-3 fw-normal">INICIAR SESIÓN</h1>
    <img class="mb-4" src="../../css/iconslogin.png" alt="" width="72">

    <div class="form-floating">
      <input type="text" class="form-control" id="floatingInput" placeholder="Nombre" name="nombre">
      <label for="floatingInput">Nombre</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" placeholder="Contraseña" name="clave">
      <label for="floatingPassword">Contraseña</label>
    </div>

    <button id="enviar" class="w-100 btn btn-lg btn-primary" type="submit">Enviar</button>
    <p class="mt-5 mb-3 text-muted">&copy; Serbatic 2021</p>
    
    <p><%=mensaje%> </p>
  </form >

</main>

   
  </body>
</html>