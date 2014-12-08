/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.ejb.Local;
import metier.Adresse;

/**
 *
 * @author gruselle
 */
@Local
public interface EJBCompteClientLocal 
{
    int getIdCompteClient();
    String getNomCompteClient();
    String getPrenomCompteClient();
    Adresse getAdresseCompteClient();
    String getEmailCompteClient();
    String getMdpCompteClient();
    String getTelCompteClient();
    void creerCompteClient();
    void modifierCompteClient();
    void ajouterAdresse();
    void modifierAdresse();
    void supprimerAdresse();
    void seConnecter();
    void seDeconnecter();
}
