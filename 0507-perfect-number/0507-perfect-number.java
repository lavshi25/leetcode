class Solution {
    static boolean checkPerfectNumber(int num) {

        if(num == 1){
            return false;
        }
      
           int sum = 1;
            
            for(int i = 2; i * i <= num; i++){
                if(num % i == 0){
                    int f1 = i;
                    int f2 = num / i;
                    
                    if(f1 != num){
                        sum = sum + f1;
                    }
                    if(f2 != num && f2 != f1){
                        sum = sum + f2;
                    }
                }
              
            }
                 if(sum == num){
                return true;
                }
                else{
                    return false;
                }

        
           
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkPerfectNumber(num));
    }
}