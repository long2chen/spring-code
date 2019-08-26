package long2chen.demo.ioc.step2;

import lombok.Data;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */


@Data
public class BeanDefinition {

    private Object bean;

    private String beanClassName;

    private Class beanClass;



    public void setBeanClassName (String beanClassName) {
        this.beanClassName = beanClassName;

        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
