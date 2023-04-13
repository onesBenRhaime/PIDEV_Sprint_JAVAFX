/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zayid;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author BAZINFO
 */
public class WireTransferBackList {
    public void goToAccounts(ActionEvent ae) throws IOException {           
                       //1.Créer la fenetre
                       Stage s=new Stage();
                       //2.charger le fichier FXML
                       FXMLLoader lo = new FXMLLoader (getClass().getResource("TypeCompteBackList.fxml"));
                       //3.charger  le contenuer du fichier nouvelle.fxml
                       Parent root = lo.load();
                       //4.cree la scenne   
                         Scene sc =new Scene (root);
                       //5 lier  la scenne  sc au stage a cree 
                            s.setScene(sc);
                       //6.afficher la stage 
                       s.show();                     
    }
   
}
