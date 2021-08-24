package edu.ayit.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: acm管理系统
 * @description: acm数据库 game 竞赛表 对应的bean
 * @author: Jingyang Yao
 * @create: 2021/08/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameBean {
    int acm_id;//acm成员id
    String name;//比赛名称
    String grade;//地域级别(赛区)
    String meda;//奖牌级别
    Date game_date;//比赛日期
}
