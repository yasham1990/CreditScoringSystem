
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@taglib uri="/struts-tags" prefix="s" %>

<html>
<head>

  <script language="javascript" type="text/javascript"> 
        function enable(message){
            var dis=message;
            if(message=="no")
            {
                document.getElementById("bn1").disabled=false;
                document.getElementById("chn").disabled=false;
                document.getElementById("cl").disabled=false;
            }
           if(message=="yes")
            {
                document.getElementById("bn1").disabled=true;
                document.getElementById("chn").disabled=true;
                document.getElementById("cl").disabled=true;
            }
              if(message=="y")
                  {
                      document.getElementById("salbkname").disabled=false;
                    document.getElementById("acc").disabled=false;
                    document.getElementById("accname").disabled=false;
                  }
                   if(message=="n")
                  {
                      document.getElementById("salbkname").disabled=true;
                    document.getElementById("acc").disabled=true;
                    document.getElementById("accname").disabled=true;
                  }
        }
       
window.history.forward(1);

        </script>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/homecss/register1.css"/>
<title>Registration</title>
</head>
<body>
  <form name="signup" id="signup" method="post" action="register1" class="register1">    
  <h1>REGISTRATION FORM-2</h1>
  <fieldset class="row1">
    <legend> Employment Details</legend>
    <table>
   <tr>
       <td><s:select headerKey="" headerValue="-Select Profession-" label="Profession *" name="prof" list="# {'Salaried':'Salaried','Self Employed':'Self Employed','Student':'Student','Retire/Pensioner':'Retire/Pensioner'}"/></td>    
   </tr>
   
   
    <tr>      
        <td><s:textfield name="empName" cssClass="mytextfield" label="Employee Name *" value=""/></td>    
    </tr>  
    <tr>
      <td><s:textfield name="empId" cssClass="mytextfield" label="Employee id*" value=""/> </td>  
    </tr>
    
    <tr>    
        <td><s:textfield name="dateJoin" cssClass="mytextfield" label="Date Of Joining(mm/dd/yyyy)*" value=""/> </td> 
    </tr>
       
    <tr>   
    <td><s:textfield name="compAdd" cssClass="mytextfield" label="Company Address*" value=""/> </td>         
    </tr> 
    
      <tr>      
      <td><s:textfield name="faxNo" cssClass="mytextfield" label="Fax No.*" value=""/> </td>
      </tr>
       
       <tr>      
     <td><s:textfield name="offNo" cssClass="mytextfield" label="Office Phone no. *" value=""/> </td>
       </tr>
 
       <tr>      
           <td><s:textfield name="email" cssClass="mytextfield" label="Email id *" value=""/> </td>
            </tr>
            <tr> 
            <td><s:textfield name="nameCard" cssClass="mytextfield" label="Name to be appeared on card*" value=""/> </td>
         </tr> 
      </table>
      
 </fieldset>
             
  <fieldset class="row2">
  <legend>Further Details</legend>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;<s:radio label="Salaried Bank Account*" name="salbankacc" list="{'Yes'}" value="%{salbankacc}" onclick="enable('y')" />
         <s:radio  name="salbankacc" list="{'No'}" value="%{salbankacc}" onclick="enable('n')" /></p>
    <table>
        <tr> 
          <td><s:textfield name="salbankname" id="salbkname" label="Bank Name" value=""/> </td>
      </tr> 
      <tr> 
          <td><s:textfield name="accNo" id="acc" label="Account no." value=""/> </td>
      </tr> 
      
      <tr> 
          <td><s:textfield name="accHoldrName" id="accname" label="Account Holder Name" value=""/> </td>
      </tr>  
    </table>   
    </fieldset>
      
  
      <fieldset class="row3">
          <legend>Any Other Bank Card Detail(If Owned,Please Enter Details)</legend>
      <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Other Bank Card*:&nbsp;&nbsp;&nbsp;&nbsp;<s:radio name="otherbankcard"   list="{'Yes'}" value="%{otherbankcard}" onclick="enable('no')"/> 
               <s:radio name="otherbankcard"   list="{'No'}" value="%{otherbankcard}" onclick="enable('yes')" /> </p>
  <table>
     
    <tr> 
        <td><s:textfield name="bankName1" cssClass="mytextfield" id="bn1" label="Bank Name" value=""/> </td>
    </tr> 

    <tr> 
        <td><s:textfield name="cardHoldrName" cssClass="mytextfield" id="chn" label="Card Holder Name" value=""/></td>
    </tr>  

    <tr> 
        <td><s:textfield name="cardLimit" cssClass="mytextfield" id="cl" label="Card Limit" value=""/> </td>
    </tr>
    <tr>
        <td> <s:textfield cssClass="mytextfield" name="appno" label="Application No." value="%{appno}" readonly="true" /></td>
    </tr>
  </table>
      <table>
    <tr><td>*Fields cannot be left empty</td></tr>
    </table>
     <s:submit value="Register" cssClass="button" />
     <s:submit value="back" action="regisback1" cssClass="button" />
  </fieldset>
     
    </form>
</body>
</html>
