/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Local;

/**
 *
 * @author gruselle
 */
@Local
public interface EJBLignePanierLocal 
{
    int getQuantite();
    float getSommeIntermediaire();
}
