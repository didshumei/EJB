/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */

// Classe permettant de renvoyer les valeurs de retour des procédures stockées
public class    Retour
{
    int         idRetour;
    String      messageRetour;
    
    public Retour(int id, String message)
    {
        this.idRetour = id;
        this.messageRetour = message;
    }

    public int getIdRetour()
    {
        return idRetour;
    }

    public String getMessageRetour()
    {
        return messageRetour;
    }
}
