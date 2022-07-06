import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaInicialController {

    @FXML
    private Button btnNUM1;

    @FXML
    private Button btnNUM0;

    @FXML
    private Button btnDiv;

    @FXML
    private Button btnSoma;

    @FXML
    private Button btnNUM9;

    @FXML
    private Button btnNUM8;

    @FXML
    private Button btnNUM7;

    @FXML
    private Button btnNUM6;

    @FXML
    private Button btnNUM5;

    @FXML
    private Button btnNUM4;

    @FXML
    private Button btnNUM3;

    @FXML
    private Button btnNUM2;

    @FXML
    private Button btnMulti;

    @FXML
    private Button btnSub;

    @FXML
    private Label telacalculos;

    @FXML
    
    void clickNUM1(ActionEvent event) {
        String num1 = "1";


        telacalculos.setText(num1);

    }

}
