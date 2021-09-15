import java.util.Scanner;

class RomainToInt{
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Phrase avec majuscules : ");
        String str = in.nextLine();
        int val;
        int i;

        i = 0;
        val = 0;
        while (i < str.toCharArray().length){
            if (str.toCharArray()[i] == 'I' || str.toCharArray()[i] == 'V' || str.toCharArray()[i] == 'X' || str.toCharArray()[i] == 'L' || str.toCharArray()[i] == 'C' || str.toCharArray()[i] == 'D' || str.toCharArray()[i] == 'M'){
                switch (str.toCharArray()[i]){
                    case 'I':
                        if ((str.toCharArray()[i+1] == 'V' || str.toCharArray()[i+1] == 'X') && i < str.toCharArray().length)
                            val -= 1;
                        else
                            val += 1;
                        break;
                    case 'V':
                        val += 5;
                    case 'X':
                        if ((str.toCharArray()[i+1] == 'L' || str.toCharArray()[i+1] == 'C') && i < str.toCharArray().length)
                            val -= 10;
                        else
                            val += 1;
                        break;
                    case 'L':
                        val += 50;
                    case 'C':
                        if ((str.toCharArray()[i+1] == 'D' || str.toCharArray()[i+1] == 'M') && i < str.toCharArray().length)
                            val -= 100;
                        else
                            val += 100;
                        break;
                    case 'D':
                        val += 500;
                    case 'M':
                        val += 1000;
                }    
            }
            else{
                System.out.println("oops");
                return;
            }
            i++;
        }
        System.out.println(val);
    }
}