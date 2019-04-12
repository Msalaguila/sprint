package es.msalaguila.sprint.pantalla;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.msalaguila.sprint.app.AppMediator;
import es.msalaguila.sprint.data.Repository;
import es.msalaguila.sprint.data.RepositoryContract;

public class PantallaScreen {

    public static void configure(PantallaContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        PantallaState state = mediator.getpantallaState();

        RepositoryContract repository = Repository.getInstance(context.get());

        PantallaContract.Router router = new PantallaRouter(mediator);
        PantallaContract.Presenter presenter = new PantallaPresenter(state);
        PantallaContract.Model model = new PantallaModel(repository);
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
