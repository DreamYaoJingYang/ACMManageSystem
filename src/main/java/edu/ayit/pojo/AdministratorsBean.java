package edu.ayit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: acm管理系统
 * @description: acm数据库 administrators管理员表 对应的bean
 * @author: Jingyang Yao
 * @create: 2021/08/24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdministratorsBean {
    int acmId;//acm成员id
    String post;//岗位
    Date entryDate;//入职日期
    Date dimissionDate;//离职日期
}
