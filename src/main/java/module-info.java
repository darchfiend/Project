module com.mycompany.mavenproject20 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.mavenproject20 to javafx.fxml;
    exports com.mycompany.mavenproject20;
}