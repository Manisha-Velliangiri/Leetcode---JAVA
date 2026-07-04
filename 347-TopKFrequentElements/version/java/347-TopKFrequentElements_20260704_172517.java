// Last updated: 7/4/2026, 5:25:17 PM
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        
4        HashMap<Integer , Integer> mapp =  new HashMap<>();
5
6
7        for(int i=0;i<nums.length;i++){
8
9             mapp.put(nums[i],mapp.getOrDefault(nums[i],0)+1);
10        }
11
12        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
13            (a,b)-> b.getValue()-a.getValue()
14        );
15        
16        for(Map.Entry<Integer,Integer> entry : mapp.entrySet()){
17
18            pq.add(entry);
19        }
20
21
22       
23
24        int[] ans = new int[k];
25
26        for(int i=0;i<k;i++){
27            ans[i] =pq.poll().getKey();
28        }
29        return ans;
30        
31
32
33    }
34}