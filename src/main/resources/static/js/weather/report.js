/**
 * report页面下拉框事件
 * auther:waylau.com
 */
$(function(){
    $("#selectedCityId").change(function(){
        var cityId = $("#selectedCityId").val();
        var url = '/weatherReport/report/cityId/'+ cityId;
        window.location.href = url;
    })
});
