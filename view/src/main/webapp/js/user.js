$(document).ready(function(){
    //getStockUpdate();
    //setInterval(getStockUpdate,5000);
    console.log("111111");
    setInterval(function () {
        $.ajax({
            contentType: "application/json",
            url: '/user/get/all',
            dataType: 'json',
            success: function (data) {
                console.log("3232");
                $('#tbody').html('');
                for (var i = 0; i < data.length; i++) {
                    var tr = "<tr id=" + data[i]["id"] + ">";
                    var td1 = "<td id='id'>" + data[i]["id"] + "</td>";
                    var td2 = "<td id='firstName'>" + data[i]["firstName"] + "</td>";
                    var td3 = "<td id='lastName'>" + data[i]["lastName"] + "</td>";
                    var td4 = "<td id='age'>" + data[i]["age"] + "</td>";
                    $("#tbody").append(tr + td1 + td2 + td3 + td4);
                }
            }
        });
    }, 500);

    $('#buttonCreateUser').bind('click', function() {

        var user = {};
        user.id = $("input[name='id']").val();
        user.firstName = $("input[name='firstName']").val();
        user.lastName = $("input[name='lastName']").val();
        user.age = $("input[name='age']").val();

        $.ajax({
            contentType: "application/json",
            url: '/user/res',
            dataType: 'json',
            method: 'PUT',
            data: JSON.stringify(user)
        });


    });

    //console.log("dsds");

    //getUserCreate();
});





function getUserCreate(){
        var user = {};
        user.id = $("#createId").val();
        user.firstName = $("#createFirstName").val();
        user.lastName = $("#createLastName").val();
        user.age = $("#createAge").val();


    event.preventDefault();
    $.ajax({
        contentType: "application/json",
        url: '/user/res',
        dataType: 'json',
        method: 'PUT',
        data: {
            id: $("input[name='id']").val(),
            firstName: $("input[name='firstName']").val(),
            lastName: $("input[name='lastName']").val(),
            age: $("input[name='age']").val()
        },
        success: function() {

        },
        error: function(jqXHR, textStatus, errorThrown){
            alert('create error: ' + textStatus);
        }
    });
}
