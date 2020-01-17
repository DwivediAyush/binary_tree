


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
               if(temp.data>=n.data)
               {
                   temp=temp.left; }
                   else
               {
                   temp=temp.right;
               }


           }
           if(parent.data>=n.data)
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
  public int size(TreeNode node)
  {
      if(node==null)
      {
          return 0;
      }
      int leftsize=size(node.left);
      int rightsize=size(node.right);
      return leftsize+rightsize+1;
  }
  public int height(TreeNode node)
  {
      if(node==null)
      {
          return 0;
      }
      int left=height(node.left);
      int right=height(node.right);
      return 1+max(left,right);
  }

    private int max(int left, int right) {
       if(left>right)
           return left;
       return right;

   }

    public static void main(String[] args) {
MyBinaryTree tree=new MyBinaryTree();
tree.insert(10);
tree.insert(11);
tree.insert(8);
tree.insert(13);
tree.insert(14);
tree.display();
        System.out.println();
        System.out.println(tree.size(tree.root));
        System.out.println(tree.height(tree.root));
    }
}
