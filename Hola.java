import java.util.Scanner;

public class Hola{
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        System.out.println("Ingrese el primer numero a sumar: ");
        int a = A.nextInt();
        Scanner B = new Scanner(System.in);
        System.out.println("Ingrese el segundo termino a sumar:");
        int b = B.nextInt();
        int suma = a + b;
        System.out.println("la suma de los valores anteriormente ingresados es de :" + suma);
    }
}