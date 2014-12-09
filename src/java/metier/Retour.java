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
public class    Retour<T>
{
    private T       resultat;
    private int     idRetour;
    private String  messageRetour;
    private String  messageException;
    
    // A utiliser si l'operation s'est bien deroulee
    public  Retour(T res)
    {
        resultat = res;
        idRetour = 0;
        messageRetour = "OK";
        messageException = "";
    }

    // A utiliser si l'operation a rencontre une erreur ou un warning
    public  Retour(int idRet, String messageErreur, String infoException)
    {
        resultat = null;
        idRetour = idRet;
        messageRetour = messageErreur;
        messageException = infoException;
    }
    
    public int getIdRetour()
    {
        return idRetour;
    }

    public String getMessageRetour()
    {
        return messageRetour;
    }

    public T getResultat()
    {
        return resultat;
    }

    public String getMessageException()
    {
        return messageException;
    }
}
