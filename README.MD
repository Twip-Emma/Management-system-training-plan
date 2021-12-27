# 高校人才培养计划管理系统

### 课程表
>- sourse_id 课程ID varchar
>- sourse_name 课程名称 varchar
>- mark 学分 int
>- theory_time 理论学习时长 int
>- test_time 实验时长 int 
>- field_time 实习时长 int
>- term_time 修读学期 int
>- college 开设学院id varchar
>- more_text 备注 varchar

### 人员表
>- user_id 用户id varchar
>- user_name 用户姓名 varchar
>- user_sex 用户性别 varchar
>- user_type 用户类别 varchar
>- user_stage 用户阶段（仅针对学生）int
>- user_mark 用户学分（仅针对学生）int
>- user_state 用户状态 varchar

### 学院表
>- college_id 学院id varchar
>- college_name 学院名称 varchar
>- college_master 学院创建者id varchar

### 选课状态表
>- situation_id 状态id varchar
>- user_id 用户id（仅针对学生） varchar
>- sourse_id 课程id varchar
>- state 状态 varchar

### 选课记录表
>- log_id 记录id varchar
>- user_id 用户id varchar
>- sourse_id 课程id varchar
>- time_zone 选课时间 varchar

### 学生课程成绩表
>- user_id 用户id varchar
>- sourse_id 课程id varchar
>- result 成绩 int