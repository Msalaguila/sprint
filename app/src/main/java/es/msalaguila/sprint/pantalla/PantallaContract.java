package es.msalaguila.sprint.pantalla;

import java.lang.ref.WeakReference;

interface PantallaContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(PantallaViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();

        void buttonPressed();
    }

    interface Model {
        String fetchData();
        void incrementNum();
        int getNumero();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(PantallaState state);

        PantallaState getDataFromPreviousScreen();
    }
}
