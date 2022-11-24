<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Add Loan Rate</title>
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
<link rel="stylesheet" href="<%=request.getContextPath()%>/adminResources/css/jquery.toast.min.css">
<!-- endinject -->
<link rel="shortcut icon"
	href="<%=request.getContextPath()%>/adminResources/images/favicon.png" />
</head>

<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<body>
	<f:form action="insertLoanRate" post="Post" modelAttribute="loanRateVO" onsubmit="return addLoanRate()">
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
										<h4 class="card-title">Add Loan Rate</h4>
											<div class="form-group">
												<label>Loan Type</label>
												<f:select path="loanTypeVO.loantype_id" class="form-control"
													id="exampleSelectLoanType">
													<option selected="selected" value="none">Select Loan Type</option>
													<c:forEach items="${sessionScope.loanType_list}" var="i">
														<f:option value="${i.loantype_id }">${i.loantype_name}</f:option>
													</c:forEach>
												</f:select>
											</div>

											<f:hidden path="loanRate_id" />
											
											<div class="form-group">
												<label for="exampleLoanRaterate1">Interest Rate</label>
												<f:input path="loanRate_rate" id="loanRate_rate" placeholder="%"
													class="form-control" />
											</div>
											<div class="form-group">
												<label for="exampleLoanRatetenure1">Tenure</label>
												<f:input path="loanRate_tenure" id="loanRate_tenure" placeholder="Tenure"
													class="form-control" />
											</div>
											<div class="form-group">
												<label for="exampleLoanRatemaxAmount1">Maximum
													Amount</label>
													<f:input path="loanRate_maxAmount" id="loanRate_maxAmount" placeholder="Amount"
													class="form-control" />
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
	<script src="<%=request.getContextPath()%>/adminResources/js/jquery.toast.min.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script
		src="<%=request.getContextPath()%>/adminResources/js/file-upload.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/iCheck.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/typeahead.js"></script>
	<script
		src="<%=request.getContextPath()%>/adminResources/js/select2.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/toaster.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/customValidation.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
