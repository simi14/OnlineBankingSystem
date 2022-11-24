<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Add Required Docs</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/materialdesignicons.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.base.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.addons.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="<%=request.getContextPath()%>/adminResources/images/favicon.png" />
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<body>
		<%-- <f:form action="insertRequiredDocuments" post="Post" >modelAttribute="requiredDocumentsVO" --%>
	<div class="container-scroller">
		<!-- partial:../../partials/_navbar.html -->
		<jsp:include page="header.jsp"></jsp:include>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:../../partials/_sidebar.html -->
			<jsp:include page="menu.jsp"></jsp:include>
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row">
						<div class="col-12 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Add Required Documents</h4>
									<form class="forms-sample" action="insertRequiredDocuments">
										<div class="form-group">
											<label>Service</label> 
											 <select
												class="js-example-basic-multiple w-100" name="sid" ><!-- multiple="multiple" -->
												<c:forEach items="${sessionScope.service_list}" var="i">
												<option value="${i.service_id }">${i.service_name}</option>
				
												</c:forEach>
											</select> 
										<%-- <f:select path="servicesVO.service_id" class="form-control" id="exampleSelectService">
											<c:forEach items="${sessionScope.service_list}" var="i">
											<f:option value="${i.service_id }">${i.service_name}</f:option>
											</c:forEach>
											<%-- </f:select> --%>
										</div> 
										
			
										<div class="form-group">
											<label>Documents Required</label> 
											 <select
												class="js-example-basic-multiple w-100" multiple="multiple" name="documentVOList" >
												<c:forEach items="${sessionScope.document_list}" var="i">
												<option value="${i.document_id }">${i.document_name}</option>
												</c:forEach>
											</select> 
											<%-- <f:select path="documentsVO.document_id" name="didList" class="js-example-basic-multiple w-100 form-control" multiple="multiple" id="exampleSelectService">
											<c:forEach items="${sessionScope.document_list}" var="i">
											<f:option value="${i.document_id }">${i.document_name}</f:option>
											</c:forEach>
											</f:select> --%>
										</div> 
										<%-- <f:hidden path="requiredDocument_id" /> --%>

										<button type="submit" class="btn btn-primary mr-2">Submit</button>
										<button class="btn btn-light">Cancel</button>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->
				<%-- <jsp:include page="footer.jsp"></jsp:include> --%>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
	<%-- </f:form> --%>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.base.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.addons.js"></script>
	<!-- endinject -->
	<!-- inject:js -->
	<script src="<%=request.getContextPath()%>/adminResources/js/off-canvas.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/hoverable-collapse.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/template.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/settings.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/todolist.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="<%=request.getContextPath()%>/adminResources/js/file-upload.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/iCheck.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/typeahead.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/select2.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
