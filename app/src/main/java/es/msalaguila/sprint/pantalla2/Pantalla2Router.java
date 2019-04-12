package es.msalaguila.sprint.pantalla2;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.msalaguila.sprint.app.AppMediator;

public class Pantalla2Router implements Pantalla2Contract.Router {

  public static String TAG = Pantalla2Router.class.getSimpleName();

  private AppMediator mediator;

  public Pantalla2Router(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, Pantalla2Activity.class);
    context.startActivity(intent);
  }

  @Override
  public void passDataToNextScreen(Pantalla2State state) {
    mediator.setPantalla2State(state);
  }

  @Override
  public Pantalla2State getDataFromPreviousScreen() {
    Pantalla2State state = mediator.getPantalla2State();
    return state;
  }
}
