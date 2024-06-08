package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;

public class Controller  {

    @FXML
    private TableColumn<?, ?> AlgorithmName;

    @FXML
    private TableColumn<?, ?> AverageNumber;

    @FXML
    private CheckBox C_scan;

    @FXML
    private Button CheckList;

    @FXML
    private CheckBox Fcfs;

    @FXML
    private CheckBox Look;

    @FXML
    private Button RequestList;

    @FXML
    private CheckBox Sstf;

    @FXML
    private Button Start;

    @FXML
    private Button Suspend;

    @FXML
    private TableColumn<?, ?> TotalNumber;

    @FXML
    void c_scan(ActionEvent event) {
        System.out.println("scan");

    }

    @FXML
    void checkList(ActionEvent event) {
        System.out.println("check");

    }

    @FXML
    void fcfs(ActionEvent event) {
        System.out.println("fcfs");

    }

    @FXML
    void look(ActionEvent event) {
        System.out.println("look");

    }

    @FXML
    void requestList(ActionEvent event) {
        System.out.println("request");

    }

    @FXML
    void sstf(ActionEvent event) {
        System.out.println("sstf");

    }

    @FXML
    void start(ActionEvent event) {
        System.out.println("start");

    }

    @FXML
    void suspend(ActionEvent event) {
        System.out.println("suspend");

    }

}

