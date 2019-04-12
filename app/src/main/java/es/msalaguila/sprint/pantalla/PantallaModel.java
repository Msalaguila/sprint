package es.msalaguila.sprint.pantalla;

public class PantallaModel implements PantallaContract.Model {

    public static String TAG = PantallaModel.class.getSimpleName();

    private int numero;

    public PantallaModel() {
        //
        this.numero = 0;
    }

    @Override
    public void incrementNum(){
        this.numero++;
        if(numero > 9) {
            numero = 0;
        }
    }

    @Override
    public int getNumero(){
        return numero;
    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
