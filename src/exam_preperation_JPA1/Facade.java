/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_preperation_JPA1;

import Entity.Project;
import Entity.ProjectUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Facade {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("exam_preparation_JPA1PU");
    EntityManager em = emf.createEntityManager();
    
    
    public void createUser(String userName, String email){
        String created = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        ProjectUser pu = new ProjectUser(userName, email, created);
        em.getTransaction().begin();
        em.persist(pu);
        em.getTransaction().commit(); 
    }
    
    public ProjectUser findUser(long id){
        return em.find(ProjectUser.class, id);
    }
    
    public List<ProjectUser> getAllUsers(){
        String queryString = "SELECT p FROM ProjectUser p";
        Query query = em.createQuery(queryString);
        return query.getResultList(); 
    }
    
    public void createProject(String name, String description){
        String time = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date());
        Project p = new Project(name, description, time, time);    
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
    
    public Project findProject(long id){
        return em.find(Project.class, id);
    }
    
    
}
