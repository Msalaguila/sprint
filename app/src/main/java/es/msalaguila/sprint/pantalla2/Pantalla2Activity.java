package es.msalaguila.sprint.pantalla2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import es.msalaguila.sprint.R;

public class Pantalla2Activity
        extends AppCompatActivity implements Pantalla2Contract.View {

  public static String TAG = Pantalla2Activity.class.getSimpleName();

  private Pantalla2Contract.Presenter presenter;
  private TextView pantalla2TextView;
  private Button resetButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_pantalla2);

    // do the setup
    Pantalla2Screen.configure(this);

    pantalla2TextView = findViewById(R.id.contadorTotalTextView);
    resetButton = findViewById(R.id.resetButton);
    presenter.loadDataPreviousScreen();
  }

  @Override
  public void injectPresenter(Pantalla2Contract.Presenter presenter) {
    this.presenter = presenter;
  }

  @Override
  public void displayData(Pantalla2ViewModel viewModel) {
    //Log.e(TAG, "displayData()");

    // deal with the data
  }

  public void onResetButtonPressed(View view){
    presenter.onResetButtonPressed();
  }


}
