/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Stateless;

/**
 *
 * @author sylvainbron
 */
@Stateless
public class EJBGenre implements EJBGenreLocal {
    Genre genre;
    public EJBGenre() {
        genre =  new Genre();
    }
    
    @Override
    public int getIdGenre() {
        return genre.getIdGenre();
    }

    @Override
    public void setIdGenre(int idGenre) {
        genre.setIdGenre(idGenre);
    }

    @Override
    public String getTitreGenre() {
        return genre.getTitreGenre();
    }

    @Override
    public void setTitreGenre(String titreGenre) {
        genre.setTitreGenre(titreGenre);
    }

    @Override
    public String getReferenceGenre() {
        return genre.getReferenceGenre();
    }

    @Override
    public void setReferenceGenre(String referenceGenre) {
        genre.setReferenceGenre(referenceGenre);
    }

    @Override
    public void creerGenre(String libelleGenre) {
        
    }
    
    


}
