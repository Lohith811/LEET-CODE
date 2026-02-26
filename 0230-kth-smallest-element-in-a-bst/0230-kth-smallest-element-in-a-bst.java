
 
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int count=0; 
        TreeNode curr=root;
        while(curr!=null){
           
            if(curr.left==null){
                count++;
                if(count==k)return curr.val;
                curr=curr.right;
            }
            else{
                TreeNode pred=curr.left;
              
                while(pred.right!=null && pred.right!=curr)pred=pred.right;
                if(pred.right==null){//make thread
                    pred.right=curr;
                    curr=curr.left;
                }
                else{//remove thread
                    pred.right=null;
                    count++;
                    if(count==k)return curr.val;
                    curr=curr.right;
                }
            }
        }
        return -1;//k is invalid
    }
}