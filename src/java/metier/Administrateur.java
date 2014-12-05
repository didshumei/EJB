/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;

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
    
    public boolean   creerCompte(string nom, string prenom, string login, string password)
    {
        return (true);
    }
    
    public boolean  ajouterUnRole(Salarie salarier, string unRole)
    {
        return true;
    }
     public boolean  supprimerUnRole(Salarie salarier, string unRole)
    {
        return true;
    }
    public boolean  desactiverUnCompte(Salarie salarie)
    {
        return true;
    }
}
