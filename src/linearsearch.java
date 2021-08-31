
import java.util.Scanner;

public class linearsearch {
    public static void main(String args[]){
        int i;
        System.out.println("enter the limit");
        Scanner sc=new Scanner(System.in);
        int limit=sc.nextInt();
        int array[]=new int[limit];
        System.out.println("enter the numbers :");
        for( i=0;i<=limit-1;i++)
        {
           array[i]=sc.nextInt();
        }
     System.out.println("ENTER THE NUMBER TO BE SEARCH");
        int search=sc.nextInt();
        int j;
        for(j=0;j<=limit-1;j++){
            if(array[j]==search){
                System.out.println("THE NUMBER IS IN "+(j+1)+" POSITION");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("!!!ONLY FIRST OCCURENCE WILL IS COUNT!!!");
    }
}
