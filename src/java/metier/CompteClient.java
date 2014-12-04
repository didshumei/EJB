/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author gruselle
 */
public class CompteClient 
{
    private int idCompteClient;
    private String nomCompteClient;
    private String prenomCompteClient;
    private Adresse adresseCompteClient;
    private String emailCompteClient;
    private String mdpCompteClient;

    public int getIdCompteClient() 
    {
        return idCompteClient;
    }

    public void setIdCompteClient(int idCompteClient) 
    {
        this.idCompteClient = idCompteClient;
    }

    public String getNomCompteClient() 
    {
        return nomCompteClient;
    }

    public void setNomCompteClient(String nomCompteClient) 
    {
        this.nomCompteClient = nomCompteClient;
    }

    public String getPrenomCompteClient() 
    {
        return prenomCompteClient;
    }

    public void setPrenomCompteClient(String prenomCompteClient) 
    {
        this.prenomCompteClient = prenomCompteClient;
    }

    public Adresse getAdresseCompteClient() 
    {
        return adresseCompteClient;
    }

    public void setAdresseCompteClient(Adresse adresseCompteClient) 
    {
        this.adresseCompteClient = adresseCompteClient;
    }

    public String getEmailCompteClient() 
    {
        return emailCompteClient;
    }

    public void setEmailCompteClient(String emailCompteClient) 
    {
        this.emailCompteClient = emailCompteClient;
    }

    public String getMdpCompteClient() 
    {
        return mdpCompteClient;
    }

    public void setMdpCompteClient(String mdpCompteClient) 
    {
        this.mdpCompteClient = mdpCompteClient;
    }
}
