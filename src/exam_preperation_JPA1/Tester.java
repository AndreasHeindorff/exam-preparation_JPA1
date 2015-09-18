/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_preperation_JPA1;

import Entity.ProjectUser;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Andreas
 */
public class Tester {

    
    public static void main(String[] args) {
        Facade f = new Facade();
        f.createUser("Andreas", "Larsen");
        f.createProject("Project", "Some Project");
        f.findProject(1);
        f.findUser(1);
        f.getAllUsers();
 
    }
}

