package info.pakka.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import info.pakka.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		BeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("info//pakka//common//application-context2.xml"));
		Employee employee = beanfactory.getBean("employee", Employee.class);
		System.out.println(employee);
	}

}
