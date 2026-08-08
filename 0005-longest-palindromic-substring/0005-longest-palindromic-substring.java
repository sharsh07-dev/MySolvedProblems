// class Solution {
//     public String longestPalindrome(String s) {
//         int n = s.length();
//         int max = Integer.MIN_VALUE;

//         String ans = "";
//         int start = -1;
//         int end = -1;           (//O n * 0 n)
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 String currentSubString = s.substring(i, j + 1);
//                 String clone = reverse(currentSubString);
//                 if (clone.equals(currentSubString)) {
//                     if (clone.length() > max) {
//                         max = clone.length();
//                         start = i;
//                         end = j;
//                         ans = s.substring(i, j + 1);
//                     }
//                 }
//             }
//         }
//         return ans;
//     }

//    public String reverse(String s) {
//     if (s == null || s.isEmpty()) {
//         return s;
//     }

//     
//     char[] chars = s.toCharArray();
//     int start = 0;
//     int end = chars.length - 1;

//    
//     while (start < end) {
//         char temp = chars[start];
//         chars[start] = chars[end];
//         chars[end] = temp;
//         start++;
//         end--;
//     }

//    
//     return new String(chars);
// }
// }

class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans="";
        for( int i =0 ; i < n ; i++){
            for( int j =i ; j < n ; j++){
                 String palin = s.substring(i,j+1);
                if(isPalindrome(palin)){
                    if(palin.length() > ans.length()){
                        ans = palin;
                    }
                }
            }
        }
        return ans;
    }

    public boolean isPalindrome(String s) {
        int i = 0;
        int n = s.length() - 1;
        while (i <= n) {
            if (s.charAt(i) != s.charAt(n)) {
                return false;
            } else {
                i = i + 1;
                n = n - 1;
            }
        }
        return true;
    }
}