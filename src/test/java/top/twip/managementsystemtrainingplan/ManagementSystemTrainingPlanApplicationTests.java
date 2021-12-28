package top.twip.managementsystemtrainingplan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.twip.managementsystemtrainingplan.dao.CollegeDao;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.entity.User;
import top.twip.managementsystemtrainingplan.service.loginService.LoginService;
import top.twip.managementsystemtrainingplan.service.loginService.RegisterService;
import top.twip.managementsystemtrainingplan.utils.tool.PasswordEncoder;

import java.util.List;

@SpringBootTest
class ManagementSystemTrainingPlanApplicationTests {

    @Autowired
    private CollegeDao collegeDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private LoginService loginService;

    @Autowired
    private RegisterService registerService;

    @Test
    void contextLoads() {
    }

    @Test
    void testDaoCollege1(){
//        collegeDao.createNewCollege("666","计通学院","8887666");
//        List<College> all = collegeDao.findAll();
//        for(College college:all){
//            System.out.println(college);
//        }
        collegeDao.deleteCollegeById("666");
    }

    @Test
    void PasswordEncoder(){
        String encode = passwordEncoder.encode("8848");
        System.out.println(encode);
    }

    @Test
    void newUserTest(){
        User user = new User();
        user.setUserId("002");
        user.setUserName("李四");
        user.setUserSex("男");
        user.setUserType("学生");
        user.setUserStage(1);
        user.setUserMark(30);
        user.setUserState("在校");
        user.setUserCard("20191212112");
        user.setUserPass("123456");
        Integer newUser = registerService.createNewUser(user);
        System.out.println(newUser);
    }

    @Test
    void loginTest(){
        User user = new User();
        user.setUserCard("20191212112");
        user.setUserPass("123456");
        Integer integer = loginService.userLogin(user);
        System.out.println(integer);
    }
}
