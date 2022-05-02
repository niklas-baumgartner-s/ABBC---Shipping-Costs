//REDIRECTS USER TO THE WEBPAGES ON CLICK-EVENT

$(document).ready(function () {
    $("#home").click(function (){
        window.location.replace("/home");
    });

    $("#product-page").click(function (){
        window.location.replace("/product-page");
    });

    $("#cart-page").click(function (){
        window.location.replace("/cart-page");
    });

    $("#account-page").click(function (){
        window.location.replace("/account-page");
    });

    $("#service-page").click(function (){
        window.location.replace("/service-page");
    });

});