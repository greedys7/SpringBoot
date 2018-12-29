function save() {
    console.log("修改消息")
    var a_id = $('#a_id').val();
    var a_title = $('#a_title').val();
    var a_content = $('#a_content').val();
    var url = '/article/toUpdate';
    $.ajax({
        url: url,
        type: 'get',
        dataType: 'text',
        data:{
            "a_id": a_id,
            "a_title": a_title,
            "a_content": a_content
        },
        success:function (data) {
            window.location.href = "/article/toMyArticleList";
        },
        error:function(data){
        }
    })
}