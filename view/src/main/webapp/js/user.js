$(document).ready(function(){
    //getStockUpdate();
    //setInterval(getStockUpdate,5000);
    getUserCreate();
});

function getUserCreate(){
        var user = {};
        user.id = $("#createId").val();
        user.firstName = $("#createFirstName").val();
        user.lastName = $("#createLastName").val();
        user.age = $("#createAge").val();


        $.ajax({
            url:"/user",
            dataType: "json",
            type: "PUT",
            success: function(data){
                $("#idUser").html(data.id);
                $("#firstNameUser").html(data.firstName);
                $("#lastNameUser").html(data.lastName);
                $("#ageUser").html(data.age);
            }
        });
}
