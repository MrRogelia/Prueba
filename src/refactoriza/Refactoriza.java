package refactoriza;
import java.util.Scanner;
public class Refactoriza{
    
public static void main(String[] args){
    menu();
    }

static void menu(){
    Scanner leer = new Scanner (System.in); 
        int opcion=0;
        double resultado=0;
        int numero=0;
    do{
        System.out.println("1.- Funcion1");
        System.out.println("2.- Funcion2");
        System.out.println("3.- Resultado");
        System.out.println("0.- Salir");
        System.out.println("Opción: ");
        opcion = leer.nextInt();

    switch(opcion){
    case 1:
        resultado = Calculos.funcion1();
        mostrar(resultado);
    break;
    case 2:
        System.out.println("\nIntroduzca num1: ");
        numero = leer.nextInt();
        resultado = Calculos.funcion2(numero);
        mostrar(resultado);
    break;
    case 3:
        Calculos.funcion3(resultado);
    break;
    default:
    }
    }
     while(opcion != 0);
    }

static void mostrar(double resu){
    System.out.println();
    System.out.println("La visualización del resultado es");
    System.out.println("---------------------------------");
    System.out.println("Para ello tenemos que visualizar los valores");
    System.out.println("--------------------------------------------");
    System.out.println();
    System.out.println();
    System.out.println("Resu: "+ resu);
}

}