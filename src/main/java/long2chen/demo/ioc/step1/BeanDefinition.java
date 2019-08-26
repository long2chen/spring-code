package long2chen.demo.ioc.step1;

import lombok.Data;

/**
 * @author chenlonglong
 * @date 2019/8/26
 */


@Data
public class BeanDefinition {

    private Object bean;


    public BeanDefinition (Object bean) {
        this.bean = bean;
    }




}
