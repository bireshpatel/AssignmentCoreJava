public class MyFirstClass {
    public static void main(String args[])
    {
        TwoDataMember member = new TwoDataMember(32, 16);

        int sum = member.add();
        System.out.println("Sum is: " + sum);

        int sub = member.sub();
        System.out.println("Subtraction is: " + sub);

        int div = member.div();
        System.out.println("Division is: " + div);

        int multi = member.multi();
        System.out.println("Multiplication is: " + multi);
    }

}
