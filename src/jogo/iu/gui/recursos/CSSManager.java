package jogo.iu.gui.recursos;

import javafx.scene.Parent;

public class CSSManager {
    private CSSManager() {}

    public static void setCSS(Parent parent, String name) {
        parent.getStylesheets().add(Recursos.getResourceFilename("css/"+name));
    }
}
