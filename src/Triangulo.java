public class Triangulo extends Figura implements Movible, Dibujable {
    private double base;
    private double altura;

    public Triangulo(String color, int x, int y, double base, double altura) {
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando el triángulo de base " + base + " y altura " + altura);
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el triángulo...");
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * base;
    }

    @Override
    public void moverHorizontalmente(int distancia) {
        setX(getY() + distancia);
    }

    @Override
    public void moverVerticalmente(int distancia) {
        setY(getY() + distancia);
    }
}
