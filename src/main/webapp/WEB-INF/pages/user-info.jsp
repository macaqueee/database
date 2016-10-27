<%@ page import="universe.model.Group" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Group info</title>
</head>
<body>
 <%Group transfered = (Group) request.getAttribute("group"); %>
<div    class="container">
    <ul>
        <li>
            <div class="groupId">
                name : <%= transfered.getId() %>
            </div>
        </li>
        <li>
            <div class="groupName">
                name : <%= transfered.getName() %>
            </div>
        </li>
           </ul>

</div>

</body>
</html>
