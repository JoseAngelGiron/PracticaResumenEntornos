module com.github.JoseAngelGiron {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.JoseAngelGiron to javafx.fxml;
    exports com.github.JoseAngelGiron;
}
