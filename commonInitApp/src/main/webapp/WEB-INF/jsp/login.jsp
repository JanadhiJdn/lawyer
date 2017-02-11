<%-- 
    Document   : login
    Created on : Feb 11, 2017, 1:12:52 PM
    Author     : Janadhi Nanayakkara
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset='utf-8' />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="<c:url value='/assets/bootstrap/css/bootstrap.min.css'/>">
        <link rel="stylesheet" href="<c:url value='/assets/css/login_css.css'/>">
        <link rel="stylesheet" href="<c:url value='/assets/bootstrap/fonts/font-awesome.min.css'/>">
        <title>Login</title>
    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header"></div>
                <div class="collapse navbar-collapse" id="navcol-1">
                    <ul class="nav navbar-nav"></ul>
                </div>
            </div>
        </nav>    
        <div class="container">
            <div class="row product">

                <div class="col-md-6 col-md-offset-3" id="div-middle">
                    <div class="panel panel-default">
                        <div class="panel-heading" style="background-color: #32c6a6; color: #ffffff; height: 60px">                        
                            <h3 class="panel-title" align="center" style="font-size: 36px">LOGIN</h3>
                        </div>
                        <div class="panel-body">                                               
                            <div class="form-group">
                                <label>User Name</label>                             
                                <input id="user_name" type="text" placeholder="Enter User Name " class="form-control input-md">                            
                            </div>
                            <div class="form-group">
                                <label>Password</label>                             
                                <input id="password" type="password" placeholder="Enter Password " class="form-control input-md">                            
                            </div>                        
                            <input type="submit" id="btn-signUp" class="btn btn-block btn-success" value="Log in" style="background-color: #03719C"><br>
                            <label style="font-weight: 400">Forgot password? <a href="">Click here</a></label>  <br>    
                            <label style="font-weight: 400">Create New Account?  <a href="<c:url value='signup'/>" style="color: green">Sign Up</a></label>                       
                        </div>

                    </div>
                </div> 

            </div>
        </div> 
    </body>
</html>
