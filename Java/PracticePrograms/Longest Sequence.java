public class Longest_Sequence {
    private static int i;

    public static void main(String[] args) {
        String s = "1100110111";
        int left = 0,right = 0,n = s.length(),count0 = 0;
        int res = 0;
        while (right < n){
            if (s.charAt(right) == '0'){
                count0++;
            }

            while (count0 > 1){
                if (s.charAt(left) == '0'){
                    i = count0--;
                }
                left++;
            }
            res = Math.max(right - left + 1,res);
            right++;
        }
        
        System.out.println(res);
    }
}
