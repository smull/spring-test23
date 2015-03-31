<%--
  Created by IntelliJ IDEA.
  User: SMULL
  Date: 3/25/2015
  Time: 11:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IndexPrice</title>
    <script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="/js/price.js"></script>
</head>
<body>
    <table>
        <caption>Price Company</caption>
        <thead>
                <th>Company</th>
                <th>Price</th>
                <th>Volume</th>
        </thead>
        <tbody>
            <tr id="APPLE">
                <td id="APPLE_COM">APPLE</td>
                <td id="APPLE_PRICE"></td>
                <td id="APPLE_VOLUME"></td>
            </tr>
            <tr id="EPAM">
                <td id="EPAM_COM">EPAM</td>
                <td id="EPAM_PRICE"></td>
                <td id="EPAM_VOLUME"></td>
            </tr>
            <tr id="FB">
                <td id="FB_COM">FB</td>
                <td id="FB_PRICE"></td>
                <td id="FB_VOLUME"></td>
            </tr>
        </tbody>

    </table>
</body>
</html>
