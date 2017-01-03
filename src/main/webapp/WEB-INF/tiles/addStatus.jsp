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
				<div class="panel-title">Add a Status Update</div>
			</div>
			
			
				
				<form:form modelAttribute="statusUpdate">
				
				<div class="errors">
				<form:errors path="text"/>
				</div>
				<div class="form-group">
					<form:textarea path="text" name="text" rows="10" cols="50"></form:textarea>
					</div>
					
					<input type="submit" name="submit" value="Add Status" />				
				</form:form>
			
			</div>
		
		
		
	
	<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="panel-title">Add Status on:<fmt:formatDate pattern="EEEE:d:MMMM y 'at'H:MM:s" value="${getLatesStatusUpdate.added}"></fmt:formatDate></div>
			</div>
			
			<div class="panel-body">
				${getLatesStatusUpdate.text}
			
			</div>
		
		
		</div>
	
	</div>



</div>

 <script src='//cdn.tinymce.com/4/tinymce.min.js'></script>
  <script>
  tinymce.init({
    selector: 'textarea',
    
    plugins:"link"
  });
  </script>
