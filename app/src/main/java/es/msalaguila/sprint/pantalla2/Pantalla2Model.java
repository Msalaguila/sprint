package es.msalaguila.sprint.pantalla2;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;

import es.msalaguila.sprint.data.RepositoryContract;

public class Pantalla2Model implements Pantalla2Contract.Model {

  public static String TAG = Pantalla2Model.class.getSimpleName();

  private RepositoryContract repository;

  public Pantalla2Model(RepositoryContract repository) {
    this.repository = repository;
  }


  @Override
  public int loadTotalNumber() {
    int numeroTotal = repository.getTotalNumber();
    return numeroTotal;
  }

  @Override
  public void resetTotalNumber() {
    repository.resetearContador();
  }
}
