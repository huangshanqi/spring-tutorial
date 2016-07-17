package cn.evilcoder.bean;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by huangshanqi on 2016/7/17.
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    private static final Logger LOG = Logger.getLogger(MyBeanPostProcessor.class);

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        LOG.info("doing MyBeanPostProcessor.postProcessBeforeInitialization()-" + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        LOG.info("doing MyBeanPostProcessor.postProcessAfterInitialization()-" + beanName);
        return bean;
    }
}
