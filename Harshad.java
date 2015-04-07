public class Harshad{
    private static long sumDigits(long n){
        long sum = 0;
        for(char digit:Long.toString(n).toCharArray()){
            sum += Character.digit(digit, 10);
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("The first 20 Harshad numbers: ");
        for(int count = 0, i = 1; count < 20;i++){
            if(i % sumDigits(i) == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("The smallest Harshad number greater than 1000: ");
        for(int i = 1001; ; i++){
            if(i % sumDigits(i) == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
