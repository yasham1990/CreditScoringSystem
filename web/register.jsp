

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link rel="stylesheet" type="text/css" href="/WebApplication7/homecss/regis.css"/>
<title>Registration</title>
<script language="JavaScript" type="text/javascript">
window.history.forward(1);
</script>
</head>
<body>
    <form   method="post" action="register" class="register1" >    
<h1>REGISTRATION FORM-1</h1>

  <fieldset class="row1">
  <legend>Personal Details</legend>
  <table>
  <tr>
   <td><s:select headerKey="" name="cardtype" headerValue="select" label="Card Type*" list= "# {'Silver':'Silver','Gold':'Gold','Platinum':'Platinum'}" /></td>
  </tr>    
  <tr>      
          
      <td><s:select  name="salu" headerValue="select" headerKey="" label="Salutation*" list= "# {'Mr.':'Mr.','Ms.':'Ms.'}"/></td>
        </tr>    
    <tr>      
        <td><s:textfield cssClass="mytextfield" name="fname" label="First Name*" /></td></tr>
       <tr> <td><s:textfield name="lname" cssClass="mytextfield" label="Last Name*" /></td>    
    </tr>  
    <tr>
      
      <td><s:textfield cssClass="mytextfield" name="dob" label="Date of Birth*(mm/dd/yyyy)" value=""/></td>
    </tr>
      <tr>
          <td> <s:radio label="Marital Status*" name="status" list="{'Married','Unmarried'}" value="%{status}" /></td>
    </tr>
     
      <tr><td> <s:radio label="Sex*" name="sex" list="{'Male','Female'}" value="%{sex}"  /></td>
      
      </tr>
        
    <tr>      
        <td><s:textfield cssClass="mytextfield" name="pan" label="Pan No.*" value=""/></td>    
    </tr>
       <tr>      
           <td><s:textfield label="Mobile no.*" name="mobile" cssClass="mytextfield" value=""/></td>    
      </tr>
       <tr>      
           <td><s:textfield label="Email*" cssClass="mytextfield" name="email" value="" /></td>    
     </tr>
      <tr>      
          <td><s:textfield cssClass="mytextfield" label="Gross Annual Income*" name="annualinc" value=""/></td>    
            </tr>
      <tr>      
      <td><s:textfield cssClass="mytextfield" label="Monthly Income*" name="monthlyinc" value=""/></td>    
      </tr>
      
  </table>
      
  </fieldset>

      <fieldset class="row2">
  <legend>Contact Details</legend>
  <table>
    <tr>      
      <td><label>Address Line Info</label></td>  
      </tr>
      <tr> 
          <td><s:textfield cssClass="mytextfield" label="Door No.*" name="door" value=""/></td>  
        </tr>    
    <tr>      
        <td><s:textfield label="Street" cssClass="mytextfield" name="street" value=""/></td>    
    </tr> 
     <tr> 
         <td><s:textfield label="Landmark*" cssClass="mytextfield" name="lmark" value=""/></td>       
    </tr>  
    <tr>
        <td><s:select headerKey="" headerValue="-Select-" name="country" label="Nationality*" list="# {'India':'India','Other':'Other'}"/></td>
    </tr>
