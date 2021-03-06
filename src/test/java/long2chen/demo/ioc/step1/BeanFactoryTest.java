package long2chen.demo.ioc.step1;

import long2chen.demo.ioc.step1.BeanDefinition;
import long2chen.demo.ioc.step1.BeanFactory;
import org.junit.Test;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */
public class BeanFactoryTest {


    /**
     * step1
     */

    @Test
    public void testBeanFactory(){

        // 1.初始化beanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloWorldService());
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.say();

    }




    /**
     *
     */
    public class HelloWorldService{
        public void say() {
            System.out.println("hello world");
        }
    }
}
