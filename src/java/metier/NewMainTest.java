/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import Ejb.EJBCompteClient;
import java.sql.Connection;
import javax.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;

/**
 *
 * @author gruselle
 */
public class NewMainTest {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            /*
            //appel distant
            Hashtable vEnv = new Hashtable();
            vEnv.put("org.omg.CORBA.ORBInitialHost", "127.0.0.1");
            vEnv.put("org.omg.CORBA.ORBInitialPort", "3700");
            Context c = new InitialContext(vEnv);
            DataSource ds = (javax.sql.DataSource)c.lookup("jdbc/SEBO2014");
            /**/
          /*
            Connection con = Connexion.getConnection();
            Statement select = con.createStatement();
            ResultSet result = select.executeQuery("SELECT quantiteEnStock FROM Article WHERE idArticle = 1");
            while(result.next())
            {
                //String nom = result.getString("nom");
                int stock = result.getInt("quantiteEnStock");
                System.out.println(stock);
            }
            select.close();
            con.close();
            */ 
            
        } catch (Exception e)
        {
            System.out.println("BUUUUG : " + e.getMessage());
            e.printStackTrace();
        }

        try {
            Context c = new InitialContext();
            EJBCompteClient eJBCompteClient = new EJBCompteClient();
            Retour<CompteClient> creerCompteClient = eJBCompteClient.creerCompteClient("nom", "prenom", "telephone", "email", "mdp", "4", "allah rue", "codepo", "ici");
        } catch (NamingException ne) {
           
            throw new RuntimeException(ne);
        }
         
    }
}
