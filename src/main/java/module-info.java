module fr.julien.projetfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens fr.julien.projetfx to javafx.fxml;
    exports fr.julien.projetfx;
    exports fr.julien.partie1;
    exports fr.julien.exercices;

}