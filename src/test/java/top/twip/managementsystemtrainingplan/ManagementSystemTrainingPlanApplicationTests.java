package top.twip.managementsystemtrainingplan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.twip.managementsystemtrainingplan.dao.CollegeDao;
import top.twip.managementsystemtrainingplan.entity.College;
import top.twip.managementsystemtrainingplan.utils.tool.PasswordEncoder;

import java.util.List;

@SpringBootTest
class ManagementSystemTrainingPlanApplicationTests {

    private CollegeDao collegeDao;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public ManagementSystemTrainingPlanApplicationTests(CollegeDao collegeDao,PasswordEncoder passwordEncoder) {
        this.collegeDao = collegeDao;
        this.passwordEncoder = passwordEncoder;
    }

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
}
