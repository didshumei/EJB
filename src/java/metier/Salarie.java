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
public class        Salarie
{
    int             id;
    String          nom;
    String          prenom;
    String          login;
    String          password;
    List<String>    roles;

    public Salarie(String nom, String prenom, String login, String password)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
    }

    public Salarie()
    {
    }

    // Il n'y a pas de set pour le nom, le prénom, l'id, le login, le password et pour le rôle
    // Il n'y a de de get pour le login et le password

    public int getId()
    {
        return id;
    }

    public String getNom()
    {
        return nom;
    }

    public String getPrenom()
    {
        return prenom;
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
