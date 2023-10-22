public class splitMethod {
    public static void main(String[] args) {
        String str1 = "Hello I am Pawan Phanieswar";
        String[] arr = str1.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
