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
public interface EJBBordereauLivraisonLocal {
    
    public String getContenu();
    public void setContenu(String contenu);
    public void remplirContenu();
}