<%-- 
    Document   : signup
    Created on : Feb 10, 2017, 6:48:15 PM
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
        <link rel="stylesheet" href="<c:url value='/assets/css/signUp_css.css'/>">
        <link rel="stylesheet" href="<c:url value='/assets/bootstrap/fonts/font-awesome.min.css'/>">
        <title>Sign Up</title>

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
                            <h3 class="panel-title" align="center" style="font-size: 36px">SIGN UP</h3>
                        </div>
                        <div class="panel-body">  
                            <form id="addLawyer" action="${pageContext.servletContext.contextPath}/lawyer/add" method="POST">
                                <div class="form-group">
                                    <label>First Name</label>                             
                                    <input id="first_name" type="text" name="first_name" placeholder="Enter First Name " class="form-control input-md">                            
                                </div>
                                <div class="form-group">
                                    <label>Last Name</label>                             
                                    <input id="last_name" type="text" name="last_name" placeholder="Enter Last Name " class="form-control input-md">                            
                                </div>
                                <div class="form-group">
                                    <label>Mobile</label>                             
                                    <input id="mobile" type="text" name="mobile" placeholder="Enter Mobile number " class="form-control input-md">                            
                                </div>
                                <div class="form-group">
                                    <label>User Name</label>                             
                                    <input id="user_name" type="text" name="user_name" placeholder="Enter User Name " class="form-control input-md">                            
                                </div>
                                <div class="form-group">
                                    <label>Password</label>                             
                                    <input id="pw" type="password" name="pw" placeholder="Enter Password " class="form-control input-md">                            
                                </div>
                                <div class="form-group">
                                    <label>Confirm Password</label>                             
                                    <input id="confirm_pw" type="password" name="confirm_pw" placeholder="Confirm password " class="form-control input-md">                            
                                </div>
                                <input type="submit" id="btn-signUp" class="btn btn-block btn-success" value="Create My Account" style="background-color: #03719C">
                            </form>
                        </div>
                    </div>
                </div> 
            </div>
        </div>        
    </body>
</html>

