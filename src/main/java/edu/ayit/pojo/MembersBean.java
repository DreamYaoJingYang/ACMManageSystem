package edu.ayit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: ACMMamageSystem
 * @description: acm数据库 members成员表 对应的bean
 * @author: Jingyang Yao
 * @create: 2021/08/24
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MembersBean {
    int acmId;// acm成员id
    String nickname;//昵称2个字以内
    String name;//姓名
    String studentNumber;//学号
    String department;//院系
    String major;//专业
    int grade;//年级
    int className;//班级
    String idCard;//身份证号
    String  phoneNumber;//手机号
    String email;//邮箱
    String photoName;//照片全名
    Date joinDate;//加入acm日期
    int isExit;//中途是否退出实验室
    String account;//账号
    String password;//密码

    public MembersBean(String nickname, String name, String studentNumber, String department, String major, int grade, int className, String idCard, String phoneNumber, String email, String photoName, Date joinDate, int isExit, String account, String password) {
        this.nickname = nickname;
        this.name = name;
        this.studentNumber = studentNumber;
        this.department = department;
        this.major = major;
        this.grade = grade;
        this.className = className;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.photoName = photoName;
        this.joinDate = joinDate;
        this.isExit = isExit;
        this.account = account;
        this.password = password;
    }
}
