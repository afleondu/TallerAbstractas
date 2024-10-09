public class Circulo extends Figura implements Movible, Dibujable{
    private double radio;

    public Circulo(String color, int x, int y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }


}
