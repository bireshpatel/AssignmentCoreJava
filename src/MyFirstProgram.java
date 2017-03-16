import java.util.Scanner;

/**
 * Created by x17212 on 3/14/2017.
 */
public class MyFirstProgram {
    public static void main(String args[]){
//        swappingNumber();
//        decrementNumber();
        allElementsArray();
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

    private static void allElementsArray(){
        int[] array = {1,3,12,34,98,67,43,44};
        int sum = 0;
        double avg = 0;
        int max = 0;
        int i;

        for(i=0; i<array.length; i++){
            sum = sum+array[i];
            avg = sum/array.length;
            if(max < array[i]){
                max = array[i];
            }
            if(i%2 == 1){
                System.out.println("Odd No: "+array[i]);
            }
        }
        System.out.println("Sum of Array: "+sum);
        System.out.println("Average of Array: "+avg);
        System.out.println("Max of Array: "+max);
    }


}
