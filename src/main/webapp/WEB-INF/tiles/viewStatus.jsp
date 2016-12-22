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
	
	<kjt:pagination url="${url}" page="${page}" size="4"></kjt:pagination>
	
	
	<c:forEach var="page" items="${page.content}">
	
	<div class="panel panel-default">
		
			<div class="panel-heading">
				<div class="panel-title">Add Status on:<fmt:formatDate pattern="EEEE:d:MMMM y 'at'H:MM:s" value="${page.added}"></fmt:formatDate></div>
			</div>
			
			<div class="panel-body">
				<c:out value="${page.text}"></c:out>
		
	
    
   
    
    
    	
			</div>
		
		
		</div>
		
		</c:forEach>
		
			</div>
		
		
		</div>
    
    