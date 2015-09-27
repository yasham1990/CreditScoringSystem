
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>

<html >
<head>
     
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Manager Home Page</title>
 <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/manager.css"/>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>

<body>
    <div id="main_container">
    <div class="center_content">
    <div id="header">
    <div id="logo"><img src="/WebApplication7/managerimages/logo1.jpg" alt="" title="" border="0" />
    <h1>SAHARA BANK</h1>
    </div>
    <div id="logo1">
        <p><img src="/WebApplication7/managerimages/manage.jpg" alt="" width="580" height="181" /></p>
    </div>    
    </div>
  
    <div class="main_content">
    <div id="boxes_content">
        <p class="welc">Welcome   <s:property value="namedis"/>.....</p>
        
    	<div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Applications</div>
            <div class="box_icon"><s:url action="Clickme" var="welcome" />

                <s:a href="%{welcome}"><img src="/WebApplication7/managerimages/apprequest.gif" alt="" title="" border="0"/> </s:a></div>
            <p class="text_content">
 "CHECK Applications for CREDIT CARD here..&quot;<br />
 <br/>
            </p> 
            </div>                  
        </div>

    	<div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Manage Accounts</div>
                <div class="box_icon"><s:url action="managereditview" var="welc"/><s:a href="%{welc}"><img src="/WebApplication7/managerimages/manage.png" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "MANAGE Accounts of Employees here..&quot;<br />
 <br />
            </p> 
            </div>                  
        </div>
            
     	<div class="box">
        	<div class="box_content">
        	<div class="boxtitle">E-mail Check</div>
            <div class="box_icon"><a href="http://www.gmail.com" target="_blank"><img src="/WebApplication7/managerimages/mail.jpg" alt="" title="" border="0"/></a></div>
            <p class="text_content">
 "CHECK E-mails And other Queries of Customers here..&quot;<br/>
 <br />
            </p> 
            </div>                  
        </div>       
           	<div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Manager View Info</div>
            <div class="box_icon"><s:url action="view1" var="welcome" />

                <s:a href="%{welcome}"><img src="/WebApplication7/managerimages/view.jpg" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "Manager can view his own info here&quot;<br /><br />
            </p> 
            </div>                  
        </div>
            <div class="box">
        	<div class="box_content">
        	<div class="boxtitle">Change Password</div>
            <div class="box_icon"><s:url action="passviewman" var="welcome" />

                <s:a href="%{welcome}"><img src="/WebApplication7/managerimages/password.jpg" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "Change your password here&quot;<br /><br />
            </p> 
            </div>                  
        </div>
            
       	<div class="box" id="log">
        	<div class="box_content" >
        	<div class="boxtitle">Log Out</div>
                <div class="box_icon"><s:url action="logout" var="welcome" />

                <s:a href="%{welcome}"><img src="/WebApplication7/managerimages/logout.jpg" alt="" title="" border="0"/></s:a></div>
            <p class="text_content">
 "CLICK To LogOut from ur Account&quot;<br />
            </p> 
            </div>                  
        </div>          
        
    </div><!--end of boxes content-->
  
  <div class="clear"></div>
  </div><!--end of main content-->
    
    
     <div id="footer">
	<div id="data"> 
        <center><h3>Copyright © 2012 |  SAHARA BANK </h3></center>
        <p>&nbsp;</p>
     </div>
       </div>
 
	</div>
</div>
</body>
</html>