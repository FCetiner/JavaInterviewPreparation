public class ArmstrongNumber {
    public static void main(String[] args) {
        int a=153;

        System.out.println(isArmstrog(a));
    }

    private static boolean isArmstrog(int a) {
        int result=0;
        int num=a;
        while (num>0){
            result+=((num%10)*(num%10)*(num%10));
            num/=10;
        }
        return a==result;
    }
}
