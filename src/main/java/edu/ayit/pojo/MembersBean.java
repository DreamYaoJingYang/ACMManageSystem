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
    int acm_id;// acm成员id
    String nickname;//昵称2个字以内
    String name;//姓名
    String student_number;//学号
    String department;//院系
    String major;//专业
    int grade;//年级
    int class_name;//班级
    String id_card;//身份证号
    String  phone_number;//手机号
    String email;//邮箱
    String photo_name;//照片全名
    Date join_date;//加入acm日期
    int is_exit;//中途是否退出实验室
    String account;//账号
    String password;//密码
}
