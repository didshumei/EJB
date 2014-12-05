/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Frontoni
 */
@Stateless
public class EJBSalarie implements EJBSalarieLocal
{
    Salarie salarie = new Salarie(); // Comment rendre ces fonctions à tous les types d'EJB Salariés ?

    @Override
    public int getId()
    {
        return (salarie.getId());
    }
    
    @Override
    public String getNom()
    {
        return (salarie.getNom());
    }

    @Override
    public String getPrenom()
    {
        return (salarie.getPrenom());
    }

    @Override
    public List<String> getRoles()
    {
        return (salarie.getRoles());
    }

    @Override
    public boolean seConnecter(String login, String password)
    {
        return (salarie.seConnecter(login, password));
    }

    @Override
    public boolean seDeconnecter()
    {
        return (salarie.seDeconnecter());
    }
}
