/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBCommandeReapproLocal;
import javax.ejb.Stateless;
import metier.Article;
import metier.CommandeReappro;
import metier.LigneCommandeReappro;

/**
 *
 * @author jean
 */
@Stateless
public class EJBCommandeReappro implements EJBCommandeReapproLocal
{
    @Override
    public void ajouterArticle(Article article, int qt, int refCommande)
    {
        LigneCommandeReappro ligne = new LigneCommandeReappro(article, qt);
        CommandeReappro commande = new CommandeReappro(refCommande);
        commande.ajouterLigne(ligne);
    }
}