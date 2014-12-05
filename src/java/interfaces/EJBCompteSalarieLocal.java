/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Frontoni
 */
@Local
public interface EJBCompteSalarieLocal
{
    String getNom();
    
    void setNom(String nom);
    
    int getId();

    String getPrenom();
    
    void setPrenom(String prenom);

    public List<String> getRoles();

    boolean seConnecter(String login, String password);

    boolean seDeconnecter();
    
}
