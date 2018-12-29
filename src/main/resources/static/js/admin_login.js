function adminLogin() {
    console.log("登录")
    var newphone = $('#phone').val();
    var newpassword = $('#password').val();
    var url = '/management/toLogin';
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
                console.log("登录成功");
                window.location.href = "/management/tolist";
            }else if(data == 2){
                alert("手机号输入错误！");
            }else if(data == 3){
                alert("密码输入错误");
            }else if(data!=4){
                alert("对不起！您没有权限登录该系统！")
            }
        }
    })
}