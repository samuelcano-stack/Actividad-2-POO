package appejercicio2.pkg5;

public class CuentaBancaria {
    String nombresTitular;
    String apellidosTitular;
    int númeroCuenta;
    tipo tipoCuenta;
    double saldo = 0;
    double pim;
    CuentaBancaria(String nombresTitular, String apellidosTitular, 
    int numeroCuenta, tipo tipoCuenta, double pim) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.númeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.pim = pim;
    }
    void imprimir() {
        System.out.println("Nombres del titular = " + nombresTitular);
        System.out.println("Apellidos del titular = " + apellidosTitular);
        System.out.println("Número de cuenta = " + númeroCuenta);
        System.out.println("Tipo de cuenta = " + tipoCuenta);
        System.out.println("Saldo = " + saldo);
    }
    void consultarSaldo() {
        System.out.println("El saldo actual es = $" + saldo);
    }
    boolean consignar(int valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Se ha consignado $" + valor + " en la cuenta. El nuevo saldo es $" + saldo);
            return true;
        } 
        else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
            return false;
        }
    }
    boolean retirar(int valor) {
        if ((valor > 0) && (valor <= saldo)) {
            saldo = saldo - valor;
            System.out.println("Se ha retirado $" + valor + " de la cuenta. El nuevo saldo es $" + saldo);
            return true;
        }
        else {
            System.out.println("El valor a retirar debe ser menor que el saldo actual.");
            return false;
        }
    }
    void calcularNuevoSaldo() {
        double interes = saldo * (pim / 100);
        saldo = saldo + interes;
        System.out.println("Se aplicó un interés de $" + interes + " (" + pim + "% mensual). El nuevo saldo es $" + saldo);
    }
}
