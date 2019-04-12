package es.msalaguila.sprint.pantalla2;

import java.lang.ref.WeakReference;

import es.msalaguila.sprint.pantalla.PantallaState;

interface Pantalla2Contract {

  interface View {
    void injectPresenter(Presenter presenter);

    void displayData(Pantalla2ViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void loadDataPreviousScreen();

    void onResetButtonPressed();
  }

  interface Model {
    int loadTotalNumber();

    void resetTotalNumber();
  }

  interface Router {
    void navigateToNextScreen();

    void passDataToNextScreen(Pantalla2State state);

    Pantalla2State getDataFromPreviousScreen();
  }
}
