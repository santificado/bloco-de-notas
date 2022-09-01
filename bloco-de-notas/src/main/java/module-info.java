module fiap.com.br {
    requires javafx.controls;
    requires javafx.fxml;

    opens fiap.com.br to javafx.fxml;
    exports fiap.com.br;
}
