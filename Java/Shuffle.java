package Java;
import java.util.Random;
public class Shuffle {
   public static void shuffle(int array[]){
	   Random r=new Random();
	   int n=array.length;
	   for(int i=n-1;i>0;i--) {
		   int j=r.nextInt(i+1);
		   int t=array[i];
		   array[i]=array[j];
		   array[j]=t;
	   }
   }
	public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6,7};
        System.out.println("Actual array :");
        for(int i=0;i<=(array.length-1);i++) {
        	System.out.print(array[i]+" ");
        }
        System.out.println();
	    shuffle(array);
	    System.out.println("After shuffeld : ");
	    for(int i=0;i<=(array.length-1);i++) {
	    	System.out.print(array[i]+" ");
	    }
	    System.out.println();
	}

}
