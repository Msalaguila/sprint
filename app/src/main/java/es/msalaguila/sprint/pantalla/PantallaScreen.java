package es.msalaguila.sprint.pantalla;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.msalaguila.sprint.app.AppMediator;

public class PantallaScreen {

    public static void configure(PantallaContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        PantallaState state = mediator.getpantallaState();

        PantallaContract.Router router = new PantallaRouter(mediator);
        PantallaContract.Presenter presenter = new PantallaPresenter(state);
        PantallaContract.Model model = new PantallaModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
