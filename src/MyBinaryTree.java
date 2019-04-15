class TreeNode
{
 TreeNode left;
 int data;
 TreeNode right;


}


public class MyBinaryTree {
    TreeNode root;
   /* void insert(int data)
    {
            root=insert(root ,data);

    }*/

   void insert(int data)
   {
       TreeNode n=new TreeNode();
       n.data=data;
       if(root==null)
       {
           root=n;

       }
       else
       {   TreeNode temp=root;
           TreeNode parent=root;
           while(temp!=null)
           {     parent=temp;
               if(temp.data>n.data)
               {
                   temp=temp.left; }
                   else
               {
                   temp=temp.right;
               }


           }
           if(parent.data>n.data)
           {
               parent.left=n;

           }
           else
               parent.right=n;
       }
   }



    private TreeNode insert(TreeNode root, int data) {
        if(root==null)
        {
            root=new TreeNode();
            root.data=data;
            return root;
        }
        else
        {
            if(root.right ==null)
            {root.right =insert(root.right,data);

            }
            else
            { root.left =insert(root.left,data);

            }

        }
        return root;

    }
void display()
{
    inorder(root);
}

    private void inorder(TreeNode root) {
     if(root==null)
         return;

     inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
MyBinaryTree tree=new MyBinaryTree();
tree.insert(10);
tree.insert(11);
tree.insert(12);
tree.insert(13);
tree.insert(14);
tree.display();

    }
}
