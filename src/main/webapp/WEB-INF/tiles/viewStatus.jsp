<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
            <%@ taglib prefix="fmt" 
           uri="http://java.sun.com/jsp/jstl/fmt" %>
           
           
<%@ taglib tagdir="/WEB-INF/tags" prefix="kjt" %>           
           
<c:url var="url" value="/viewstatus"/>
    
    
    <div class="row">



	<div class="col-md-8 col-md-offset-2">
	
	<kjt:pagination url="${url}" page="${page}" size="10"></kjt:pagination>
	
	
	<c:forEach var="page" items="${page.content}">
	<c:url var="editLink" value="/editstatus?id=${page.id}"></c:url>
	<c:url var="deleteLink" value="/deletestatus?id=${page.id}"></c:url>
	<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="panel-title">Add Status on:<fmt:formatDate pattern="EEEE:d:MMMM y 'at'H:MM:s" value="${page.added}"></fmt:formatDate></div>
			</div>
			
			<div class="panel-body">
				
				<div>${page.text}</div>
				
				<div class="edit-links pull-right">
				
				<a href="${editLink}">Edit</a> | <a onclick="return confirm('Are you sure want to delete');" href="${deleteLink}">Delete</a> 
				
				</div>
		
	
    
   
    
    
    	
			</div>
		
		
		</div>
		
		</c:forEach>
		
			</div>
		
		
		</div>
    
    