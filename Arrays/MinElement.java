public class MinElement {
    public static void main(String[] args) {

        int[] arr = { 11, 32, 5, 7, 55, 3, 42, 2, 21, 17, 1 };
        System.out.println(min(arr));
    
    }
    static int min(int[] arr) {
        int min = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
