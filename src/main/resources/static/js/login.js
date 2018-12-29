function login() {
    console.log("登录")
    var newphone = $('#phone').val();
    var newpassword = $('#password').val();
    var url = '/user/login';
    $.ajax({
        url: url,
        type: 'get',
        dataType: 'json',
        data:{
            "phone": newphone,
            "password": newpassword
        },
        success:function (data) {
            if(data == 1){
                console.log("登陆成功");
                window.location.href = "/article/tolist";
            }else if(data == 2){
                alert("手机号输入错误！");
            }else if(data == 3){
                alert("密码输入错误");
            }
        }
    })
}