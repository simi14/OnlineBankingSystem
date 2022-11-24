<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Add Banking Forms</title>
<!-- plugins:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.base.css">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/vendor.bundle.addons.css">
<!-- endinject -->
<!-- plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/adminResources/css/style.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="<%=request.getContextPath()%>/adminResources/images/favicon.png" />
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>
	<f:form action="insertBankingForm" post="Post"
		modelAttribute="bankingFormVO" enctype="multipart/form-data">
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
										<h4 class="card-title">Add Banking Form</h4>
										<div class="form-group">
											<label for="exampleInputName1">Name</label>
											<!-- <input
												type="text" class="form-control" id="exampleInputName1"
												placeholder="Name"> -->
											<f:input path="bankingFormName" placeholder="Name"
												class="form-control" />
										</div>
										<div class="form-group">
											<label for="examplebankingFormDescription1">Description</label>
											<!-- <textarea class="form-control" id="exampleDescription1"
												rows="4"></textarea> -->
											<f:textarea path="bankingFormDescription"
												class="form-control" rows="4" />
										</div>
										<f:hidden path="bankingFormId" />
										<!-- <div class="form-group">
											<label>File upload</label> <input type="file" name="img[]"
												class="file-upload-default">
											<div class="input-group col-xs-12">
												<input type="text" class="form-control file-upload-info"
													disabled placeholder="Upload File"> <span
													class="input-group-append">
													<button class="file-upload-browse btn btn-primary"
														type="button">Upload</button>
												</span>
											</div>
										</div> -->
										<div class="form-group">
											<label for="exampleBankingForm">Forms</label> <input
												type="file" name="file" class="form-control" />
										</div>
										<button type="submit" class="btn btn-primary mr-2">Submit</button>
										<button class="btn btn-light">Cancel</button>
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
	</f:form>
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.base.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/vendor.bundle.addons.js"></script>
	<!-- endinject -->
	<!-- Plugin js for this page-->
	<!-- End plugin js for this page-->
	<!-- inject:js -->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/off-canvas.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/hoverable-collapse.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/template.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/settings.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/todolist.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/file-upload.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/dashboard.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