<tr>      
    <td> <s:select name="city" headerKey="" headerValue="select-city" label="City*"  list="# {'Abohar':'Abohar','Ajmer':'Ajmer','Agra':'Agra',
              'Allahabad':'Allahabad','Aligarh':'Aligarh','Ahmedabad':'Ahmedabad','Amritsar':'Amritsar','Ambala':'Ambala','Aurangabad':'Aurangabad','Baddi':'Baddi',
              'Ballabgarh':'Ballabgarh','Bangalore':'Bangalore','Bareilly':'Bareilly','Bhagalpur':'Bhagalpur','Bhathinda':'Bhathinda','Bhilai':'Bhilai',
              'Bhopal':'Bhopal','Bhubaneshwar':'Bhubaneshwar','Bhuj':'Bhuj','Bijnore':'Bijnore','Bilaspur':'Bilaspur','Chandigarh':'Chandigarh',
              'Chennai':'Chennai','Coimbatore':'Coimbatore','Cuttack':'Cuttack','Dadri':'Dadri','Daman':'Daman and Diu','Darjeeling':'Darjeeling','Dehradun':'Dehradun',
              'Durgapur':'Durgapur','Faridabad':'Faridabad','Ferozpur':'Ferozpur','Firozabad':'Firozabad','Gangtok':'Gangtok','Ghandinagar':'Ghandinagar','Ghaziabad':'Ghaziabad',
              'Gwalior':'Gwalior','Gorakhpur':'Gorakhpur','Gurgaon':'Gurgaon','Guwahati':'Guwahati','Haldwani':'Haldwani','Haldia':'Haldia','Haridwar':'Haridwar',
              'Hazira':'Hazira','Hissar':'Hissar','Hoshiarpur':'Hoshiarpur','Howrah':'Howrah','Hyderabad':'Hyderabad','Imphal':'Imphal','Indore':'Indore',
              'Jabalpur':'Jabalpur','Jaipur':'Jaipur','Jalandhar':'Jalandhar','Jammu':'Jammu','Jamnagar':'Jamnagar','Jamshedpur':'Jamshedpur',
              'Jhansi':'Jhansi','Jodhpur':'Jodhpur','Kanpur':'Kanpur','Karnal':'Karnal','Kharagpur':'Kharagpur','Kolhapur':'Kolhapur','Kolkata':'Kolkata',
              'Kochi':'Kochi','Kota':'Kota','Kurnool':'Kurnool','Lucknow':'Lucknow','Ludhiana':'Ludhiana','Madurai':'Madurai','Manipal':'Manipal',
              'Mathura':'Mathura','Meerut':'Meerut','Mirzapur':'Mirzapur','Moradabad':'Moradabad','Mumbai':'Mumbai','Muzaffarnagar':'Muzaffarnagar',
              'Mysore':'Mysore','Nagpur':'Nagpur','Nainital':'Nainital','Nashik':'Nashik','Noida':'Noida','New Delhi':'New Delhi','Nizamabad':'Nizamabad',
              'Ooty':'Ooty','Patiala':'Patiala','Panchkula':'Panchkula','Panipat':'Panipat','Pathankot':'Pathankot','Patna':'Patna',
              'Pondicherry':'Pondicherry','Port Blair':'Port Blair','Pune':'Pune','Raigarh':'Raigarh','Raipur':'Raipur','Rajkot':'Rajkot',
              'Ranchi':'Ranchi','Raniganj':'Raniganj','Rewa':'Rewa','Rishikesh':'Rishikesh','Roorkee':'Roorkee','Rourkela':'Rourkela',
              'Secunderabad':'Secunderabad','Shahjahanpur':'Shahjahanpur','Shillong':'Shillong','Shimla':'Shimla','Silchar':'Silchar','Srinagar':'Srinagar',
              'Surat':'Surat','Thane':'Thane','Thiruvananthapuram':'Thiruvananthapuram','Tirunelveli':'Tirunelveli','Tirupati':'Tirupati','Tiruvalla':'Tiruvalla',
              'Udaipur':'Udaipur','Ujjain':'Ujjain','Vijayawada':'Vijayawada','Vishakapatnam':'Vishakapatnam','Vasco':'Vasco','Vadodara':'Vadodara',
              'Varanasi':'Varanasi','Virudhunagar':'Virudhunagar','Varindavan':'Varindavan','Warangal':'Warangal','Yamunanagar':'Yamunanagar'}"/></td>
    </tr>   
    <tr>      
        <td><s:select name="state" label="State *" headerKey="" headerValue="select-state"
                  list="# {'Arunachal Pradesh':'Arunachal Pradesh','Assam':'Assam','Andhra Pradesh':'Andhra Pradesh','Andaman & Nicobar':'Andaman & Nicobar','Bihar':'Bihar',
                  'Chandigarh':'Chandigarh','Chhatisgarh':'Chhatisgarh','Delhi':'Delhi','Daman & Diu':'Daman & Diu','Nagar Haveli':'Nagar Haveli','Gujarat':'Gujarat',
                  'Goa':'Goa','Himachal Pradesh':'Himachal Pradesh','Haryana':'Haryana','Jammu & Kashmir':'Jammu & Kashmir','Jharkhand':'Jharkhand','Karnataka':'Karnataka',
                  'Kerala':'Kerala','Lakshadweep':'Lakshadweep','Manipur':'Manipur','Mizoram':'Mizoram','Meghalaya':'Meghalaya','Madhya Pradesh':'Madhya Pradesh',
                  'Maharashtra':'Maharashtra','Nagaland':'Nagaland',
                  'Orissa':'Orissa','Punjab':'Punjab','Pondicherry':'Pondicherry','Rajasthan':'Rajasthan','Sikkim':'Sikkim','Tripura':'Tripura','Tamil Nadu':'Tamil Nadu',
                  'Uttaranchal':'Uttaranchal','Uttar Pradesh':'Uttar Pradesh','West Bengal':'West Bengal'}"/></td>    
         </tr>
        <tr> 
            <td><s:textfield label="Zip *" cssClass="mytextfield" value="" name="zip"/></td>        
    </tr>  
      <tr> 
          <td><s:textfield label="Residence No." cssClass="mytextfield" value="" name="resi"/></td>    
    </tr>
  </table>
    <table>
    <tr><td>*Fields cannot be left empty</td></tr>
    </table>    
   
     <s:submit value="Next"  cssClass="button"/>  
     <s:submit value="back" action="regisback"  cssClass="button"/>
  </fieldset>

</form>

</body>
</html>
