/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author jean
 */
public class Fournisseur
{
    private String  nom;
    private String  email;
    private String  telephone;
    private Adresse adresse;
    
    public Fournisseur()
    {
        
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public Adresse getAdresse()
    {
        return adresse;
    }

    public void setAdresse(Adresse adresse)
    {
        this.adresse = adresse;
    }
}
