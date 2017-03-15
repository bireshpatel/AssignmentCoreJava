import java.util.Scanner;

/**
 * Created by x17212 on 3/14/2017.
 */
public class MyFirstProgram {
    public static void main(String args[]){
//        swappingNumber();
        decrementNumber();
    }

    private static void swappingNumber(){
        String var1, var2, temp;
        System.out.println("Enter Var1 and Var2");
        Scanner userInput = new Scanner(System.in);
        var1 = userInput.nextLine();
        var2 = userInput.nextLine();

        System.out.println("Entered No is: Var1- "+var1+", Var2- "+var2);

        temp = var1;
        var1=var2;
        var2=temp;

        System.out.println("Swapping No is: Var1- "+var1+", Var2- "+var2);
    }

    private static void decrementNumber(){

        for(int i=80; i>60; i -=3){
            System.out.println(i);

        }
    }
}
