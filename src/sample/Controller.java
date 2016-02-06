package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML private TextField inputText;
    @FXML private TextField outText;
    @FXML private Button button_invert;




    @FXML
    protected void invertButtonAction(ActionEvent event) {
        outText.setText(new StringBuilder(inputText.getText()).reverse().toString());
    }

}
