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
public interface EJBGenreLocal {
    
    int getIdGenre();

    void setIdGenre(int idGenre);

    String getTitreGenre();

    void setTitreGenre(String titreGenre);

    String getReferenceGenre();

    void setReferenceGenre(String referenceGenre);
    
    void creerGenre(String libelleGenre);
    
}
