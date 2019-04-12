package es.msalaguila.sprint.pantalla2;

import android.util.Log;

import java.lang.ref.WeakReference;

public class Pantalla2Presenter implements Pantalla2Contract.Presenter {

  public static String TAG = Pantalla2Presenter.class.getSimpleName();

  private WeakReference<Pantalla2Contract.View> view;
  private Pantalla2ViewModel viewModel;
  private Pantalla2Contract.Model model;
  private Pantalla2Contract.Router router;

  public Pantalla2Presenter(Pantalla2State state) {
    viewModel = state;
  }

  @Override
  public void injectView(WeakReference<Pantalla2Contract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(Pantalla2Contract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(Pantalla2Contract.Router router) {
    this.router = router;
  }

  @Override
  public void loadDataPreviousScreen() {

  }

  @Override
  public void onResetButtonPressed() {
    model.resetTotalNumber();
    router.navigateToNextScreen();
  }


}
