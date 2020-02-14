layui.use(['form', 'layer', 'upload', 'laydate', 'okAddlink'], function () {
    var form = layui.form;
    var upload = layui.upload;
    var $ = layui.jquery;
    var layDate = layui.laydate;
    var $form = $('form');
    okLoading.close();
    layDate.render({
        elem: '#uDate', //指定元素
        max: "2021-1-1",
        value: '2020-01-13',
    });

});