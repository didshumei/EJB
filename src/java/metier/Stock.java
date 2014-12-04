/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.HashMap;

/**
 * Représente le stock physique de SEBO.
 * @author jean
 */
public class Stock
{
    /**
     * Contient une liste de type dictionnaire contenant les lignes de stock.
     * On récupère une ligne de stock en donnant la référence d'un article.
     */
    private HashMap<Integer, LigneDeStock> stock;
    
    /**
     * Crée un nouveau stock
     */
    public Stock()
    {
        stock = new HashMap<Integer, LigneDeStock>();
    }

    /**
     * Récupère le stock entier sous forme de dictionnaire
     * @return une map content le stock
     */
    public HashMap<Integer, LigneDeStock> getStock()
    {
        return stock;
    }
    
    public void setStock(HashMap<Integer, LigneDeStock> stock)
    {
        this.stock = stock;
    }
    
    /**
     * Met à jour le stock d'un article
     * @param refArticle la référence de l'article ayant un stock devant être mis
     * à jour
     * @param quantiteAjoutee la quantité à ajouter au stock de l'article
     */
    public void updateLigne(int refArticle, int quantiteAjoutee)
    {
        LigneDeStock ligne = stock.get(refArticle);
        ligne.setQuantite(quantiteAjoutee);
    }
}
