<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin</title>
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
		<!-- partial:partials/_navbar.html -->
		<jsp:include page="header.jsp"></jsp:include>


		<!-- partial -->
		<div class="container-fluid page-body-wrapper">

			<!-- partial:partials/_sidebar.html -->

			<jsp:include page="menu.jsp"></jsp:include>

			<!-- partial -->
			<div class="main-panel">
				<div class="content-wrapper">
					<div class="row">
						<div class="col-lg-3 col-md-6 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<div
										class="d-flex justify-content-between flex-wrap align-items-center">
										<div
											class="img-sm bg-primary rounded-md d-flex align-items-center justify-content-center text-white">
											<i class="mdi mdi-chart-line-variant icon-md"></i>
										</div>
										<div class="text-right text-md-center text-lg-left ml-lg-4">
											<h1 class="font-weight-bold mb-0">81977</h1>
											<p class="mb-0">Sales</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-md-6 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<div
										class="d-flex justify-content-between flex-wrap align-items-center">
										<div
											class="img-sm bg-danger rounded-md d-flex align-items-center justify-content-center text-white">
											<i class="mdi mdi-emoticon icon-md"></i>
										</div>
										<div class="text-right text-md-center text-lg-left ml-lg-4">
											<h1 class="font-weight-bold mb-0">69163</h1>
											<p class="mb-0">Revenue</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-md-6 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<div
										class="d-flex justify-content-between flex-wrap align-items-center">
										<div
											class="img-sm bg-warning rounded-md d-flex align-items-center justify-content-center text-white">
											<i class="mdi mdi-run icon-md"></i>
										</div>
										<div class="text-right text-md-center text-lg-left ml-lg-4">
											<h1 class="font-weight-bold mb-0">75891</h1>
											<p class="mb-0">Visitors</p>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-3 col-md-6 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<div
										class="d-flex justify-content-between flex-wrap align-items-center">
										<div
											class="img-sm bg-success rounded-md d-flex align-items-center justify-content-center text-white">
											<i class="mdi mdi-chart-donut icon-md"></i>
										</div>
										<div class="text-right text-md-center text-lg-left ml-lg-4">
											<h1 class="font-weight-bold mb-0">93171</h1>
											<p class="mb-0">Orders</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-4 grid-margin stretch-card">
							<div class="card">
								<div
									class="card-body d-flex flex-column justify-content-between">
									<h4 class="card-title mb-lg-0">Overview</h4>
									<div class="w-50 mx-auto">
										<canvas id="traffic-chart" width="100" height="100"></canvas>
									</div>
									<div id="traffic-chart-legend"
										class="chartjs-legend traffic-chart-legend"></div>
								</div>
							</div>
						</div>
						<div class="col-lg-4 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<div class="d-flex justify-content-between">
										<h6 class="card-title">Activity</h6>
									</div>
									<div class="list d-flex pb-3">
										<img class="img-sm rounded-md"
											src="<%=request.getContextPath()%>/adminResources/images/face8.jpg" alt="">
										<div class="wrapper w-100 ml-3">
											<p>
												<b>Dobrick </b>published an article
											</p>
											<small class="text-primary font-weight-medium">2
												hours ago</small>
										</div>
									</div>
									<div class="list d-flex py-3">
										<img class="img-sm rounded-md"
											src="<%=request.getContextPath()%>/adminResources/images/face5.jpg" alt="">
										<div class="wrapper w-100 ml-3">
											<p>
												<b>Stella </b>created an event
											</p>
											<small class="text-primary font-weight-medium">3
												hours ago</small>
										</div>
									</div>
									<div class="list d-flex py-3">
										<img class="img-sm rounded-md"
											src="<%=request.getContextPath()%>/adminResources/images/face7.jpg" alt="">
										<div class="wrapper w-100 ml-3">
											<p>
												<b>Peter </b>submitted the reports
											</p>
											<small class="text-primary font-weight-medium">1
												hours ago</small>
										</div>
									</div>
									<div class="list d-flex pt-3">
										<img class="img-sm rounded-md"
											src="<%=request.getContextPath()%>/adminResources/images/face6.jpg" alt="">
										<div class="wrapper w-100 ml-3">
											<p>
												<b>Nateila </b>updated the docs
											</p>
											<small class="text-primary font-weight-medium">1
												hours ago</small>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-4 grid-margin stretch-card">
							<div class="card">
								<div
									class="card-body d-flex flex-column justify-content-between">
									<h4 class="card-title">Sales</h4>
									<canvas id="analysis-chart"></canvas>
									<div class="d-lg-flex justify-content-around mt-3">
										<div class="text-center mb-3 mb-lg-0">
											<h3 class="font-weight-normal text-primary">+40%</h3>
											<p class="text-primary font-weight-medium mb-0">Growth</p>
										</div>
										<div class="text-center mb-3 mb-lg-0">
											<h3 class="font-weight-normal text-danger">2%</h3>
											<p class="text-danger font-weight-medium mb-0">Refund</p>
										</div>
										<div class="text-center">
											<h3 class="font-weight-normal text-success">+23%</h3>
											<p class="text-success font-weight-medium mb-0">Online</p>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-4 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">News feed</h4>
									<ul class="bullet-line-list">
										<li>
											<p class="text-muted mb-2">24 May 2018</p>
											<p>Vacation Home Rental Success</p>
										</li>
										<li>
											<p class="text-muted mb-2">25 May 2018</p>
											<p>Online Games How To Play To Win</p>
										</li>
										<li>
											<p class="text-muted mb-2">26 May 2018</p>
											<p>Big Savings On Gas</p>
										</li>
										<li>
											<p class="text-muted mb-2">27 May 2018</p>
											<p class="mb-0">A Time Travel Postcard</p>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="col-lg-8 grid-margin stretch-card">
							<div class="card">
								<div
									class="card-body d-flex flex-column justify-content-between">
									<h4 class="card-title">Revenue</h4>
									<canvas id="statistics-chart"></canvas>
								</div>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-lg-7 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Product sales</h4>
									<div class="table-responsive">
										<table class="table">
											<thead>
												<tr>
													<th>#</th>
													<th>Products</th>
													<th>Product ID</th>
													<th>Sales</th>
													<th>Remarks</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>1</td>
													<td>La Dolce Vita</td>
													<td>874-872-3351</td>
													<td>44479</td>
													<td><label class="badge badge-success">High</label></td>
												</tr>
												<tr>
													<td>2</td>
													<td>Party Jokes</td>
													<td>874-872-3352</td>
													<td>44479</td>
													<td><label class="badge badge-danger">Low</label></td>
												</tr>
												<tr>
													<td>3</td>
													<td>Tremblant In Canada</td>
													<td>874-872-3353</td>
													<td>44479</td>
													<td><label class="badge badge-success">High</label></td>
												</tr>
												<tr>
													<td>4</td>
													<td>Copper Canyon</td>
													<td>874-872-3354</td>
													<td>44479</td>
													<td><label class="badge badge-warning">Medium</label>
													</td>
												</tr>
												<tr>
													<td>5</td>
													<td>La Dolce Vita</td>
													<td>874-872-3355</td>
													<td>44479</td>
													<td><label class="badge badge-danger">Low</label></td>
												</tr>
												<tr>
													<td>6</td>
													<td>High Seirra</td>
													<td>874-872-3356</td>
													<td>44479</td>
													<td><label class="badge badge-success">High</label></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
						<div class="col-lg-5 grid-margin stretch-card">
							<div class="card">
								<div class="card-body">
									<h4 class="card-title">Profits</h4>
									<div class="table-responsive">
										<table class="table">
											<tbody>
												<tr>
													<td class="border-0 pt-0"><img
														src="<%=request.getContextPath()%>/adminResources/images/brand-logo-1.png" alt="icon" />
													</td>
													<td class="border-0 pt-0">
														<p>Dribbble</p>
														<p class="text-muted mb-0">North Jermain</p>
													</td>
													<td class="text-primary border-0 pt-0">21760</td>
												</tr>
												<tr>
													<td><img src="<%=request.getContextPath()%>/adminResources/images/brand-logo-2.png"
														alt="icon" /></td>
													<td>
														<p>Adidas</p>
														<p class="text-muted mb-0">Bahamas</p>
													</td>
													<td class="text-primary">17602</td>
												</tr>
												<tr>
													<td><img src="<%=request.getContextPath()%>/adminResources/images/brand-logo-3.png"
														alt="icon" /></td>
													<td>
														<p>New Kattie</p>
														<p class="text-muted mb-0">Italy</p>
													</td>
													<td class="text-primary">72160</td>
												</tr>
												<tr>
													<td><img src="<%=request.getContextPath()%>/adminResources/images/brand-logo-4.png"
														alt="icon" /></td>
													<td>
														<p>Anahiborough</p>
														<p class="text-muted mb-0">Kyrgyz Republic</p>
													</td>
													<td class="text-primary">62170</td>
												</tr>
												<tr>
													<td><img src="<%=request.getContextPath()%>/adminResources/images/brand-logo-5.png"
														alt="icon" /></td>
													<td>
														<p>Schoenberg</p>
														<p class="text-muted mb-0">Bulgaria</p>
													</td>
													<td class="text-primary">12760</td>
												</tr>
												<tr>
													<td><img src="<%=request.getContextPath()%>/adminResources/images/brand-logo-6.png"
														alt="icon" /></td>
													<td>
														<p>South Earnestine</p>
														<p class="text-muted mb-0">Saint Helena</p>
													</td>
													<td class="text-primary">21607</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- content-wrapper ends -->
				<!-- partial:partials/_footer.html -->
				<%-- <jsp:include page="footer.jsp"></jsp:include> --%>
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
	<!-- Plugin js for this page-->
	<!-- End plugin js for this page-->
	<!-- inject:js -->
	<script src="<%=request.getContextPath()%>/adminResources/js/off-canvas.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/hoverable-collapse.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/template.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/settings.js"></script>
	<script src="<%=request.getContextPath()%>/adminResources/js/todolist.js"></script>
	<!-- endinject -->
	<!-- Custom js for this page-->
	<script src="<%=request.getContextPath()%>/adminResources/js/dashboard.js"></script>
	<!-- End custom js for this page-->
</body>

</html>

