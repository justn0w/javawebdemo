package test;

import com.justnow.dao.IUserDao;
import com.justnow.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Test02Mybatis {
    @Test
    public void test() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获取代理对象
        IUserDao dao = session.getMapper(IUserDao.class);
        //调用查询的方法
        List<User> list = dao.findAll();
        for (User user : list) {
            System.out.println(user);
        }
        //释放资源
        session.close();
        inputStream.close();
    }
}
