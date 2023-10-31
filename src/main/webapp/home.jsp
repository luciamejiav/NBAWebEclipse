<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">

<head>
<title>Teams NBA</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">

</head>

<body>
	<div class="container shadow">
		<header>
			<div class="row bg-primary text-white py-3">
				<div class="col-2">
					<img src="img/logonba.jpg" alt="" width="70">
				</div>
				<div class="col-10">
					<h1 class="text-center">Teams NBA</h1>
				</div>
			</div>
		</header>
		<main>
			<div class="row">
				<c:forEach items="${teams}" var="team">
					<div class="col-xl-2 col-lg-3 col-md-4 col-sm-6 d-flex mb-2">
						<div class="card flex-fill">
							<a href="Controller?op=detail&teamname=<c:out value="${team.name}"/>"> 
							<img class="card-img-top"
								src="<c:out value="${team.teamLogoUrl}"/>" alt="Title">
							</a>
							<div class="card-body">
								<h4 class="card-title">
									<c:out value="${team.name}" />
								</h4>
							</div>
						</div>
					</div>
				</c:forEach>
			</div>
		</main>
		<footer>
			<!-- place footer here -->
		</footer>
	</div>

	<!-- Bootstrap JavaScript Libraries -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous">
		
	</script>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
		integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
		crossorigin="anonymous">
		
	</script>
</body>

</html>