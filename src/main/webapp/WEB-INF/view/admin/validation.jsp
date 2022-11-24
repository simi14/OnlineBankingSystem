<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>BoardsterUI Admin</title>
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

<body>
	<div class="container-scroller">
		<!-- partial:../../partials/_navbar.html -->
		<jsp:include page="header.jsp"></jsp:include>
		<!-- partial -->
		<div class="container-fluid page-body-wrapper">
			<!-- partial:../../partials/_sidebar.html -->
			<jsp:include page="menu.jsp"></jsp:include>

			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row grid-margin">
						<div class="col-12">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Bootstrap Maxlength</h4>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Default usage</label>
										</div>
										<div class="col-lg-8">
											<input class="form-control" maxlength="25"
												name="defaultconfig" id="defaultconfig" type="text"
												placeholder="Type Something..">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Few options</label>
										</div>
										<div class="col-lg-8">
											<input class="form-control" maxlength="20"
												name="defaultconfig-2" id="defaultconfig-2" type="text"
												placeholder="Type Something..">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">All the options</label>
										</div>
										<div class="col-lg-8">
											<input class="form-control" maxlength="10"
												name="defaultconfig-3" id="defaultconfig-3" type="text"
												placeholder="Type Something..">
										</div>
									</div>
									<div class="form-group row">
										<div class="col-lg-3">
											<label class="col-form-label">Text Area</label>
										</div>
										<div class="col-lg-8">
											<textarea id="maxlength-textarea" class="form-control"
												maxlength="100" rows="2"
												placeholder="This textarea has a limit of 100 chars."></textarea>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row grid-margin">
						<div class="col-lg-12">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Basic form validation</h4>
									<form class="cmxform" id="commentForm" method="get" action="#">
										<fieldset>
											<div class="form-group">
												<label for="cname">Name (required, at least 2
													characters)</label> <input id="cname" class="form-control"
													name="name" minlength="2" type="text" required>
											</div>
											<div class="form-group">
												<label for="cemail">E-Mail (required)</label> <input
													id="cemail" class="form-control" type="email" name="email"
													required>
											</div>
											<div class="form-group">
												<label for="curl">URL (optional)</label> <input id="curl"
													class="form-control" type="url" name="url">
											</div>
											<div class="form-group">
												<label for="ccomment">Your comment (required)</label>
												<textarea id="ccomment" class="form-control" name="comment"
													required></textarea>
											</div>
											<input class="btn btn-primary" type="submit" value="Submit">
										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-12">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Complete form validation</h4>
									<form class="cmxform" id="signupForm" method="get" action="#">
										<fieldset>
											<div class="form-group">
												<label for="firstname">Firstname</label> <input
													id="firstname" class="form-control" name="firstname"
													type="text">
											</div>
											<div class="form-group">
												<label for="lastname">Lastname</label> <input id="lastname"
													class="form-control" name="lastname" type="text">
											</div>
											<div class="form-group">
												<label for="username">Username</label> <input id="username"
													class="form-control" name="username" type="text">
											</div>
											<div class="form-group">
												<label for="password">Password</label> <input id="password"
													class="form-control" name="password" type="password">
											</div>
											<div class="form-group">
												<label for="confirm_password">Confirm password</label> <input
													id="confirm_password" class="form-control"
													name="confirm_password" type="password">
											</div>
											<div class="form-group">
												<label for="email">Email</label> <input id="email"
													class="form-control" name="email" type="email">
											</div>
											<input class="btn btn-primary" type="submit" value="Submit">
										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:../../partials/_footer.html -->
				<footer class="footer">
					<div
						class="d-sm-flex justify-content-center justify-content-sm-between">
						<span
							class="text-muted text-center text-sm-left d-block d-sm-inline-block">Copyright
							� 2018 <a href="https://www.urbanui.com/" target="_blank">Urbanui</a>.
							All rights reserved.
						</span> <span
							class="float-none float-sm-right d-block mt-1 mt-sm-0 text-center">Hand-crafted
							& made with <i class="mdi mdi-heart text-danger"></i>
						</span>
					</div>
				</footer>
				<!-- partial -->
			</div>
			<!-- main-panel ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
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
	<script src="<%=request.getContextPath()%>/adminResources/js/form-validation.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/bt-maxLength.js"></script>
	<!-- End custom js for this page-->
</body>

</html>
