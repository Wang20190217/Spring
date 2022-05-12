import cn.curleyg.wang.dao.IAccountDao;
import cn.curleyg.wang.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 城南花已开<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2022/5/12 06:15 <br>
 * @Author: Wang
 */
public class SpringTest {

     //使用 main 方法获取容器测试执行
    public static void main(String[] args) {
        //1.使用 ApplicationContext 接口，就是在获取 spring 容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据 bean 的 id 获取对象
        IAccountService aService = (IAccountService) ac.getBean("accountService");
        System.out.println(aService);
        IAccountDao aDao = (IAccountDao) ac.getBean("accountDao");
        System.out.println(aDao);
        aService.saveAccount();
        aService.toString();
    }
}