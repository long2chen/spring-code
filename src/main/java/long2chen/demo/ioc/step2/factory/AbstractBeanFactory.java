package long2chen.demo.ioc.step2.factory;


import long2chen.demo.ioc.step2.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */
public abstract class AbstractBeanFactory implements BeanFactory {
    private final static Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();


    @Override
    public Object getBean(String bName) {
        return beanDefinitionMap.get(bName).getBean();
    }

    @Override
    public void registerBeanDefinition(String bName, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);


        beanDefinitionMap.put(bName, beanDefinition);

    }

    /**
     * 初始化bean
     * @param beanDefinition
     * @return
     */
    protected abstract Object doCreateBean (BeanDefinition beanDefinition);
}
