package com.jdbc.springJdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.Dao;
import dao.DaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext cont=new  ClassPathXmlApplicationContext("com/bean/xml/Bean.xml");
Dao dao = cont.getBean("daoimpl", DaoImpl.class);
Student student = (Student) cont.getBean("student");


  System.out.println("for fetch single record"); 
  Student student1=dao.fetch(4);
  System.out.println(student1);
 

System.out.println("for fetch multiple record");
List<Student> fetchAll = dao.fetchAll();
for(Student s:fetchAll) {
	System.out.println(s);
}
//System.out.println("this for insert");
//khalidkhan

/*
 * student.setId(4); student.setName("Barkat");
 * student.setCollegename("Bhavans"); int insert = dao.insert(student);
 * System.out.println(insert);
 */
 
/*
 * System.out.println("this for update"); student.setId(1);
 * student.setName("Kamani"); student.setCollegename("Somayya"); int
 * i=dao.update(student); System.out.println(1);
 */
/*
 * System.out.println("this for delete"); int i=dao.delete(2);
 * System.out.println(i);
 */ 
    }
}
