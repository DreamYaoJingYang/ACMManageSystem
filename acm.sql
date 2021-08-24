CREATE DATABASE acm CHARACTER SET 'utf8';
USE acm;
CREATE TABLE members(
	acm_id INT COMMENT'acm成员id',
	nickname VARCHAR(4) COMMENT'昵称2个字以内',
	`name` VARCHAR(5) COMMENT'姓名',
	student_number VARCHAR(15) COMMENT'学号',
	department VARCHAR(20) COMMENT'院系',
	major VARCHAR(20) COMMENT'专业',
	grade INT COMMENT'年级',
	class_name INT COMMENT'班级',
	id_card VARCHAR(18) COMMENT'身份证号',
	phone_number VARCHAR(11) COMMENT'手机号',
	email VARCHAR(20) COMMENT'邮箱号',
	photo_name VARCHAR(10) COMMENT'照片全名',
	join_date DATE COMMENT'加入acm日期',
	is_exit INT COMMENT'中途是否退出',
	account VARCHAR(20) COMMENT'账号',
	`password` VARCHAR(20) COMMENT'密码',
	PRIMARY KEY(acm_id)
);

CREATE TABLE administrators(
	acm_id INT COMMENT'acm成员id',
	post VARCHAR(10) COMMENT'岗位',
	entry_date DATE COMMENT'入职日期',
	dimission_date DATE COMMENT'离职日期'
);

#竞赛信息表
CREATE TABLE game(
	acm_id INT COMMENT'acm成员id',
	`name` VARCHAR(20) COMMENT'比赛名称',
	grade VARCHAR(10) COMMENT'地域级别(赛区)',
	medal VARCHAR(5) COMMENT'奖牌级别',
	game_date DATE COMMENT'比赛日期'
);





