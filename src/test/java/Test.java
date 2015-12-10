
import com.phuag.dao.StaffMapper;
import com.phuag.model.Staff;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ph on 2015/3/5.
 */
public class Test {
    public static void main(String[] args) {
        //读取spring配置文件
        BeanFactory beanFactory = new ClassPathXmlApplicationContext(
                "/applicationContext.xml");
        //通过spring配置文件生成的beanFactory获得SqlSessionFactory
        SqlSessionFactory factory = (SqlSessionFactory) beanFactory
                .getBean("sqlSessionFactory");
        //获得SqlSession
        SqlSession session = factory.openSession();
        //用session根据Mapper获得对象的Mapper对象
        StaffMapper staffMapper = session.getMapper(StaffMapper.class);

        Staff staff = new Staff();
        staff.setStaffName("肖瓜瓜");
        staff.setStaffAge((byte) 12);
        staff.setStaffSex("M");
        //数据插入
//      int newStaffId =  staffMapper.insert(staff);
//        System.out.println("insert newStaffId:"+staff.getStaffId());
        //数据更新
        //staffMapper.updateByPrimaryKey(staff);
        //数据删除
//       int ret = staffMapper.deleteByPrimaryKey(11);
//        System.out.println("delete result:"+ret);
        //数据查询
        List<Staff> users = staffMapper.selectAll();
        for (Staff user : users) {
            System.out.println(user);
        }
    }
}

