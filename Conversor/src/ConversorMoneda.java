
public class ConversorMoneda {
    private int monto;

    public ConversorMoneda(int monto) {
        this.monto = monto;
    }
    public int getMonto() {
        return monto;
    }
    public void setMonto(int monto) {
        this.monto = monto;
    }
    public int convertirADolares() {
        return monto / 100;
    }
    public int convertirAEuros() {
        return monto / 110;
    }
    public int convertirAPesosArgentinos() {
        return monto / 200;
    }
}

    

