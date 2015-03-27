$(document).ready(function(){

    //getPrice();
    getUpdate();


});


function getPrice() {
    var companies = $("tr").each(function (index, element) {
            var company = element.id;
            console.log("dsds");
            $.ajax({
              url: "/info?company="+company,
              dataType: "json",
              success: function( data) {
                  // var company = data.company;
                  $("#" + data.companyName + "_PRICE").html(data.price);
                  $("#" + data.companyName + "_VOLUME").html(data.volume);
                  console.log("111");
              }
            });
        });
}


function update(data){
    var company = data.company;
    $("#"+company+"_PRICE").html(data.price);
    $("#"+company+"_VOLUME").html(data.volume);
}


function getUpdate() {

    console.log("222");
    var objectStock = {};
    objectStock.stockPriceMines = [];
    objectStock.stockPriceMines.push({companyName: "Jerry",price: 20.3, volume: 23.44});
    objectStock.stockPriceMines.push({companyName: "Kite",price: 220.3, volume: 35.88});
    objectStock.stockPriceMines.push({companyName: "Pir",price: 100.5, volume: 54.77});

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/update",
        dataType: "json",
        data: JSON.stringify(objectStock),
        success: function ( data ) {
            $("tr").each(function (index, element) {
               $("#" + element.companyName + "_PRICE").html(element.price);
                $("#" + element.companyName + "_VOLUME").html(element.volume);
            });
        }
    });
}

//success: function(data) {
//    update(data);
//}