import java.util.Scanner;
import java.lang.Math;

class PowerOfTwo{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Entrez le nombre que vous voulez tester : ");
        int num = in.nextInt();

        if (Math.sqrt(num) == 2 || num == 2 || num = 1)
            System.out.println(num + " est une puissance de 2");
        else
            System.out.println(num + " n'est pas une puissance de 2");        
    }
}