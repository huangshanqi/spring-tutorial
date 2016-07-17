package cn.evilcoder.bean;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by huangshanqi on 2016/7/17.
 */
public class BeanLifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean{

    private static final Logger LOG = Logger.getLogger(BeanLifeCycle.class);

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        LOG.info("doing BeanLifeCycle.init()......");
    }

    public void destroy() {
        LOG.info("doing BeanLifeCycle.destroy()......");
    }

    public void print() {
        LOG.info("doing BeanLifeCycle.print()......");
    }

    public void setBeanName(String s) {
        LOG.info("doing BeanNameAware.setBeanName( " + s + " )......");
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOG.info("doing BeanFactoryAware.setBeanFactory()......");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOG.info("doing ApplicationContextAware.setApplicationContext()......");
    }

    public void afterPropertiesSet() throws Exception {
        LOG.info("doing InitializingBean.afterPropertiesSet()......");
    }
}
