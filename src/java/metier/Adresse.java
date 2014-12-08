/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 * Représente l'adresse d'une personne, fournisseurs ou clients par ex
 * @author jean
 */
public class Adresse
{
    private int idAdresse;
    private int idClient;
    private int numRue;
    private String nomRue;
    private String codePostal;
    private String Ville;

    public int getNumRue()
    {
        return numRue;
    }

    public void setNumRue(int numRue)
    {
        this.numRue = numRue;
    }

    public String getNomRue()
    {
        return nomRue;
    }

    public void setNomRue(String nomRue)
    {
        this.nomRue = nomRue;
    }

    public String getCodePostal()
    {
        return codePostal;
    }

    public void setCodePostal(String codePostal)
    {
        this.codePostal = codePostal;
    }

    public String getVille()
    {
        return Ville;
    }

    public void setVille(String Ville)
    {
        this.Ville = Ville;
    }
}
