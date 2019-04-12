package es.msalaguila.sprint.pantalla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.msalaguila.sprint.R;

public class PantallaActivity
        extends AppCompatActivity implements PantallaContract.View {

    public static String TAG = PantallaActivity.class.getSimpleName();

    private PantallaContract.Presenter presenter;

    private Button counterButton;
    private TextView counterTextView;
    private Button goResetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);

        // do the setup
        PantallaScreen.configure(this);

        // configurar botones
        counterButton = findViewById(R.id.contadorButton);
        counterTextView = findViewById(R.id.contadorTextView);
        goResetButton = findViewById(R.id.goResetButton);
    }

    @Override
    public void injectPresenter(PantallaContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(PantallaViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        String numero = Integer.toString(viewModel.numero);
        counterTextView.setText(numero);
    }

    public void addButtonPressed(View view) {
        presenter.addButtonPressed();
    }

    public void goResetButtonPressed(View view) {
        presenter.goResetButtonPressed();
    }
}
