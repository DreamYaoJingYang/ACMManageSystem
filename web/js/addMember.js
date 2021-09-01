
/*判断表单内容是否为空
* 后续可改成正则表达式 验证数据的合法性
* */
function judgeForm(eveForm) {
    if(!eveForm.nickname.value){
        showMessage("昵称不能为空");
        return false;
    }
    if(!eveForm.name.value){
        showMessage("姓名不能为空");
        return false;
    }
    if(!eveForm.studentNumber.value){
        showMessage("学号不能为空");
        return false;
    }
    if(!eveForm.department.value){
        showMessage("院系不能为空");
        return false;
    }
    if(!eveForm.major.value){
        showMessage("专业不能为空");
        return false;
    }
    if(!eveForm.grade.value){
        showMessage("年级不能为空");
        return false;
    }
    if(!eveForm.idCard.value){
        showMessage("身份证号不能为空");
        return false;
    }
    if(!eveForm.email.value){
        showMessage("邮箱不能为空");
        return false;
    }
    if(!eveForm.account.value){
        showMessage("登录账号不能为空");
        return false;
    }
    if(!eveForm.password.value){
        showMessage("登录密码不能为空");
        return false;
    }
    if(!eveForm.joinDate.value){
        showMessage("加入ACM日期不能为空");
        return false;
    }
    return true;
}

/*
* 反馈给用户消息 在界面展示
* */
function showMessage(message) {
    alert(message);
}