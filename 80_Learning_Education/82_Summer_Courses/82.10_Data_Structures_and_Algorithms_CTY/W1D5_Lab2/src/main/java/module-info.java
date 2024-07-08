module com.cty.roshantaneja.w1d5_lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.cty.roshantaneja.w1d5_lab2 to javafx.fxml;
    exports com.cty.roshantaneja.w1d5_lab2;
}