package es.msalaguila.sprint.pantalla2;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

import es.msalaguila.sprint.app.AppMediator;
import es.msalaguila.sprint.data.Repository;
import es.msalaguila.sprint.data.RepositoryContract;

public class Pantalla2Screen {

  public static void configure(Pantalla2Contract.View view) {

    WeakReference<FragmentActivity> context =
            new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    Pantalla2State state = mediator.getPantalla2State();

    RepositoryContract repository = Repository.getInstance(context.get());
    Pantalla2Contract.Router router = new Pantalla2Router(mediator);
    Pantalla2Contract.Presenter presenter = new Pantalla2Presenter(state);
    Pantalla2Contract.Model model = new Pantalla2Model(repository);
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
