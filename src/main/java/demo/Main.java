package demo;

import org.hibernate.*;

public class Main {

	public static void main(String[] args) {
		
		//Book book = new Book("Desde Eclipse","Anonimo");
        Person person = new Person(35,"Juana","Lopez");


        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        //session.save(book);
        session.save(person);
        tx.commit();
        session.close();
        HibernateUtil.closeSessionFactory();

        //System.out.println("Book record saved successfully");
        System.out.println("Person record saved successfully");
        

	}

}
