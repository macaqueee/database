<%@include file="include.jsp"%>
<html>
<head>
    <title>Create form</title>
</head>
<body>


<div class="container">
    <h1>Input register info</h1>

    <form method="post" action="student">
        <ul>
            <li>Input name:
                <input name="name" type="text">
            </li>
            <li>Input group name:
                <input name="groupName" type="text">
            </li>
            <li>Submit:
                <input type="submit">
            </li>
        </ul>
    </form>


</div>


</body>
</html>