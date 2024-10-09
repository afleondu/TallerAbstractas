import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Figura circulo = new Circulo(3, 5, 10);
        Figura rectangulo = new Rectangulo(4, 6, 5, 8);
        Figura triangulo = new Triangulo(6, 9, 7);

        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();

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
                    listaFiguras.add(cualfigura(circulo, rectangulo, triangulo));
                    break;
                case 2:
                    calcularArea(listaFiguras);
                    break;
                case 3:
                    moverFigura(listaFiguras);
                    break;
                case 4:
                    dibujarFigura(ListaFigura);
                    break;
                case 5:
                    paro = true;
                    break;
                default:
                    System.out.println("Ingresaste datos invalidos");
                    break;

            }


        }while(paro);
    }

    public static void cualfigura(Figura circulo, Figura rectangulo, Figura triangulo){
        Scanner sc = new Scanner(System.in);


        System.out.println(" Cual figura desea ingresar\n"+
                "1. Circulo\n"+
                "2. Rectangulo\n"+
                "3. Triangulo\n");
            int figura = sc.nextInt();
            int x, y;
            double radio;
            int base, altura;
            Figura figurita;

            if (figura==1){
                System.out.println("Ingrese posicion del circulo en x: ");
                x= sc.nextInt();

                System.out.println("Ingrese posicion del circulo en y: ");
                y= sc.nextInt();

                System.out.println("Ingrese radio del circulo: ");
                radio = sc.nextDouble();
                figurita = new Circulo(x, y, radio);
            }else if (figura==2){
            System.out.println("Ingrese posicion del rectangulo en x: ");
            x= sc.nextInt();

            System.out.println("Ingrese posicion del rectangulo en y: ");
            y= sc.nextInt();

            System.out.println("Ingrese base del rectagulo: ");
            base = sc.nextInt();

            System.out.println("Ingrese altura del rectagulo: ");
            altura = sc.nextInt();
            figurita = new Rectangulo(x, y, base, altura);

        }else if(figura==3){
                System.out.println("Ingrese posicion del triangulo en x: ");
                x= sc.nextInt();

                System.out.println("Ingrese posicion del triangulo en y: ");
                y= sc.nextInt();

                System.out.println("Ingrese base del triangulo: ");
                base = sc.nextInt();

                System.out.println("Ingrese altura del triangulo: ");
                altura = sc.nextInt();
                figurita = new Triangulo(x, y, base, altura);
            }else{
                return figurita;
            }

            return figurita;
    }

    public static void calcularArea(ArrayList<Figura> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("seleccione una figura");
        for(Figura f : lista){
            System.out.println("id: "+lista.indexOf(f));
            f.mostrarDatos();
        }

        System.out.println("ingrese Id Figura");
        int opcion = sc.nextInt();
        Figura figura = lista.get(opcion);
        figura.calcularArea();
        figura.calcularPerimetro();
    }

    public static void moverFigura(ArrayList<Figura> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("seleccione una figura");
        for(Figura f : lista){
            System.out.println("id: "+lista.indexOf(f));
            f.mostrarDatos();
        }

        System.out.println("ingrese Id Figura");
        int opcion = sc.nextInt();
        Figura figura = lista.get(opcion);
        figura.mover();
    }

    public static void dibujarFigura(){
        Scanner sc = new Scanner(System.in);
        System.out.println("seleccione una figura");
        for(Figura f : lista){
            System.out.println("id: "+lista.indexOf(f));
            f.mostrarDatos();
        }

        System.out.println("ingrese Id Figura");
        int opcion = sc.nextInt();
        Figura figura = lista.get(opcion);
        figura.dibujar();
    }



}