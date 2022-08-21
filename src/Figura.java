public abstract class Figura {


    private String Color;

    public Figura(String color) { // constructor
        Color = color;
    }

    public String getColor() { //Metodo Geter normal
        return Color;
    }

    public abstract double calcularArea();

}
