module com.example.chessdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.chessdemo to javafx.fxml;
    exports com.example.chessdemo;
}