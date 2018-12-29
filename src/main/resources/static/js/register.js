
//获取验证码
var mfbtn=document.getElementById('rcbtn');
var countdown = 60;
function settime(obj) {
    if (countdown == 0) {
        obj.disabled=false;
        obj.innerHTML="获取验证码";
        countdown = 60;
        return;
    } else {
        obj.disabled=true;
        obj.innerHTML="重新发送(" + countdown +"s)";
        countdown--;
    }
    setTimeout(function() {
        settime(obj);
    }, 1000)
}

//随机验证码生成
mfbtn.onclick=function () {
    settime(mfbtn);
    alert("手机验证码已成功发送，请注意查收");
    var newcode = Math.floor(Math.random() * 10000);
    document.getElementById('showCode').innerHTML = newcode;

}

function insertuser(){
    var newusername = $('#username').val();
    var newphone = $('#phone').val();
    var newpassword = $('#password').val();
    $.getJSON("../user/saveUser",{"username":newusername,"phone":newphone,"password":newpassword,},function(data){
    })
}

function submitfn() {
    console.log("注册")
    var newusername = $('#username').val();
    var newphone = $('#phone').val();
    var newpassword = $('#password').val();
    var code = $('#code').val();
    var providecode = $('#showCode').html();
    var url = '../user/addUser';
    $.ajax({
        url: url,
        type: 'get',
        dataType: 'json',
        data: {
            "username":newusername,
            "phone": newphone,
            "password": newpassword,
            "code": code,
            "providecode": providecode,
        },
        success: function (data) {
            if (data == 3) {
                if (!(/^1[34578]\d{9}$/.test(newphone))) {
                    alert("手机号码格式有误，请重填");
                } else if (newpassword.length < 4) {
                    alert("密码不得少于4位！")
                } else if (frm.checkbox.checked == true) {
                    alert("恭喜您已经成功注册会员！");
                    insertuser();
                    window.location.href = "../user/tologin";
                } else {
                    alert("请阅读并同意相关协议可注册！")
                }

            } else if (data == 4) {
                alert("信息填写不完整，请填写完整");
            } else if (data == 5) {
                alert("验证码错误");
            } else if (data == 1) {
                alert("该用户已经注册，请前去登录！");

            }
        }
    })

}
