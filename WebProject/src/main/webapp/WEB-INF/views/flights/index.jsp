
<!DOCTYPE html>
<html lang="en" xmlns:th="http://thymeleafe.org">
<head>
<title>Все данные о рейсах</title>
</head>
<body>

	<div th:each="flights : ${flights}">
		<a th:text="${flights.getOriginStateName()}">flight</a>
	</div>

</body>
</html>