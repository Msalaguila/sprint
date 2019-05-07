package es.msalaguila.sprint.pantalla;

import java.lang.ref.WeakReference;

public class PantallaPresenter implements PantallaContract.Presenter {

  public static String TAG = PantallaPresenter.class.getSimpleName();

  private WeakReference<PantallaContract.View> view;
  private PantallaViewModel viewModel;
  private PantallaContract.Model model;
  private PantallaContract.Router router;

  public PantallaPresenter(PantallaState state) {
    viewModel = state;
  }

  @Override
  public void injectView(WeakReference<PantallaContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(PantallaContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(PantallaContract.Router router) {
    this.router = router;
  }

  @Override
  public void addButtonPressed() {
    int numero = model.incrementNum();
    viewModel.numero = numero;
    view.get().displayData(viewModel);
  }

  @Override
  public void goResetButtonPressed() {
    router.navigateToNextScreen();
  }

  @Override
  public void fetchData() {
    boolean state = model.checkState();
    if (state == true) {
      viewModel.numero = 0;
    }
    view.get().displayData(viewModel);
  }


}
