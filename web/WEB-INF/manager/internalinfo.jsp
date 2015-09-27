<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%><html>
    <%@taglib uri="/struts-tags" prefix="s" %>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/managercss/InternalInfo.css"/>
 
 <title>Internal Info</title>
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
    <form action="internalback" method="post">
        
      
 <fieldset class="row11">
   <legend>Score Calculated</legend>
   <table>
   <tr>  <td>APPNO:</td><td><s:property value="appno"  /></td></tr>
  <tr><td>SALUTATION:</td><td><s:property value="salu"  /></td></tr>
  <tr><td>FIRST NAME:</td><td><s:property value="fname"  /></td></tr>
  <tr><td>LAST NAME:</td><td><s:property value="lname"  /></td></tr>
  <tr><td>BIRTH:</td><td><s:property value="birth"  /></td></tr>
  <tr><td>MARITAL STATUS:</td><td><s:property value="status"  /></td></tr>
  <tr><td>SEX:</td><td><s:property value="sex"  /></td></tr>
  <tr><td>PAN:</td><td><s:property value="pan"  /></td></tr>
  <tr><td>MOBILE:</td><td><s:property value="mobile"  /></td></tr>
  <tr><td>EMAIL:</td><td><s:property value="email"  /></td></tr>
  <tr><td>ANNUAL SALARY:</td><td><s:property value="annual"  /></td></tr>
  <tr><td>MONTHLY SALARY:</td><td><s:property value="monthly"  /></td></tr>
  <tr><td>CARD TYPE:</td><td><s:property value="card_type"  /></td></tr>
   </table>
      </fieldset>
        <fieldset class="row11">
            
   <legend>Contact Details</legend>
   <table>
    <tr><td>DOOR NO:</td><td><s:property value="door"  /></td></tr>
    <tr><td>STREET:</td><td><s:property value="street"  /></td></tr>
    <tr><td>LANDMARK:</td><td><s:property value="landmark"  /></td></tr>
    <tr><td>NATIONALITY:</td><td><s:property value="nationality"  /></td></tr>
    <tr><td>CITY:</td><td><s:property value="city"  /></td></tr>
    <tr><td>STATE:</td><td><s:property value="state"  /></td></tr>
    <tr><td>ZIP CODE:</td><td><s:property value="zip"  /></td></tr>
    <tr><td>RESIDENT NO:</td><td><s:property value="resino"  /></td></tr>
   </table>
      </fieldset>
        <fieldset class="row11">
   <legend>Employment Details</legend>
   <table>
    <tr><td>PROFESSION:</td><td><s:property value="profession"  /></td></tr>
    <tr><td>EMPLOYEE NAME:</td><td><s:property value="ename"  /></td></tr>
    <tr><td>EMPLOYEE ID:</td><td><s:property value="eid"  /></td></tr>
    <tr><td>DATE OF JOIN:</td><td><s:property value="join"  /></td></tr>
    <tr><td>COMPANY ADDRESS:</td><td><s:property value="comaddress"  /></td></tr>
    <tr><td>FAX:</td><td><s:property value="fax"  /></td></tr>
    <tr><td>OFFICE NO:</td><td><s:property value="officeno"  /></td></tr>
    <tr><td>OFFICE EMAIL:</td><td><s:property value="officeemail"  /></td></tr>
        </table>
      </fieldset>   
        <fieldset class="row12">
   <legend>Further Details</legend>
   <table>
    <tr><td>NAME TO BE APPEARED ON CARD:</td><td><s:property value="nameappear"  /></td></tr>
    <tr><td>SALARY ACCOUNT:</td><td><s:property value="salaccount"  /></td></tr>
    <tr><td>BANK NAME:</td><td><s:property value="salbankname"  /></td></tr>
    <tr><td>ACCOUNT NO:</td><td><s:property value="accountno"  /></td></tr>
    <tr><td>ACCOUNT NAME:</td><td><s:property value="accountname"  /></td></tr>
    <tr><td>OTHER BANK CARD:</td><td><s:property value="othercard"  /></td></tr>
    <tr><td>BANK NAME:</td><td><s:property value="cardbank"  /></td></tr>
    <tr><td>CARD HOLDER NAME:</td><td><s:property value="cardhold"  /></td></tr>
    <tr><td>CARD LIMIT:</td><td><s:property value="cardlimit"  /></td></tr>
    <tr><td>REGISTRATION DATE:</td><td><s:property value="regdate"  /></td></tr>
       </table>
       <s:submit value="back" cssClass="button" />
      </fieldset>  
    
        
                    
             </form>
    </div>
  </div>
  
  <!--end of main content-->
 <div id="footer">
	<div id="data"> 
        <center><h3>  Copyright © 2012 |  SAHARA BANK </h3></center>
        
     </div>
  </div>
 </div>
</body>
</html>
