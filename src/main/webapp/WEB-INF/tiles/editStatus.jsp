<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
           
           <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
           <%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
<div class="row">



	<div class="col-md-8 col-md-offset-2">
		
	
		<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="panel-title">Edit Status</div>
			</div>
			
			
				
				<form:form modelAttribute="statusUpdate">
				<form:input path="id" type="hidden"/>
				<form:input path="added" type="hidden"/>
				<div class="errors">
				<form:errors path="text"/>
				</div>
				<div class="form-group">
					<form:textarea path="text" name="text" rows="10" cols="50"></form:textarea>
					
					</div>
					
					<input type="submit" name="submit" value="save" />				
				</form:form>
			
			</div>
		
		
		
	
	


</div>

 <script src='//cdn.tinymce.com/4/tinymce.min.js'></script>
  <script>
  tinymce.init({
    selector: 'textarea',
    
    plugins:"link"
  });
  </script>
