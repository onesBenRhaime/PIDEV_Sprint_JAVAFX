
package zayid;

import java.io.IOException;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TypeCompteBackList  {
    
    
    private Stage stage;
    private Scene scene;
    private Parent root;
 @FXML
    private StackPane parentContainer;
@FXML
    private AnchorPane rootPane;
@FXML
    private TextField usernameTF;
@FXML
    private void naviguer(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("AjouterTypeCompte.fxml"));
            Parent root = loader.load();
           
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

   void goToAjouter(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AjouterTypeCompte.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            root.translateYProperty().set(stage.getHeight());
            parentContainer.getChildren().add(root);
            Timeline timeline = new Timeline();
            KeyValue keyValue = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
            KeyFrame keyFrame = new KeyFrame(Duration.millis(300), keyValue);
            timeline.getKeyFrames().add(keyFrame);
            timeline.play();
            timeline.setOnFinished((ActionEvent event3) -> {
                parentContainer.getChildren().remove(rootPane);
            });
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
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
//public void goToAjouter(ActionEvent ae) throws IOException {           
//                       //1.Créer la fenetre
//                       Stage s=new Stage();
//                       //2.charger le fichier FXML
//                       FXMLLoader lo = new FXMLLoader (getClass().getResource("AjouterTypeCompte.fxml"));
//                       //3.charger  le contenuer du fichier nouvelle.fxml
//                       Parent root = lo.load();
//                       //4.cree la scenne   
//                         Scene sc =new Scene (root);
//                       //5 lier  la scenne  sc au stage a cree 
//                            s.setScene(sc);
//                       //6.afficher la stage 
//                       s.show();                     
//    }


}