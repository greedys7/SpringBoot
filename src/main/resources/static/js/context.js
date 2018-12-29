
function saveComment(){
    console.log("提交评论")
    var c_content = $('#c_content').val();
    var a_id = $('#a_id').val();
    var url = '/comment/toSave';
    $.ajax({
        url: url,
        type: 'get',
        dataType: 'text',
        data:{
            "c_content": c_content,
            "a_id": a_id
        },
        success:function (data) {
            alert(data);
            window.location.href = "/article/toContent";
        },
        error:function(data){
        }
    })
}