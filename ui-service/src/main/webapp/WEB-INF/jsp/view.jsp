<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>

<head>
    <title>Hello view</title>
</head>

<body>
<div id="jsp-hello">Hello from JSP</div>
<div id="api-hello"></div>
<br/>

<script type="text/javascript">
    fetch('/hello/micro_view')
        .then(response => response.text())
        .then(response => document.body.innerHTML += response);

    fetch('/goodbye/micro_view')
        .then(response => response.text())
        .then(response => document.body.innerHTML += response);
</script>
</body>


</html>