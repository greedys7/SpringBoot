
function update() {
    var sel = document.getElementById("select");
    var r_name = sel.options[sel.selectedIndex].value;
    var username = document.getElementById("username").innerText;
    console.log(username);
    console.log(r_name);
    var url = '/management/updateRole';
    $.ajax({
        url: url,
        type: 'post',
        dataType: 'json',
        data:{
            "username": username,
            "r_name": r_name
        },
        success:function (data) {
            if(data==1){
                window.location.href = "/management/RoleList";
            }
        }
    })
}