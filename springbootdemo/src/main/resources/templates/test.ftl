<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>asdfasd</title>
    <style>
        tr{
            width: 40%;
        }
        td{
            width: 10%;
        }
    </style>
</head>
<body>

    <table>
        <tr>
            <td>用户ID</td>
            <td>姓名</td>
            <td>性别</td>
        </tr>
        <#list testList as list>
            <tr>
                <td>${list.idd}</td>
                <td>${list.username}</td>
                <td>${list.sex}</td>
            </tr>
        </#list>
    </table>

</body>
</html>