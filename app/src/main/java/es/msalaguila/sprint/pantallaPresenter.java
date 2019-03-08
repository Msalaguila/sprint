package es.msalaguila.sprint;

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
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // set passed state
        // update the view
        view.get().displayData(viewModel);
    }

    @Override
    public void buttonPressed() {
        model.incrementNum();
        viewModel.numero = model.getNumero();
        view.get().displayData(viewModel);
    }

}
