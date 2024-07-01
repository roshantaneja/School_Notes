module com.example.w1d3_lab1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.roshantaneja.w1d3_lab1 to javafx.fxml;
    exports com.example.roshantaneja.w1d3_lab1;
}