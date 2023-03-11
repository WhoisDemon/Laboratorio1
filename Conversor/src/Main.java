
public class Main {
    public static void main(String[] args) {
        ConversorMoneda conversor = new ConversorMoneda(1000);        
        System.out.println("Su monto en pesos chilenos: " + conversor.getMonto());
        System.out.println("Su monto en dolares: " + conversor.convertirADolares());
        System.out.println("Su monto en euros: " + conversor.convertirAEuros());
        System.out.println("Su monto en pesos argentinos: " + conversor.convertirAPesosArgentinos());
    }
}

