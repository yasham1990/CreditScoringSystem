<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Admin Home Page</title>

<link href="/WebApplication7/admincss/Admin.css" rel="stylesheet" type="text/css"/>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>
<body>


<div id="templatemo_banner_wrapper">

	<div id="templatemo_banner">
    <p><img src="/WebApplication7/adminimages/banner.jpg"  alt="banner" height="100"/> </p>
    	<h2>SAHARA BANK</h2>
     
    </div> <!-- end of templatemo_banner -->
    
</div> 
<div id="templatemo_content_wrapper">

	<div id="templatemo_content">
            	
      <div class="section_w960_p15">
        
        	<div class="box margin_r_15">
            	<div class="box_top"></div>
                
                <div class="box_content">
                    <center><h2> BANK INFORMATION</h2></center>
                    <div class="box_image_wrapper">
                        <s:url action="bankinfo" var="welc1"/><s:a href="%{welc1}"> <img src="/WebApplication7/adminimages/Bank-icon.jpg" alt="product 1" width="90" height="90" /></s:a>
                  </div>
                    <center><p>&quot;VIEW Information Regarding Bank Here&quot</p></center>
                  <div class="button_01"></div>
                    
                    <div class="cleaner"></div>
                </div>
                
                <div class="box_bottom"></div>            
            </div>
              <div class="box margin_r_15">
            	<div class="box_top"></div>
                
                <div class="box_content">
                	<center><h2>MANAGERS ACCOUNTS</h2></center>
                    <div class="box_image_wrapper">
                        <s:url action="managephoto" var="welc"/><s:a href="%{welc}"><img src="/WebApplication7/adminimages/manage.jpg" alt="product 1" width="90" height="90" /></s:a>
                    </div>         
                        <center> <p>&quot;MANAGE Accounts Of Managers Here&quot;</p></center>
                  <div class="button_01"></div>
                    
                    <div class="cleaner"></div>
                </div>
                
                <div class="box_bottom"></div>            
            </div>
            <div class="box margin_r_15">
            	<div class="box_top"></div>
                
                <div class="box_content">
                    <center><h2>APPLICATIONS TO BE APPROVED</h2></center>
                    <div class="box_image_wrapper">
                        <s:url action="adminapprovephoto" var="welc" /><s:a href="%{welc}"><img src="/WebApplication7/adminimages/apprequest.jpg" alt="product 1" width="90" height="90" /></s:a>
                    </div>         
                    <center><p>&quot;CHECK List Of Applications for CREDIT CARD Here&quot;</p></center>
                  <div class="button_01"></div>
                </div>
                
                <div class="box_bottom"></div>            
            </div>
            
            <div class="box">
            	<div class="box_top"></div>
                
                <div class="box_content">
                    <center><h2>LOGOUT</h2></center>
                	
               	  
                    <div class="box_image_wrapper"><s:url action="logoutadmin" var="welcome" />
                <s:a href="%{welcome}"><img src="/WebApplication7/adminimages/logout.jpg" alt="product 1" width="90" height="90" /></s:a>
                    </div>                                    
                   <center> <p> &quot;CLICK  To Logout From Your Account&quot;</p></center>
                <div class="button_01"></div>
                    
                    <div class="cleaner"></div>
                </div>
                
                <div class="box_bottom"></div>            
            </div>
        
        </div>
        
        <div class="cleaner"></div>
  </div> <!-- end of templatemo_content -->
 

</div> <!-- end of templatemo_content_wrapper -->

<div id="templatemo_footer_wrapper">
<div id="templatemo_footer">

    <center>
       <h4> Copyright © 2012 |  SAHARA BANK </h4>
   </center>
</div>
</div> <!-- end of footer -->
</body>
</html>
