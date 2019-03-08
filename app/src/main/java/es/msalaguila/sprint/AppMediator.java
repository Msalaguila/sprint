package es.msalaguila.sprint;

import android.app.Application;

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
