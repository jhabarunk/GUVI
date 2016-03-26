 public static void spiralOrZigzagLevelOrder(TreeNode root) {
        if(root==null) return; 
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        
        boolean directionflag=false;
        while(!stack.isEmpty())
        {
            Stack<TreeNode> tempStack=new Stack<TreeNode>();
        
            while(!stack.isEmpty())
            {
                TreeNode tempNode=stack.pop();
             System.out.printf("%d ",tempNode.data);
                if(!directionflag) 
                {
                    if(tempNode.left!=null) 
                     tempStack.push(tempNode.left);
                    if(tempNode.right!=null) 
                     tempStack.push(tempNode.right);
                }else
                {
                    if(tempNode.right!=null) 
                     tempStack.push(tempNode.right);
                    if(tempNode.left!=null) 
                     tempStack.push(tempNode.left);
                }
            }
            directionflag=!directionflag; 
      
            stack=tempStack; 
        }
     
    }
