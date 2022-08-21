
public class Cuadrado extends Figura{

    private double Lado;

    public Cuadrado(String color, double lado) {
        super(color);
        Lado = lado;
    }

    @Override
    public double calcularArea() {
        double area;
        area=Lado*Lado;
        return area;


    }
}
