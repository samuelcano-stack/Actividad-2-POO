package appejercicio2.pkg4;

public class Trapecio {
    int bMayor;
    int bMenor;
    int altura;
    int lado1;
    int lado2;
    public Trapecio(int bMayor, int bMenor, int altura, int lado1, int lado2) {
        this.bMayor = bMayor;
        this.bMenor = bMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    double calcularArea() {
        return ((bMayor+bMenor)*altura)/2;
    }
    double calcularPerímetro() {
        return lado1+lado2+bMayor+bMenor;
    }
}
