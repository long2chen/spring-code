package long2chen.demo.ioc.step2;

import long2chen.demo.ioc.step2.BeanDefinition;
import long2chen.demo.ioc.step2.factory.AutowireCapableBeanFactory;
import long2chen.demo.ioc.step2.factory.BeanFactory;
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
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("long2chen.demo.ioc.step2.HelloWorldService");
        beanFactory.registerBeanDefinition("helloWorldService",beanDefinition);

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.say();

        // long2chen.demo.ioc.step2.BeanFactoryTest.HelloWorldService

    }





}
