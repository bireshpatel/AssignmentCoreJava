import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String args[]){
        swappingNumber();
        decrementNumber();
        allElementsArray();

        int sumOfNo = returnSumValue(65834);
        System.out.println("Sum of individual digits: " + sumOfNo);


        checkPrimeNo();
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

    private static int returnSumValue(int var){
        int sum = 0;
        while(var > 0){
            sum += var % 10;
            var = var / 10;
        }
        return sum;
    }

    private static void checkPrimeNo(){
        int k = 2;
        System.out.print("Prime Nos are: ");
        for(int i=1; i < 100; i++){
            int total = 0;
            for(int j=1; j <= k ; j++){
                if(k%j == 0){
                    total++;
                }
            }
            if(total == 2){
                System.out.print(" " + k);
            }
            k++;
        }
    }

}