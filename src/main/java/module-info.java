module com.oop.mahadi.demo3file1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.oop.mahadi.demo3file1 to javafx.fxml;
    exports com.oop.mahadi.demo3file1;
}