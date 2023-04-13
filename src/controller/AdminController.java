
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AdminController {
    
    public void goToAccounts (ActionEvent ae) throws IOException {
           
                       //1.Créer la fenetre
                       Stage s=new Stage();
                       //2.charger le fichier FXML
                       FXMLLoader lo = new FXMLLoader (getClass().getResource("../views/TypeCompteBackList.fxml"));
                       //3.charger  le contenuer du fichier nouvelle.fxml
                       Parent root = lo.load();
                       //4.cree la scenne   
                         Scene sc =new Scene (root);
                       //5 lier  la scenne  sc au stage a cree 
                            s.setScene(sc);
                       //6.afficher la stage 
                       s.show();
                     
            }
    public void goToTransactions(ActionEvent ae) throws IOException {           
                       //1.Créer la fenetre
                       Stage s=new Stage();
                       //2.charger le fichier FXML
                       FXMLLoader lo = new FXMLLoader (getClass().getResource("WireTransferBackList.fxml"));
                       //3.charger  le contenuer du fichier nouvelle.fxml
                       Parent root = lo.load();
                       //4.cree la scenne   
                         Scene sc =new Scene (root);
                       //5 lier  la scenne  sc au stage a cree 
                            s.setScene(sc);
                       //6.afficher la stage 
                       s.show();                     
    }
      
    public void goToRequestMoney(ActionEvent ae) throws IOException {
           
                       //1.Créer la fenetre
                       Stage s=new Stage();
                       //2.charger le fichier FXML
                       FXMLLoader lo = new FXMLLoader (getClass().getResource("../views/SendMoney.fxml"));
                       //3.charger  le contenuer du fichier nouvelle.fxml
                       Parent root = lo.load();
                       //4.cree la scenne   
                         Scene sc =new Scene (root);
                       //5 lier  la scenne  sc au stage a cree 
                            s.setScene(sc);
                       //6.afficher la stage 
                       s.show();
                     
            }
   
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}




