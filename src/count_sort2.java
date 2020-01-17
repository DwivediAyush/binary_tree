import java.util.*;
public class count_sort2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];
        int max=0;
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
            if (max<a[i])
                max=a[i];

        }
        int[] c=new int[max+1];
        for(int i=0;i<size;i++)
            c[a[i]]=c[a[i]]+1;
        for(int i=1;i<max+1;i++)
            c[i]=c[i]+c[i-1];

        int[] b=new int[size];
        for(int i=size-1;i>=0;i--)
        {
            b[c[a[i]]-1]=a[i];
            c[a[i]]-=1;
        }
        for(int i=0;i<size;i++)
            System.out.print(b[i]+" ");

    }
}
