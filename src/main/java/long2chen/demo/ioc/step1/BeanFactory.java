package long2chen.demo.ioc.step1;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */
public  class BeanFactory {

    private final static Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();


    public Object getBean(String bName){
        return beanDefinitionMap.get(bName).getBean();
    }

    public void registerBeanDefinition(String bName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(bName, beanDefinition);
    }

}
