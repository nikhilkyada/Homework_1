import java.util.Scanner;

public class Multi {
    public static void main (String args[]){
        //---------------------------------------Scanner method---------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int input= scan.nextInt();  // Taking input from user
        int a=1; // Temporary variable
//------------------------------------------  While Loop  -------------------------------------
        while(a>0){
            //---------------------------------If loop ----------------------------------
            if (a <=10) {
                System.out.println(input + " * " + a +" = " +(input * a)); //printing output
            }
            a++;  //increasing temporary variable
        }
    }
}
