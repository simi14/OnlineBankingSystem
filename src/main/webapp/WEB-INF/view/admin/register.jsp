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
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="content-wrapper d-flex align-items-center auth">
				<div class="row w-100">
					<div class="col-lg-4 mx-auto">
						<div class="auth-form-light text-left p-5">
							<div class="brand-logo">
								<img src="<%=request.getContextPath()%>/adminResources/images/logo.svg" alt="logo">
							</div>
							<h4>New here?</h4>
							<h6 class="font-weight-light">Signing up is easy. It only
								takes a few steps</h6>
							<form class="pt-3">
								<div class="form-group">
									<input type="text" class="form-control form-control-lg"
										id="exampleInputFirstname1" placeholder="First Name">
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-lg"
										id="exampleInputMiddlename1" placeholder="Middle Name">
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-lg"
										id="exampleInputLastname1" placeholder="Last Name">
								</div>
								<div class="form-group">
									<input type="tel" class="form-control form-control-lg"
										id="exampleInputMobileno1" placeholder="Mobile No">
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-lg"
										id="exampleInputUsername1" placeholder="Username">
								</div>
								<div class="form-group">
									<input type="password" class="form-control form-control-lg"
										id="exampleInputPassword1" placeholder="Password">
								</div>
								<div class="form-group">
									<input type="password" class="form-control form-control-lg"
										id="exampleInputConfirmpassword1" placeholder="Confirm Password">
								</div>
								<div class="form-group">
									<input type="text" class="form-control form-control-lg"
										id="exampleInputDate1" placeholder="Date Of Birth" onfocus="(this.type='date')" onblur="(this.type='text')">
								</div>
								<div class="form-group">
									<textarea rows="5" cols="" class="form-control form-control-lg"
										id="exampleInputAddress1" placeholder="Address"></textarea>
								</div>
								<!--  <div class="form-group">
                  <input type="email" class="form-control form-control-lg" id="exampleInputEmail1" placeholder="Email">
                </div>
                <div class="form-group">
                  <select class="form-control form-control-lg" id="exampleFormControlSelect2">
                    <option>Country</option>
                    <option>United States of America</option>
                    <option>United Kingdom</option>
                    <option>India</option>
                    <option>Germany</option>
                    <option>Argentina</option>
                  </select>
                </div> -->

								<div class="mb-4">
									<div class="form-check">
										<label class="form-check-label text-muted"> <input
											type="checkbox" class="form-check-input"> I agree to
											all Terms & Conditions
											<i class="input-helper"></i>
										</label>
										
									</div>
								</div>
								<div class="mt-3">
									<a
										class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn"
										href="../../index.html">SIGN UP</a>
								</div>
								<div class="text-center mt-4 font-weight-light">
									Already have an account? <a href="login.html"
										class="text-primary">Login</a>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
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
</body>

</html>
