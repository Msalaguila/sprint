package es.msalaguila.sprint.app;

import android.app.Application;

import es.msalaguila.sprint.pantalla.PantallaState;

public class AppMediator extends Application {

    private PantallaState pantallaState;

    public AppMediator(){
        pantallaState = new PantallaState();
    }
    public void setpantallaState(PantallaState state) {
        this.pantallaState = state;
    }

    public PantallaState getpantallaState() {
        return pantallaState;
    }
}
