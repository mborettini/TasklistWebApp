<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<h2>Hello World!</h2>
<c:out value="${sessionScope.get('USER')}"/>

</body>
</html>
