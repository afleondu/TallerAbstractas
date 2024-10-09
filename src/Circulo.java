public class Circulo extends Figura implements Movible, Dibujable{
    private double radio;

    public Circulo(String color, int x, int y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void moverHorizontalmente(int distancia) {
        setX(getX() + distancia);
    }

    @Override
    public void moverVerticalmente(int distancia) {
        setY(getY() + distancia);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio);
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el círculo...");
    }
}
