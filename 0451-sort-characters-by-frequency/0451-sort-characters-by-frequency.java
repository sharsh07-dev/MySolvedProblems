class Solution {
    public String frequencySort(String s) {

        int[] hash = new int[256]; // hash array or Frequency Counting Array.

        for (char ch : s.toCharArray()) { //count the frequency..
            hash[ch]++; //O n
        }
        StringBuilder sm = new StringBuilder(); // O n

        // find max freqEle. to do multiple iterations we will use while loop.
        while (true) {
            
            int maxFreq = 0;
            int index = -1;
            for (int i = 0; i < 256; i++) {
                if (hash[i] > maxFreq) {
                    maxFreq = hash[i];
                    index = i;
                }
            }
            if (maxFreq == 0) {
                break;
            }

            while (maxFreq-- > 0) {
                sm.append((char)index);
            }
            hash[index] = 0;
        }
        return sm.toString();
    }
}