<%--
  Created by IntelliJ IDEA.
  User: Asd
  Date: 10/4/2018
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Queue" %>
<%@ page import="java.util.ArrayList" %>

<html>


<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//malsup.github.com/jquery.form.js"></script>



    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $('#getState').click(function (){
                $.ajax({

                    type: "Get",
                    url: "/cool",
                    success: function(msg){$('#output').text(msg);}
                });
            });

            $('#putState').click(function (){
                $.ajax({
                    type: "put",
                    url: "/cool",
                    success: function(msg){$('#output').text(msg);}
                });
            });

            $('#postState').click(function (){
                $.ajax({
                    type: "post",
                    url: "/cool",
                    success: function(msg){$('#output').text(msg);}
                });
            });

            $('#deleteState').click(function (){
                $.ajax({
                    type: "delete",
                    url: "cool",
                    success: function(msg){
                        $('#output').text(msg);
                    }
                });
            });
        });



    </script>



<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>

<input type="button" value="Get" id="getState"/>
<input type="button" value="Put" id="putState"/>
<input type="button" value="Post" id="postState"/>
<input type="button" value="Delete" id="deleteState"/>
<div id="output"></div>
</body>



</html>