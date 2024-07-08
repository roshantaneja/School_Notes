module com.cty.roshantaneja.w2d2_lab3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.cty.roshantaneja.w2d2_lab3 to javafx.fxml;
    exports com.cty.roshantaneja.w2d2_lab3;
}