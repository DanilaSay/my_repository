
<!DOCTYPE html>
<html lang="en" xmlns:th="http://thymeleafe.org">
<head>
<title>All data about flights</title>
</head>
<body>

	<div th:each="flights : ${flights}">
		<a th:text="${flights.getOriginStateName()}">flight</a>
		<a th:text="${flights.getCancellationCode()}">flight</a>

	</div>

</body>
</html>