package es.msalaguila.sprint.app;

import android.app.Application;

import es.msalaguila.sprint.pantalla.PantallaState;
import es.msalaguila.sprint.pantalla2.Pantalla2State;

public class AppMediator extends Application {

    private PantallaState pantallaState;
    private Pantalla2State pantalla2State;

    public AppMediator(){
        pantallaState = new PantallaState();
        pantalla2State = new Pantalla2State();
    }
    public void setpantallaState(PantallaState state) {
        this.pantallaState = state;
    }

    public PantallaState getpantallaState() {
        return pantallaState;
    }

    public Pantalla2State getPantalla2State() {
        return pantalla2State;
    }

    public void setPantalla2State(Pantalla2State state) {
        this.pantalla2State = state;
    }

}
