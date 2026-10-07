package appejercicio2.pkg3;

public class AppEjercicio23 {

    public static void main(String[] args) {
        Automóvil auto1 = new Automóvil("Ford",2018,3,tipoCom.DIESEL,tipoA.EJECUTIVO,5,6,250,tipoColor.NEGRO,true);
        auto1.imprimir();
        
        auto1.setVelocidadActual(240);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        
        auto1.acelerar(30);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        
        auto1.desacelerar(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
        
        System.out.println("¿Tiene multas? = " + auto1.tieneMultas);
        System.out.println("Cantidad de multas = " + auto1.cantidadMultas);        
    }    
}
