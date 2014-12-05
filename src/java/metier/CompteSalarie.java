/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.List;

/**
 *
 * @author Frontoni
 */
public class CompteSalarie extends Salarie
{
    int             id;
    String          login;
    String          password;
    List<String>    roles;

    public CompteSalarie()
    {
    }
    
    public CompteSalarie(String nom, String prenom, String login, String password)
    {
        super(nom, prenom);
        this.login = login;
        this.password = password;
    }

    // Il n'y a pas de set pour le nom, le prénom, l'id, le login, le password et pour le rôle
    // Il n'y a de de get pour le login et le password

    public int getId()
    {
        return id;
    }

    public List<String> getRoles()
    {
        return roles;
    }
    
    public boolean  seConnecter(String loginEntre, String passwordEntre)
    {
        boolean     ok = false;
        
        return (ok);
    }
    
    public boolean seDeconnecter()
    {
        return (true);
    }
}
