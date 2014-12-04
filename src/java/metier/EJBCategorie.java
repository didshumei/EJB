/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author sylvainbron
 */
@Stateless
public class EJBCategorie implements EJBCategorieLocal {
    @EJB EJBGenre genre;
    private Categorie categorie;

    public EJBCategorie() {
        categorie = new Categorie();
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int getIdCategorie() {
        return categorie.getIdCategorie();
    }

    @Override
    public void setIdCategorie(int idCategorie) {
        categorie.setIdCategorie(idCategorie);
    }

    @Override
    public String getReferenceCategorie() {
        return categorie.getReferenceCategorie();
    }

    @Override
    public void setReferenceCategorie(String referenceCategorie) {
        categorie.setReferenceCategorie(referenceCategorie);
    }

    @Override
    public String getDescriptionCategorie() {
        return categorie.getDescriptionCategorie();
    }

    @Override
    public void setDescriptionCategorie(String descriptionCategorie) {
        categorie.setDescriptionCategorie(descriptionCategorie);
    }
    
    @Override
    public void creerGenre(String libelleGenre) {
        genre.creerGenre(libelleGenre); 
    }
}