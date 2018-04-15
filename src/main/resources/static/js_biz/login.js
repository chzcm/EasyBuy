
$(document).ready(function(){
    var name;
    var pwd;
    $('.log_btn').on('click',function(){
        name=$(".l_user").val();
        pwd=$(".l_pwd").val();

        if(name==''||pwd==''){
            alert("�û��������벻��Ϊ��")
        }else{
            $.ajax({
                url:'http://10.10.1.73:8080/EasyBuy/login',
                data:{'name':name,'pwd':pwd},
                dataType:'json',
                type:'POST',
                success:function(result){
                    alert('aaa');
                },
                error:function(){
                    alert('sss');
                }
            })
        }
    })
})
*/
