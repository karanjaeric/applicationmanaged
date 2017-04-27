/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.beans;

import java.pojos.Patient;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author karanjaeric
 */
@Stateless
public class Receptionist {
   
     @PersistenceUnit
     EntityManagerFactory emf;
     EntityManager em=emf.createEntityManager();
     
     @Resource
     UserTransaction utx;

    public void registerPatient(Patient patient){
        try{
            utx.begin();
            em.persist(patient);
            utx.commit();
        
        }catch(IllegalStateException | SecurityException | HeuristicMixedException | HeuristicRollbackException | NotSupportedException | RollbackException | SystemException e){
    
    }finally{
        em.close();
        }
        
    
    }
}
