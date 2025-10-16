// Last updated: 10/16/2025, 2:07:08 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        
        Map<Integer , Integer> m = new HashMap<>();

        for(int i=0;i<nums2.length;i++){
            
            while(!st.isEmpty() && nums2[i]>st.peek()){
                 
                 int prev = st.pop();
                 m.put(prev,nums2[i]);
            }
            st.push(nums2[i]);
        }

        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]= m.getOrDefault(nums1[i],-1);
        }
        return ans;

    

 

        


    }
}