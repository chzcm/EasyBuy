/**
 * Created by PC on 2018/4/13.
 */
$(document).ready(function(){
    var name;
    var pwd;
    var repwd;
    $('.l_user').bind('blur',function(){
        name=$(this).val();
        if(name==''){
            $(this).css('border','1px solid red');
        }else{
            $.ajax({
                "url":"http://10.10.1.73:8080/EasyBuy/user/userNameCheck",
                "data":name,
                "type":"GET",
                "dataType":"text",
                success:function(data){
                    if(data=="true"){
                        alert("�û����Ѵ��ڣ�");
                    }
                }
            })
        }
    }).bind('focus',function(){
        $(this).css('border','1px solid #cccccc');
    });

    $('.l_pwd').bind('blur',function(){
        if($(this).val()==''){
            $(this).css('border','1px solid red');
        }
    }).bind('focus',function(){
        $(this).css('border','1px solid #cccccc');
    });

    $('.l_email').bind('blur',function(){
        var email=$(this).val();
        if(email==''){
            $(this).css('border','1px solid red');
        }else{
            var index=email.indexOf('@');
            var index2=email.indexOf('.');
            if(index<=1||index2<=1||index>=index2-1){
                alert("email��ʽ����ȷ")
            }
        }
    }).bind('focus',function(){
        $(this).css('border','1px solid #cccccc');
    });

    //�ֻ����������Ƿ�Ϸ�
    $('.l_tel').bind('blur',function(){
        var tel=$(this).val();
        if(tel==''){
            $(this).css('border','1px solid red');
        }else{
            var re=/^1\d{10}$/;
            if(!re.test(tel)){
                $(this).css('border','1px solid red');
                alert("phone number is invalid");
            }else{
                $(this).css('border','1px solid #cccccc');
            }
        }
    }).bind('focus',function(){
        $(this).css('border','1px solid #cccccc');
    });

    //��֤������������
    $("input[class='l_pwd']").eq(1).bind('blur',function(){
        pwd=$("input[class='l_pwd']").eq(0).val();
        repwd=$(this).val();
        if(pwd!=repwd){
            $(this).css('border','1px solid red');
            alert("passwords not same");
        }else{
            $(this).css('border','1px solid #cccccc');
        }
    })


    $('form').submit(function(e){
        name= $('.l_user').val();
        pwd=$('.l_pwd').eq(0).val();
        var email=$('.l_email').val();
        var tel=$('.l_tel').val();
        var check=$("input[type='checkbox']").is(":checked");
        if(name==''||pwd==''||email==''||tel==''||!check){
            e.preventDefault();
            alert("check messages");
        }else{
            e.submit;
        }
    })

})