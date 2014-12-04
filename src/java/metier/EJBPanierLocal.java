/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author gruselle
 */
@Local
public interface EJBPanierLocal 
{
    int getIdPanier();
    ArrayList<LignePanier> getLignePanier();
}
