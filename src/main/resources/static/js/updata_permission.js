
function add() {
    var sel = document.getElementById("select");
    var p_id = sel.options[sel.selectedIndex].value;
    var r_id = document.getElementById("r_id").innerText;
    console.log(p_id);
    console.log(r_id);
    var url = '/management/add';
    $.ajax({
        url: url,
        type: 'post',
        dataType: 'json',
        data:{
            "p_id": p_id,
            "r_id": r_id
        },
        success:function (data) {
            if(data==1){
                window.location.href = "/management/PowerList";
            }
        }
    })
}


/*
function todelete() {
    var sel = document.getElementById("select");
    var p_id = sel.options[sel.selectedIndex].value;
    var r_id = document.getElementById("r_id").innerText;
    console.log(p_id);
    console.log(r_id);
    var url = '/management/add';
    $.ajax({
        url: url,
        type: 'post',
        dataType: 'json',
        data:{
            "p_id": p_id,
            "r_id": r_id
        },
        success:function (data) {
            if(data==1){
                window.location.href = "/management/PowerList";
            }
        }
    })
}*/
