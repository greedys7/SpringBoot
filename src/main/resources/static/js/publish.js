
function save() {
    console.log("新增消息")
    var a_title = $('#a_title').val();
    var a_content = $('#a_content').val();
    console.log(a_content);
    var url = '/article/toPublish';
    $.ajax({
        url: url,
        type: 'get',
        dataType: 'text',
        data:{
            "a_title": a_title,
            "a_content": a_content
        },
        success:function (data) {
            window.location.href = "/article/tolist";
        },
        error:function(data){
        }
    })
}