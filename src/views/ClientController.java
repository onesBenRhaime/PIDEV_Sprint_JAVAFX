/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author BAZINFO
 */
public class ClientController implements Initializable {

    @FXML
    private Label totalproduits;
    @FXML
    private Label totalproduits1;
    @FXML
    private Label totalproduits2;
    @FXML
    private Label totalproduits3;
    @FXML
    private Label totalproduits11;
    @FXML
    private Label totalproduits21;
    @FXML
    private Label totalproduits31;
    @FXML
    private Label totalproduits111;
    @FXML
    private Label totalproduits211;
    @FXML
    private Button Accueilfx1;
    @FXML
    private Button Accueilfx11;
    @FXML
    private Button Accueilfx14;
    @FXML
    private Button Accueilfx15;
    @FXML
    private Button Accueilfx16;
    @FXML
    private Button Accueilfx161;
    @FXML
    private Label welcomeLb;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void goToTransactions(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("WireTransferClient.fxml"));
             Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }


    @FXML
    private void goToSendMoney(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SendMoneyClient.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToAccounts(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TypeCompteClient.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

   
    private void goToAjouter(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AjouterWireTransferClient.fxml"));
             Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToAdmin(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Admin.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void goToHome(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Client.fxml"));
            Parent root = loader.load();
            welcomeLb.getScene().setRoot(root);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @FXML
    private void accueilAction(ActionEvent event) {
    }
}
