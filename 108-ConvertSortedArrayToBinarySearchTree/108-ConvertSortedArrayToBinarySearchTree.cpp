// Last updated: 7/22/2025, 3:15:00 PM
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        if(nums.size()==0) return NULL;
        //call a recursive function(function,left,right)
        return bst(nums,0,nums.size()-1);
    }
//make a recursive function
    TreeNode* bst(vector<int>nums,int left,int right)
    {
        //no point is doing
        if(left>right)return NULL;
        //so, if we get a midpoint.we have to store it as node
        //finding midpoint
        int midPoint = left+(right-left)/2;
        //storing it
        TreeNode* node= new TreeNode(nums[midPoint]);
        //allotted node will have left,right childrennn
        node->left=bst(nums,left,midPoint-1);
        node->right=bst(nums,midPoint+1,right);
        return node;
    }
};