module edu.ncssm.briansea.pset5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.fasterxml.jackson.databind;

    opens com.cty.briansea.lab4 to javafx.fxml;
    exports com.cty.briansea.lab4;
}