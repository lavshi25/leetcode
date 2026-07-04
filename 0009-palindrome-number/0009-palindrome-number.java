class Solution {
     static int revNum(int num) {
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }

        return revNum;
    }


    static boolean isPalindrome(int num) {
        if(num<0){
            return false;
        }
        int originalNum = num;
        int reversedNum = revNum(num);

        if (originalNum == reversedNum) {
            System.out.println("is palindrome");
            return true;
        } else {
            System.out.println("aint palindrome");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans1 = isPalindrome(num);
        System.out.println("num is:" + num);
        System.out.println("ans1 is " + ans1);
        
  

    sc.close();

    }
}