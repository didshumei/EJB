/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Local;

/**
 *
 * @author sylvainbron
 */
@Local
public interface EJBCategorieLocal {
    
    public int getIdCategorie();

    public void setIdCategorie(int idCategorie);

    public String getReferenceCategorie();

    public void setReferenceCategorie(String referenceCategorie);

    public String getDescriptionCategorie();

    public void setDescriptionCategorie(String descriptionCategorie);
    
    void creerGenre(String libelleGenre);
    
}
