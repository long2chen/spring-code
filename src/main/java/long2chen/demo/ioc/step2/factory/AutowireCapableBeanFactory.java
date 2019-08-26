package long2chen.demo.ioc.step2.factory;

import long2chen.demo.ioc.step2.BeanDefinition;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {

        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }
}
