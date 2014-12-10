package metier;

import java.sql.*;
import java.util.logging.*;

/**
 * Représente les différentes informations d'un compte client
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
    private String telCompteClient;

    public CompteClient() 
    {
        
    }
    
    public CompteClient(String nomCompteClient, String prenomCompteClient, String telCompteClient, 
                        String mdpCompteClient, String emailCompteClient) 
    {
        setNomCompteClient(nomCompteClient);
        setPrenomCompteClient(prenomCompteClient);
        setTelCompteClient(telCompteClient);
        setMdpCompteClient(mdpCompteClient);
        setEmailCompteClient(emailCompteClient);
    }

    /**
     * Permet de récupérer l'identifiant du compte client
     */
    public int getIdCompteClient() 
    {
        return idCompteClient;
    }

    /**
     * Permet d'assigner un identifiant à un compte client
     * @param idCompteClient est de type entier
     */
    public void setIdCompteClient(int idCompteClient) 
    {
        this.idCompteClient = idCompteClient;
    }

    /*
     * Permet de récupérer le nom d'un client
     */
    public String getNomCompteClient() 
    {
        return nomCompteClient;
    }

    /**
     * Permet d'assigner un nom à un compte client
     * @param nomCompteClient est une chaine de caractères
     */
    public void setNomCompteClient(String nomCompteClient) 
    {
        this.nomCompteClient = nomCompteClient;
    }

    /*
     * Permet de récupérer le prénom d'un client
     */
    public String getPrenomCompteClient() 
    {
        return prenomCompteClient;
    }

    /**
     * Permet d'assigner un prénom à un compte client
     * @param prenomCompteClient est une chaine de caractères
     */
    public void setPrenomCompteClient(String prenomCompteClient) 
    {
        this.prenomCompteClient = prenomCompteClient;
    }

    /*
     * Permet de récupérer l'adresse d'un compte client
     */
    public Adresse getAdresseCompteClient() 
    {
        return adresseCompteClient;
    }

    /**
     * Permet d'assigner une adresse à un compte client
     * @param adresseCompteClient est de type adresse
     */
    public void setAdresseCompteClient(Adresse adresseCompteClient) 
    {
        this.adresseCompteClient = adresseCompteClient;
    }

    /*
     * Permet de récupérer l'email d'un compte client
     */
    public String getEmailCompteClient() 
    {
        return emailCompteClient;
    }

    /**
     * Permet d'assigner un email à un compte client
     * @param emailCompteClient est une chaine de caractères
     */
    public void setEmailCompteClient(String emailCompteClient) 
    {
        this.emailCompteClient = emailCompteClient;
    }

    /*
     * Permet de récupérer le mot de passe d'un commte client
     */
    public String getMdpCompteClient() 
    {
        return mdpCompteClient;
    }

    /**
     * Permet d'assigner un mot de passe à un compte client
     * @param mdpCompteClient 
     */
    public void setMdpCompteClient(String mdpCompteClient) 
    {
        this.mdpCompteClient = mdpCompteClient;
    }

    public String getTelCompteClient() 
    {
        return telCompteClient;
    }

    public void setTelCompteClient(String telCompteClient) 
    {
        this.telCompteClient = telCompteClient;
    }
    
    public Retour insertIntoBDD() 
    {
        try 
        {
            //connexion
            Connection lCon = Connexion.getConnection();
   
            //appel de la procédure stockée
            CallableStatement lStat = lCon.prepareCall("{call creerCompteClient(?, ?, ?, ?, ?, ?, ?, ?)}");
            lStat.setString(1, nomCompteClient);
            lStat.setString(2, prenomCompteClient);
            lStat.setString(3, telCompteClient);
            lStat.setString(4, mdpCompteClient);
            lStat.setString(5, emailCompteClient);
            lStat.registerOutParameter(6, java.sql.Types.INTEGER);
            lStat.registerOutParameter(7, java.sql.Types.TINYINT);
            lStat.registerOutParameter(8, java.sql.Types.VARCHAR);
            lStat.executeUpdate();
            
            //récupération des retours
            int lIdCree = lStat.getInt(6);
            setIdCompteClient(lIdCree);
            Logger.getLogger(CompteClient.class.getName()).log(Level.INFO, ">>>>>>>>>>>>>>>>>>>>>>>>>>" + lIdCree);
            
            int lCodeRetour = lStat.getInt(7);
            Logger.getLogger(CompteClient.class.getName()).log(Level.INFO, ">>>>>>>>>>>>>>>>>>>>>>>>>>" + lCodeRetour);
            
            String lMsgRetour = lStat.getString(8);
            Logger.getLogger(CompteClient.class.getName()).log(Level.INFO, ">>>>>>>>>>>>>>>>>>>>>>>>>>" + lMsgRetour);
            
            //fermeture de la connexion
            lStat.close();
            lCon.close();
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(CompteClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    
    public Retour creerCompteClient(String nom, String prenom, String telephone, String email, String motDePasse, String numeroRue, String nomRue, String codePostal, String ville)
    {
        
        return null;
    }
    
    public void modifierCompteClient()
    {
        
    }
    
    public void ajouterAdresse()
    {
        
    }
    
    public void modifierAdresse()
    {
        
    }
    
    public void supprimerAdresse()
    {
        
    }
    
    public void seConnecter()
    {
        
    }
    
    public void seDeconnecter()
    {
        
    }
}
