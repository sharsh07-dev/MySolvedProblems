class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();

        if(n ==0){
            return "";
        }
    StringBuilder sm = new StringBuilder();
        for( int i =n-1 ; i >=0 ;i--){
            char ch = num.charAt(i); // 56 -48
         if( (ch - '0') % 2 != 0){ //5 % 2
            
           sm.append(num.substring(0,i+1));
              break;
            }
        }
        return sm.toString();
    }
}