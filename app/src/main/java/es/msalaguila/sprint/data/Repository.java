package es.msalaguila.sprint.data;

import android.content.Context;

public class Repository implements RepositoryContract {

  private static Repository INSTANCE;

  private Context context;
  private int contador = 0;

  public int getContador() {
    return contador;
  }

  public void setContador(int contador) {
    this.contador = contador;
  }

  public static RepositoryContract getInstance(Context context) {
    if(INSTANCE == null){
      INSTANCE = new Repository(context);
    }
    return INSTANCE;
  }

  private Repository(Context context) {
    this.context = context;
  }


  @Override
  public int sumarContador() {
    contador++;
    return contador;
  }

  @Override
  public int resetearContador() {
    contador = 0;
    return contador;
  }
}
