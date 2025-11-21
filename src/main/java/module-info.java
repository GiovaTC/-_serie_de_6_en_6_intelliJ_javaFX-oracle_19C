module com.example.serie6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    // Para que JavaFX pueda acceder a las clases por reflection (FXML)
    opens com.example.serie6 to javafx.fxml;
    opens com.example.serie6.controller to javafx.fxml;  // 🔹 IMPORTANTE

    // Exportación para acceso regular (si se necesita llamar desde fuera del módulo)
    exports com.example.serie6;
    exports com.example.serie6.controller;               // 🔹 Opcional pero recomendado
}
