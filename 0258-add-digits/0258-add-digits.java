class Solution {
    static int addDigits(int num) {
        while( num >= 10){
            int sum = 0;

            while(num != 0){
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(addDigits(num));
    }
}