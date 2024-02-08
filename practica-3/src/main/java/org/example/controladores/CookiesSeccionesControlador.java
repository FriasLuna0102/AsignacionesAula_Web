package org.example.controladores;

import io.javalin.Javalin;
import org.example.util.ControladorClass;

public class CookiesSeccionesControlador extends ControladorClass {
    public CookiesSeccionesControlador(Javalin app) {
        super(app);
    }

    @Override
    public void aplicarRutas() {

        app.post("/crearCookies", cxt ->{

            System.out.println("Hello");
        });

    }
}
