import com.yyh.dao.DemoDao;
import com.yyh.po.Demo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        //1.加载配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建数据库会话工厂
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3.创建数据库会话
        SqlSession sqlsession = sessionFactory.openSession();
        //4.获取映射接口
        DemoDao dd=sqlsession.getMapper(DemoDao.class);
        //4.1调用接口中的查询全部方法
        List<Demo> demos = dd.selectAll();
        for (Demo demo : demos) {
            System.out.println(demo);
        }

    }
}
