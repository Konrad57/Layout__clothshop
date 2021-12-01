module com.example.layout__clothshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.layout__clothshop to javafx.fxml;
    exports com.example.layout__clothshop;
}