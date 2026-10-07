package appejercicio2.pkg5;

public class AppEjercicio25 {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro","Pérez",123456789,tipo.AHORROS, 1.5);
            cuenta.imprimir();
            cuenta.consignar(200000);
            cuenta.consignar(300000);
            cuenta.retirar(400000);
            cuenta.consultarSaldo();
            cuenta.calcularNuevoSaldo();
            cuenta.consultarSaldo();
        }
    
}
