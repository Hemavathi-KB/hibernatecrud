package hibernatecrud.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceUnitTransactionType;

import hibernatecrud.dto.Student;
public class Studentdao {
	EntityManagerFactory e= Persistence.createEntityManagerFactory("suki");
	EntityManager m = e.createEntityManager();
    EntityTransaction t = m.getTransaction();
    
    public void addStudent(Student s)
    {
    	t.begin();
    	m.persist(s);
    	t.commit();
    }
    public void deleteStudent(int id)
    {
    	Student s = m.find(Student.class,id);
    	if(s!=null)
    	{
    		t.begin();
    		m.remove(s);
    		t.commit();
    	}
    	else
    		System.out.println("no id found");
    }
    public void fetchStudent(int id)
    {
    	Student s=m.find(Student.class,id);
    	System.out.println(s);
    }
    public void updateStudent(int id, String newName)
    {
    	Student s = m.find(Student.class, id);
    	s.setName(newName);
    	t.begin();
    	m.merge(s);
    	t.commit();
    }
}
