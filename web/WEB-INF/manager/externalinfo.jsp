
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>
   
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/externalinfo.css"/>
 
<title>External Info</title>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>
<body> 
          
<div id="main_container">
<div id="header">
    	<div id="logo"><img src="/WebApplication7/managerimages/logo1.jpg" alt="" title="" border="0" />
        <h2> SAHARA BANK</h2>
        </div>
        <div id="logo1">
          <p><img src="/WebApplication7/managerimages/manage.jpg" alt="" width="580" height="181" /></p>
        </div>
        </div>
  <div id="main_content">
    <div class="main" >
    <form action="externalback" method="post">
       
      
 <fieldset class="row11">
   <legend>External Info</legend>
   <table>
        
       <tr>
       <td>APPNO:</td>
       <td><s:property value="appno"  /></td>
       </tr>
        <tr>
       <td>FIRST NAME:</td>
       <td><s:property value="fname"  /></td>
       </tr>
        <tr>
       <td>LAST NAME:</td>
       <td><s:property value="lname"  /></td>
       </tr>
        <tr>
       <td>ADDRESS:</td>
       <td><s:property value="address"  /></td>
       </tr>
        <tr>
       <td>EMAIL:</td>
       <td><s:property value="email"  /></td>
       </tr>
   <tr>
       <td>MOBILE:</td>
       <td><s:property value="mobile"  /></td>
       </tr>
        <tr>
       <td>FAMILY MEMBERS:</td>
       <td><s:property value="member"  /></td>
       </tr>
        <tr>
       <td>HOUSE AREA:</td>
       <td><s:property value="area"  /></td>
       </tr>
        <tr>
       <td>HOUSE LOAN:</td>
       <td><s:property value="hloan"  /></td>
       </tr>
        <tr>
       <td>HOUSE LOAN PAID:</td>
       <td><s:property value="hpaid"  /></td>
       </tr>
  <tr>
       <td>BILL PAY:</td>
       <td><s:property value="billpay"  /></td>
       </tr>
       <tr>
       <td>NO. OF CARS:</td>
       <td><s:property value="cars"  /></td>
       </tr>
       <tr>
       <td>CAR LOAN:</td>
       <td><s:property value="cloan"  /></td>
       </tr>
       <tr>
       <td>CAR LOAN PAID:</td>
       <td><s:property value="cpaid"  /></td>
       </tr>
        <tr>
       <td>NET INCOME:</td>
       <td><s:property value="income"  /></td>
       </tr>
        <tr>
       <td>NO OF FDs:</td>
       <td><s:property value="nfd"  /></td>
       </tr>
        <tr>
       <td>NET FDs AMOUNT:</td>
       <td><s:property value="fdamount"  /></td>
       </tr>
        <tr>
       <td>AGRICULTURE:</td>
       <td><s:property value="agland"  /></td>
       </tr>
        <tr>
       <td>LIC:</td>
       <td><s:property value="lic"  /></td>
       </tr>
        <tr>
       <td>BANK DEFAULTS:</td>
       <td><s:property value="bankdefault"  /></td>
       </tr>
        <tr>
       <td>TAX DEFAULTS:</td>
       <td><s:property value="tax"  /></td>
       </tr>
        <tr>
       <td>CRIME COMMITED:</td>
       <td><s:property value="crime"  /></td>
       </tr>
        <tr>
       <td>OTHER INCOME SOURCE:</td>
       <td><s:property value="otherinc"  /></td>
       </tr>
        <tr>
       <td>OTHER BANK CARD:</td>
       <td><s:property value="otherbankcard"  /></td>
       </tr>
  <s:submit value="back"  cssClass="button"/>
  
  
   </table>
      </fieldset>
       
        
                    
             </form>
    </div>
  </div>
  
  <!--end of main content-->
 <div id="footer">
	<div id="data"> 
       <center> <h3>  Copyright © 2012 |  SAHARA BANK </h3></center>
        
     </div>
  </div>
 </div>
</body>
</html>
