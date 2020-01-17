import java.util.*;

public class count_sort {

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
        int[] b=new int[max+1];
        for(int i=0;i<size;i++)
        {
            b[a[i]]++;
        }
        int x=0;
        for(int i=0;i< max+1;i++)
        {
            for(int j=0;j<b[i];j++) {
                a[x] = i;
            x++;
            }
        }
        for(int i=0;i<size;i++)
            System.out.print(a[i]+" ");

    }


}
