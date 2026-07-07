class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n-1;
       while(i<j){
                while(i<j && arr[i]%2 == 0){
                        i++;
                }
                if(i<j && arr[i] % 2 != 0 && arr[j] % 2 == 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        j--;
                }
                while(i<j && arr[j] % 2 != 0){
                        j--;
                }
       }
        return arr;

    }
}