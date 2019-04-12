package es.msalaguila.sprint.pantalla;

import android.content.Intent;
import android.content.Context;

import es.msalaguila.sprint.app.AppMediator;
import es.msalaguila.sprint.pantalla2.Pantalla2Activity;

public class PantallaRouter implements PantallaContract.Router {

    public static String TAG = PantallaRouter.class.getSimpleName();

    private AppMediator mediator;

    public PantallaRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, Pantalla2Activity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(PantallaState state) {
        mediator.setpantallaState(state);
    }

    @Override
    public PantallaState getDataFromPreviousScreen() {
        PantallaState state = mediator.getpantallaState();
        return state;
    }
}
