import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int num = input.nextInt();
        mostrarDoble(num);
    }

    public static void mostrarDoble (int number)
    {
        System.out.println(number*2);
    }
}
