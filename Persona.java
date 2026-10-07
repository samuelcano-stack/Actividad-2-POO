package appejercicio2.pkg1;

public class Persona {
    String nombre;
    String apellidos;
    String númeroDocumentoIdentidad;
    int añoNacimiento;
    String PaisNacimiento;
    char Genero;

    Persona(String nombre, String apellidos, String númeroDocumentoIdentidad, int añoNacimiento, String PaisNacimiento, char Genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.númeroDocumentoIdentidad = númeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.PaisNacimiento = PaisNacimiento;
        this.Genero = Genero;
    }
    
    void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellidos = " + apellidos);
        System.out.println("Número de documento de identidad = " + númeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Pais de nacimiento = " + PaisNacimiento);
        System.out.println("Género = " + Genero);
        System.out.println();
    }

}
