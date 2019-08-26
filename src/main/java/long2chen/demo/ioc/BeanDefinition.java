package long2chen.demo.ioc;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return this.bean;
    }

}
