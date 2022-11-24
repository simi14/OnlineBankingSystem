<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Admin | Add Branch</title>
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

<script type="text/javascript">
function getCity()
{
var x=document.getElementById("exampleSelectState");
var y=document.getElementById("exampleSelectCity");
console.log("dsmkdk",x);
var htp=new XMLHttpRequest();
htp.onreadystatechange=function()
{
	//alert("stages");
	if(htp.readyState==4)
	{
		 var jsn=JSON.parse(htp.responseText);
		 for(var i=0;i<jsn.length;i++)
		 {
			 var otp=document.createElement("option");
			 otp.value=jsn[i].cityid;
			 otp.text=jsn[i].cityname;
			 y.options.add(otp);
		 }
		
	}
}
htp.open("post","getCity?stateId="+x.value,true);
htp.send();
y.options.length=0;
}
</script>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<body>
	<f:form action="insertBranch" post="Post" modelAttribute="branchVO">
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
									<h4 class="card-title">Add Branch</h4>
										<div class="form-group">
											<label for="exampleInputName1">Area</label> <!-- <input
												type="text" class="form-control" id="exampleInputName1"
												placeholder="Name"> -->
												<f:input path="branchName"  class="form-control" placeholder="Area" />
										</div>
										<div class="form-group">
											<label for="exampleInputIFSC1">IFSC Code</label> <!-- <input
												type="text" class="form-control" id="exampleInputIFSC1"
												placeholder="IFSC Code"> -->
											<f:input path="ifscCode" placeholder="IFSC Code" class="form-control"  />
										</div>
											<f:hidden path="branchId" />
										
										<div class="form-group">
											<label for="exampleSelectState">State</label> <!-- <select
												class="form-control" id="exampleSelectState">
												<option>1</option>
												<option>2</option> 
											</select>-->
											<f:select path="stateVO.state_id" class="form-control" id="exampleSelectState" onclick="getCity()">
											<option selected="selected" value="none">Select State</option>
											<c:forEach items="${sessionScope.state_list}" var="i">
											<f:option value="${i.state_id}">${i.state_name}</f:option>
											</c:forEach>
											</f:select>
										</div>
										<div class="form-group">
											<label for="exampleSelectCity">City</label><!--  <select
												class="form-control" id="exampleSelectCity">
												<option>1-1</option>
												<option>1-2</option>
											</select> -->
										<f:select path="cityVO.city_id" class="form-control" id="exampleSelectCity">
										<option selected="selected" value="none">Select City</option>
										</f:select>
										</div>

										<div class="form-group">
											<label for="exampleAddress1">Address</label>
											<f:textarea path="branchAddress" class="form-control" rows="4"/>
											<!-- <textarea class="form-control" id="exampleAddress1" rows="4"></textarea> -->
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
