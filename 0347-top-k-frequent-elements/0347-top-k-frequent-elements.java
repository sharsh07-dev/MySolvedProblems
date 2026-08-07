class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        List<List<Integer>> BucketList = new ArrayList<>();
        HashMap <Integer,Integer> mpp = new HashMap<>();
        int [] ans = new int[k];
        for( int num : nums){ 
            mpp.put(num,mpp.getOrDefault(num,0)+1);
        }
        
        for( int i =0 ;i <n+1; i++){ // created n sized buckets!!
            BucketList.add(new ArrayList<>());
        }

       for (int num : mpp.keySet()){
              BucketList.get(mpp.get(num)).add(num);
        }
        int index=0;
        
        for(int i = n ; i >=1 ;i--){
                 
                 for(int num : BucketList.get(i)){
                    if(index == ans.length){
                        return ans;
                    }   
                    else{
                     ans[index] = num;
                     index++;
                  }
        }
       
      }
        return ans;
  }
      
    }
