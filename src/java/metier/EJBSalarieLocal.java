/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Frontoni
 */
@Local
public interface EJBSalarieLocal
{

    String getNom();

    int getId();

    String getPrenom();

    public List<String> getRoles();

    boolean seConnecter(String login, String password);

    boolean seDeconnecter();
    
}
