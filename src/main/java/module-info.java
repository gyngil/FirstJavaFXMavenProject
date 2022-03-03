module br.edu.pucgoias {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.pucgoias to javafx.fxml;
    exports br.edu.pucgoias;
}