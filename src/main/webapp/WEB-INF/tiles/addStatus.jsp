<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="row">

	<div class="col-md-8 col-md-offset-2">
		
	
		<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="panel-title">Add a Status Update</div>
			</div>
			
			<div class="panel-body">
				
				<form:form commandName="statusUpdate">
					<div class="form-group">
						<form:textarea path="text" name="text" rows="10" cols="50"></form:textarea>
					</div>
					
					<input type="submit" name="submit" value="Add Status" />				
				</form:form>
			
			</div>
		
		
		</div>
	
	
	</div>



</div>
