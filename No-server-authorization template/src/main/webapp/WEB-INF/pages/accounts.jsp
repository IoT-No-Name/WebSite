<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page session="true"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html >
   <head>
      <meta charset="UTF-8">
      <title>Registration Form</title>
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">
      <link rel="stylesheet" href="resources/account.css">
      <link rel="stylesheet" href="resources/bootstrap.min.css">
      <!-- jQuery library -->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
      <!-- Latest compiled JavaScript -->
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
   </head>
   <body>
      <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600' rel='stylesheet' type='text/css'>
      <link href="http://netdna.bootstrapcdn.com/font-awesome/3.1.1/css/font-awesome.css" rel="stylesheet">
      <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet">
         <form:form commandName="USER">
      <div class="container">
         <div class="row">
            <div class="col-md-offset-2 col-md-8 col-lg-offset-3 col-lg-6">
               <div class="well profile">
                  <div class="col-sm-12">
                     <div class="col-xs-12 col-sm-8">
                        <h2>Nicole Pearson</h2>
                        <p><strong>About: </strong> Web Designer / UI. </p>
                        <p><strong>Hobbies: </strong> Read, out with friends, listen to music, draw and learn new things. </p>
                        <p><strong>Skills: </strong>
                           <br>
                           Name : ${USER.name}.<br>
                           <span class="tags"></span>
                           <span class="tags">css3</span>
                           <span class="tags">jquery</span>
                           <span class="tags">bootstrap3</span>
                        </p>
                     </div>
                     <div class="col-xs-12 col-sm-4 text-center">
                        <figure>
                           <img src="http://www.localcrimenews.com/wp-content/uploads/2013/07/default-user-icon-profile.png" alt="" class="img-circle img-responsive">
                           <figcaption class="ratings">
                              <p>Ratings
                                 <a href="#">
                                 <span class="fa fa-star"></span>
                                 </a>
                                 <a href="#">
                                 <span class="fa fa-star"></span>
                                 </a>
                                 <a href="#">
                                 <span class="fa fa-star"></span>
                                 </a>
                                 <a href="#">
                                 <span class="fa fa-star"></span>
                                 </a>
                                 <a href="#">
                                 <span class="fa fa-star-o"></span>
                                 </a>
                              </p>
                           </figcaption>
                        </figure>
                     </div>
                  </div>
                  <div class="col-xs-12 divider text-center">
                     <div class="col-xs-12 col-sm-4 emphasis">
                        <h2><strong> 20,7K </strong></h2>
                        <p><small>Followers</small></p>
                        <button class="btn btn-success btn-block"><span class="fa fa-plus-circle"></span> Follow </button>
                     </div>
                     <div class="col-xs-12 col-sm-4 emphasis">
                        <h2><strong>245</strong></h2>
                        <p><small>Following</small></p>
                        <button class="btn btn-info btn-block"><span class="fa fa-user"></span> View Profile </button>
                     </div>
                     <div class="col-xs-12 col-sm-4 emphasis">
                        <h2><strong>43</strong></h2>
                        <p><small>Snippets</small></p>
                        <div class="btn-group dropup btn-block">
                           <button type="button" class="btn btn-primary"><span class="fa fa-gear"></span> Options </button>
                           <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
                           <span class="caret"></span>
                           <span class="sr-only">Toggle Dropdown</span>
                           </button>
                           <ul class="dropdown-menu text-left" role="menu">
                              <li><a href="#"><span class="fa fa-envelope pull-right"></span> Send an email </a></li>
                              <li><a href="#"><span class="fa fa-list pull-right"></span> Add or remove from a list  </a></li>
                              <li class="divider"></li>
                              <li><a href="#"><span class="fa fa-warning pull-right"></span>Report this user for spam</a></li>
                              <li class="divider"></li>
                              <li><a href="#" class="btn disabled" role="button"> Unfollow </a></li>
                           </ul>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      </div>
      </form:form>
</html>