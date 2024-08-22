
import java.util.Scanner;

public class zero {

public static void main(String[] args) {
        
Scanner leia = new Scanner(System.in);

System.out.println(" Digite um número de 1 a 5:");
int  numero = leia.nextInt();

switch (numero) {

    case 1:
        System.out.println("O número escolhido é 1");
        break;
    case 2:
        System.out.println("O número escolhido é 2");
        break;
    case 3:
        System.out.println("O número escolhido é 3");
        break;
    case 4:
        System.out.println("O número escolhido é 4");
        break;
    case 5:
        System.out.println("O número escolhido é 5");
        break;
    default:
        System.out.println("Número inválido! Tente novamente.");
        break;

}


}

}