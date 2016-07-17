package cn.evilcoder;

import cn.evilcoder.bean.BeanLifeCycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beanLifeCycle.xml");
        BeanLifeCycle beanLifeCycle = (BeanLifeCycle) applicationContext.getBean("beanLifeCycle");
        beanLifeCycle.print();
    }
}
