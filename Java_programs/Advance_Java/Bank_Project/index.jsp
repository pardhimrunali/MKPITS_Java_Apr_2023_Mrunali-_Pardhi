<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <title>bank Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <style>
        .second{
            margin-top: 30px;
        }
        .first{
            border-radius: 20px;
            height: 300px;
            width: 500px;
            margin-top: 100px;
            margin-left: 400px;
            background: rgb(34,193,195);
            background: radial-gradient(circle, rgba(34,193,195,1) 0%, rgba(166,85,135,0.6362920168067228) 100%);
        }
        body{background: rgb(238,174,202);
            background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,233,229,1) 100%);
        }
    </style>
</head>
<body>


<center><h1>Your Money Is Safe With Us....!!!</h1></center>
<div class="first">
    <form action="" method="post"   class="second">
        <table align="center" cellspacing="50" cellpadding="20">
            <tr>
                <td><em><b><label>USER ID-</label></b></em></td>
                <td><input type="text"  class="btn btn-light" name="user" ></td>
            </tr>

            <tr>
                <td><em><b><label >PASSWORD-</label></b></em></td>
                <td><input type=password  class="btn btn-light"  name="pass" ></td>

            </tr>
            <tr>
                <td colspan="2" align="center"> <i>
                    <input type="submit" value="LOG IN"></i></td>

            </tr>
            <tr>
                <td colspan="2" align="center"><a href="admin.html"><i>Admin</i></a></td>

            </tr>

        </table>
    </form >

</div>

<table  class="base" align="center">
    <tr>
        <td  align="center"><em><b>NEW USER?<a href="registration.html">REGISTER HERE</a></b></em></td>

    </tr>

</table>
</center>

</body>
</html>