package top.twip.managementsystemtrainingplan;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.twip.managementsystemtrainingplan.dao.CollegeDao;
import top.twip.managementsystemtrainingplan.entity.College;

import java.util.List;

@SpringBootTest
class ManagementSystemTrainingPlanApplicationTests {

    private CollegeDao collegeDao;

    @Autowired
    public ManagementSystemTrainingPlanApplicationTests(CollegeDao collegeDao) {
        this.collegeDao = collegeDao;
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
}
