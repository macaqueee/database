<%@include file="include.jsp"%>
<html>
<head>
    <title>Student info</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
<c:set var ="students" value="${students}"/>

<div align="center">
    <label>Name</label>
    <label>Group name</label>
</div>
<div align="center">
    <input id="studentName" type="text"><br>
    <input id="groupName" type="text"><br>
</div>
<div id="studentsInfo" align="center">
    <button id="createButton" onclick="sendAjaxReqJquery()">Create
    </button>
    <button id="updateButton">Delete
    </button>
    <button id="deleteButton">Edit

    </button>
</div>
<div align="center" style="width: 1024px; margin: 30px auto;">
    <table id="table_id" class="display">
        <thead>
        <tr>
            <th>Id</th>
            <th>First name</th>
        </tr>
        </thead>
        <tbody id="tBody">
        <c:forEach items="${students}" var="student">
            <tr>
                <th>${student.id}</th>
                <th>${student.name}</th>
                <th>${student.group.name}</th>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>


</body>
<script>

    function sendAjaxReqJquery() {

        var studentName = $("#studentName").val();
        var groupName = $("#groupName").val();
        var url = "student";
        var confObj = {
            type: "POST",
            url: url,
            data: {name: studentName,
                   groupName: groupName},
            success: function(result){
                $("#responseText").html(result);
            }
        };
        $.ajax(confObj);
    }

</script>
</html>
