<%--
  Created by IntelliJ IDEA.
  User: private
  Date: 18.05.2018
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rest</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<body>
<h3>Rest</h3><hr>
<input type="" name="email" placeholder="email">
<button id="add">Add</button>



<br>
<button id="get">Get</button>
<div class="convert"></div>
<script>


    $("#add").click(function () {
       let email = $ ("[name=email]").val();
       console.log(email);

       // $.ajax({
       //     url: '/saveUserRest',
       //     type: 'post',
       //     data: JSON.stringify({email}),
       //     headers: {
       //         'Accept': 'application/json',
       //         'Content-Type': 'application/json'
       //     },
       //     dataType: 'json',
       //     success: function (res) {
       //         console.log(res);
       //     },
       //     error: function (err) {
       //         console.log(err)
       //     }
       // });
        $.ajax ({
            url: '/save/'+email,
            type: 'PUT',
            success: function (res) {
                console.log(res);
            },
            error: function (err) {
                console.log(err);
            }


        })
    });


    $ ("#get").click(function () {
        $ (".convert").empty();
        $.ajax({
            url:'/getAllUsers',
            type:'GET',
            contentType: 'application/json',
            success: function (res) {
                console.log(res);
                for (let obj of res) {
                   let $div = $('<div/>' , {text:obj.id + " " + obj.email});
                   $ (".convert").append($div);
                }
            },
            error: function (err) {
                console.log(err);
            }
        })
    })

</script>

</body>
</html>
