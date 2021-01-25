
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class ClientController {

    @FXML
    TextArea cTextArea;
    @FXML
    TextField cTextField;

    public void getSend() {
        setSend();
    }

    public void presSend(KeyEvent keyEvent) {
        if (keyEvent.getCode()== KeyCode.ENTER){
            setSend();
        }
    }
    private void setSend(){
        String send;
        send = "\n" + cTextField.getText() + "\n";
        cTextArea.appendText(send);
        cTextField.clear();
    }
}
