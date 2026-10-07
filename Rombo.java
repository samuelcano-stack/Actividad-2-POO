package appejercicio2.pkg4;

public class Rombo {
    int dMayor;
    int dMenor;
    int lado;
    public Rombo(int dMayor, int dMenor, int lado) {
        this.dMayor = dMayor;
        this.dMenor = dMenor;
        this.lado = lado;
    }
    double calcularArea() {
        return (dMayor*dMenor)/2;
    }
    double calcularPerímetro() {
        return (4*lado);
    }
}
