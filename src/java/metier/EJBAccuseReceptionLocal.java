/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author sylvainbron
 */
@Local
public interface EJBAccuseReceptionLocal {
    
    Date getDateReception(); 
    void setDateReception(Date dateReception);
    
}