/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blog.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;

/**
 *
 * @author admin
 */
public class BlogTest {
    @Test
    public void test(){
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
    }
    
}
