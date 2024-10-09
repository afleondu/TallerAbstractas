import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Circulo circulo = new Circulo("Azul",3, 5, 10);
        Rectangulo rectangulo = new Rectangulo("AMarillo",4, 6, 5, 8);
        Triangulo triangulo = new Triangulo("rojo",6, 9, 7, 7);


        System.out.println("-------------Bienvenido-------------");

        Scanner scint = new Scanner(System.in);
        boolean paro = false;

        do{
            System.out.println("Escoge Una Opcion: \n"+
                    "1. Crear una nueva Figura\n"+
                    "2. Calcular el area y perimetro de una figura\n"+
                    "3. Mover una figura\n"+
                    "4. Dibujar una figura\n"+
                    "5. Salir");
            int opcion = scint.nextInt();

            switch (opcion) {
                case 1:
                    cualfigura(circulo, triangulo, rectangulo);
                    break;
                case 2:
                    calcularArea(circulo, triangulo, rectangulo);
                    break;
                case 3:
                    moverFigura(circulo, triangulo, rectangulo);
                    break;
                case 4:
                    dibujarFigura(circulo, triangulo, rectangulo);
                    break;
                case 5:
                    paro = true;
                    break;
                default:
                    System.out.println("Ingresaste datos invalidos");
                    break;

            }


        }while(!paro);
    }

    public static void cualfigura(Circulo c, Triangulo t, Rectangulo r){
        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);


        System.out.println(" Cual figura desea ingresar\n"+
                "1. Circulo\n"+
                "2. Rectangulo\n"+
                "3. Triangulo\n");
            int figura = sc.nextInt();
            int x, y;
            double radio;
            int base, altura;
            String color;


            if (figura==1){
                System.out.println("Circulo datos : ");

                System.out.println("color: " + c.getColor());
                System.out.println("ingrese nuevo color: ");
                color = scs.next();

                System.out.println("x: " + c.getX());
                System.out.println("ingrese nuevo x: ");
                x = scs.nextInt();

                System.out.println("y: " + c.getY());
                System.out.println("ingrese nuevo y: ");
                y = scs.nextInt();

                System.out.println("ingrese nuevo Radio: ");
                radio = scs.nextDouble();

                c = new Circulo(color, x , y , radio);

            }else if (figura==2){
                System.out.println("Rectagulo datos : ");

                System.out.println("color" + r.getColor());
                System.out.println("ingrese nuevo color: ");
                color = scs.next();

                System.out.println("x" + r.getX());
                System.out.println("ingrese nuevo x: ");
                x = scs.nextInt();

                System.out.println("y" + r.getY());
                System.out.println("ingrese nuevo y: ");
                y = scs.nextInt();

                System.out.println("ingrese nuevo base: ");
                base = scs.nextInt();

                System.out.println("ingrese nuevo altura: ");
                altura = scs.nextInt();

                r = new Rectangulo(color, x , y , base, altura);

        }else if(figura==3){
                System.out.println("Triangulo datos : ");

                System.out.println("color" + r.getColor());
                System.out.println("ingresse nuevo color: ");
                color = scs.next();

                System.out.println("x" + r.getX());
                System.out.println("ingresse nuevo x: ");
                x = scs.nextInt();

                System.out.println("y" + r.getY());
                System.out.println("ingresse nuevo y: ");
                y = scs.nextInt();

                System.out.println("ingresse nuevo base: ");
                base = scs.nextInt();

                System.out.println("ingresse nuevo altura: ");
                altura = scs.nextInt();

                t = new Triangulo(color, x , y , base, altura);
            }else{
                System.out.println("ingreso invalido");
            }

    }

    public static void calcularArea(Circulo c, Triangulo t, Rectangulo r){
        Scanner sc = new Scanner(System.in);
        System.out.println("circulo");
        System.out.println(c.calcularArea());
        System.out.println(c.calcularPerimetro());

        System.out.println("triangulo");
        System.out.println(t.calcularArea());
        System.out.println(t.calcularPerimetro());

        System.out.println("Rectangulo");
        System.out.println(r.calcularArea());
        System.out.println(r.calcularPerimetro());

    }

    public static void moverFigura(Circulo c, Triangulo t, Rectangulo r){

        System.out.println("moviendo figuaras");
        System.out.println("circulo");
        c.moverVerticalmente(9);
        c.moverHorizontalmente(9);

        System.out.println("triangulo");
        t.moverVerticalmente(9);
        t.moverHorizontalmente(9);

        System.out.println("Rectangulo");
        r.moverVerticalmente(9);
        r.moverHorizontalmente(9);



    }

    public static void dibujarFigura(Circulo c, Triangulo t, Rectangulo r){

        System.out.println("dibujando figuras");
        System.out.println("Circulo");
        c.dibujar();

        System.out.println("Triangulo");
        t.dibujar();

        System.out.println("rectangulo");
        r.dibujar();




    }
}