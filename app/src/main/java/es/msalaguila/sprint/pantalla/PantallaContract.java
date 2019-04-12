package es.msalaguila.sprint.pantalla;

import java.lang.ref.WeakReference;

import es.msalaguila.sprint.pantalla2.Pantalla2State;

interface PantallaContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(PantallaViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void addButtonPressed();

        void goResetButtonPressed();

    }

    interface Model {
        int incrementNum();

    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(PantallaState state);

        Pantalla2State getDataFromPreviousScreen();
    }
}
