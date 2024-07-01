module com.cty.roshantaneja.w1d2_tutorial {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.cty.roshantaneja.w1d2_tutorial to javafx.fxml;
    exports com.cty.roshantaneja.w1d2_tutorial;
}