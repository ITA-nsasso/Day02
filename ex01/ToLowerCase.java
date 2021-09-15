import java.util.Scanner;

class ToLowerCase{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Phrase avec majuscules : ");
        String str = in.nextLine();
        String lowercase = "";
        
        for (char carac : str.toCharArray()){
            if (carac >= 65 && carac <= 90){
                lowercase += (carac += 32);
            }
            else
                lowercase += carac;
        }
        System.out.println(lowercase);
    }
}