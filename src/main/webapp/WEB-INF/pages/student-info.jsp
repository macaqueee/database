<%@include file="include.jsp"%>
<html>
<head>
    <title>Student info</title>
</head>
<body>
<c:set var ="transfered" value="${student}"/>
<div    class="container">
    <ul>
        <li>
            <div class="column">
                name : ${transfered.name}
            </div>
        </li>
        <li>
            <div class="column">
                groupName : ${transfered.group.name}
            </div>
        </li>
    </ul>

</div>

</body>
</html>
