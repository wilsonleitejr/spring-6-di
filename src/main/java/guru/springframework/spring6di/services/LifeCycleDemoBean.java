package guru.springframework.spring6di.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import guru.springframework.spring6di.controllers.MyController;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
		ApplicationContextAware, BeanPostProcessor {

	LifeCycleDemoBean() {
		System.out.println("## I'm in the LifeCycleDemoBean Constructor");
	}

	private String javaVer;

	@Value("${java.specification.version}")
	public void setJavaVer(String javaVer) {
		this.javaVer = javaVer;
		System.out.println("## 1 Properties Set. Java Ver: " + this.javaVer);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## 2 BeanNameAware My Bean Name Is: " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## 3 BeanFactoryAware - Bean Factory has been set");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## 4 ApplicationContextAware - Application Context has been set");
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("## 5 postConstruct The Post Construct annotated method has been called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## 6 afterPropertiesSet Populate Properties the LifeCycleBean has its property set!");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("## 7 The @PreDestroy annotated method has been called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## 8 DisposableBean.destroy The LifeCycleBean has been terminated");
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("## postProcessBeforeInitialization " + beanName);

		if (bean instanceof MyController myControllerBean) {
			System.out.println("Caling beforeInit");
			myControllerBean.beforeInit();
		}

		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("## postProcessAfterInitialization " + beanName);

		if (bean instanceof MyController myControllerBean) {
			System.out.println("Caling afterInit");
			myControllerBean.afterInit();
		}

		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}

}
