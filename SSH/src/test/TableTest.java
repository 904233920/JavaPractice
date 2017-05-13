package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

public class TableTest {
	public static void main(String[] args) {
		 BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		  
		  LocalSessionFactoryBean lsfb = (LocalSessionFactoryBean) bf.getBean("&sessionFactory");
		  
		  lsfb.dropDatabaseSchema();
		  
		  lsfb.createDatabaseSchema();
	}
}
