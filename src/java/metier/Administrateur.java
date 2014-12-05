/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;



/**
 *
 * @author Frontoni
 */
public class Administrateur extends Salarie
{
    public Administrateur()
    {
        super();
    }
    
    public boolean creerCompte(String nom, String prenom, String login, String password)
    {
        
        return true;
    }
    
    public boolean  ajouterUnRole(Salarie salarie, String unRole)
    {
        return true;
    }
     public boolean  supprimerUnRole(Salarie salarie, String unRole)
    {
        return true;
    }
    public boolean  desactiverUnCompte(Salarie salarie)
    {
        return true;
    }
}
