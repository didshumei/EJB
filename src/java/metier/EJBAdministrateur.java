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
public class EJBAdministrateur implements EJBAdministrateurLocal
{
    Administrateur  admin = new Administrateur();

    @Override
    public String getNom()
    {
        return (admin.getNom());
    }

    @Override
    public int getId()
    {
        return (admin.getId());
    }

    @Override
    public String getPrenom()
    {
        return (admin.getPrenom());
    }

    @Override
    public List<String> getRoles()
    {
        return (admin.getRoles());
    }

    @Override
    public boolean seConnecter(String login, String password)
    {
        return (admin.seConnecter(login, password));
    }

    @Override
    public boolean seDeconnecter()
    {
        return (admin.seDeconnecter());
    }
}
