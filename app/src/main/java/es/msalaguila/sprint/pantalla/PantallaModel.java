package es.msalaguila.sprint.pantalla;

import es.msalaguila.sprint.data.Repository;
import es.msalaguila.sprint.data.RepositoryContract;

public class PantallaModel implements PantallaContract.Model {

  public static String TAG = PantallaModel.class.getSimpleName();

  private RepositoryContract repository;

  public PantallaModel(RepositoryContract repository) {
    //
    this.repository = repository;
  }


  @Override
  public int incrementNum() {
    int numero = repository.sumarContador();
    return numero;
  }

  @Override
  public boolean checkState() {
    int number = repository.getTotalNumber();
    if (number == 0) {
      return true;
    } else {
      return false;
    }
  }
}
