package es.msalaguila.sprint.data;

import android.content.Context;

public class Repository implements RepositoryContract {

  private static Repository INSTANCE;

  private Context context;
  private int contador = 0;
  private int contadorTotal = 0;

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
    contadorTotal++;
    if(contador > 9){
      contador = 0;
    }
    return contador;
  }

  @Override
  public int resetearContador() {
    contador = 0;
    contadorTotal = contador;
    return contador;
  }

  @Override
  public int getTotalNumber() {
    return contadorTotal;
  }
}
