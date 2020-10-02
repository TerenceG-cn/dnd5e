$(function () {
    layui.use(['form', 'upload'], function () {
        var form = layui.form, layer = layui.layer, upload = layui.upload;

        //监听提交
        form.on('submit(formDemo)', function (data) {
            console.log("提交");
            $.ajax({
                type: "POST",
                url: "/monster/addMonster",
                data: data.field,
                dataType: "json",
                success: function (message) {
                    layer.alert(message.msg+" success");
                },
                error: function (message) {
                    layer.alert(message.msg+" error");
                }
            });
            console.log("wsnd");

            return false;
        });

        //多图片上传  这里一定是 layui的ajax请求 发送图片 controller回传json格式的数据给我们 提示上传成功或者失败
        upload
            .render({
                elem: '#test2',
                url: '/item/fileUpload' //改成您自己的上传接口
                ,
                multiple: true,
                before: function (obj) {
                    //预读本地文件示例，不支持ie8
                    obj
                        .preview(function (index,
                                           file, result) {
                            $('#demo2')
                                .append(
                                    '<img style="height: 100px;width: 100px" src="' + result + '" alt="' + file.name + '" class="layui-upload-img">')
                        });
                },
                done: function (res) {
                    /*
                        两种可能行
                        1.返回的结果集 必须按照某一种规格的json格式返回
                     */
                    $("#imageUpload").val(
                        $("#imageUpload").val()
                        + res.data.src);

                }
            });

    });
})
