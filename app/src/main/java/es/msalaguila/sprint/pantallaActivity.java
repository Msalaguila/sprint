package es.msalaguila.sprint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaActivity
        extends AppCompatActivity implements PantallaContract.View {

    public static String TAG = PantallaActivity.class.getSimpleName();

    private PantallaContract.Presenter presenter;

    private Button counterButton;
    private TextView counterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);

        // do the setup
        PantallaScreen.configure(this);

        // configurar botones
        counterButton = findViewById(R.id.contadorButton);
        counterTextView = findViewById(R.id.contadorTextView);
    }

    public void buttonPressed(View view){
        presenter.buttonPressed();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }

    @Override
    public void injectPresenter(PantallaContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(PantallaViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        counterTextView.setText(viewModel.numero);
    }
}
