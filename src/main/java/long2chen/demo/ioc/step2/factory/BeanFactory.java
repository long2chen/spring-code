package long2chen.demo.ioc.step2.factory;


import long2chen.demo.ioc.step2.BeanDefinition;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */
public interface BeanFactory {

    public Object getBean(String bName);

    public void registerBeanDefinition(String bName, BeanDefinition beanDefinition) ;

}
