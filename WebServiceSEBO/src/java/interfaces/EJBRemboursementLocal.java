/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author sylvainbron
 */
@Local
public interface EJBRemboursementLocal {
    
    Date getDate();
    void setDate(Date date);
    void genererLettre();
    void genererCheque();
    
}
