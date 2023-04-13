
package test;


import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Compte;
import models.Transaction;
import models.TypeCompte;
import services.CompteCRUD;
import services.TransactionCRUD;
import services.TypeCompteCRUD;

public class Test {
    
    public static void main(String[] args) {
        try {
            TypeCompteCRUD tc = new TypeCompteCRUD();
            TransactionCRUD ts=new TransactionCRUD();
            CompteCRUD cs=new CompteCRUD();
            TypeCompte t = new TypeCompte(22,"salkma", "13545445");
            Compte c= new Compte("2222", "2222", "2222", "2222", "2222", "2222");
            
         
         //   cs.ajouter(c);
            Transaction a=new Transaction(23, "01234567891234", "01234567891234", "450");
            // System.out.println(a);
            // tc.ajouter(t);
            //  ts.modifier(a, 64);
             ts.accept(a);
            //tc.supprimer(t);
            System.out.println(ts.AgenceExiste("agence ariana"));
            //  ts.ajouterSendMoney(a);
            //  System.out.println(ts.recupererSendMoney());
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }
    
    
    }
