import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicate {
	public static int duplicate1(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j])
						return a[i];
			}
		}
		return -1;
		
	}
	
	public static int duplicate2(int[] a){
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1])
				return a[i];			
		}
		return -1;
	}
	
	public static int duplicate3(int[] a){
		int nn=0;
	for(int i=0;i<a.length;i++)	
	{
		if(a[i]<0)	
			  nn = -a[i];
		else nn=a[i];
		if(a[nn]<0)
			return -a[i];
		else
			a[nn]=-a[nn];
		
	}
	return -1;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Please enter dupilicates");
		for(int i =0 ;i<n;i++){
			a[i]=s.nextInt();
		}
		int dup;
		long start;
		long end;
		
		 start = System.currentTimeMillis();
		 dup = duplicate1(a);
		if(dup==-1)
			System.out.println("No dupicates");
		else
			System.out.println("dupilicate is :"+dup);
		 end = System.currentTimeMillis();
		
		System.out.println("Time1:" + (end-start)/1000.0 +"seconds");
		
		start = System.currentTimeMillis();
		 dup = duplicate2(a);
		if(dup==-1)
			System.out.println("No dupicates");
		else
			System.out.println("dupilicate is :"+dup);
		 end = System.currentTimeMillis();
		
		System.out.println("Time2:" + (end-start)/1000.0 +"seconds");

		start = System.currentTimeMillis();
		 dup = duplicate3(a);
		if(dup==-1)
			System.out.println("No dupicates");
		else
			System.out.println("dupilicate is :"+dup);
		 end = System.currentTimeMillis();
		
		System.out.println("Time3:" + (end-start)/1000.0 +"seconds");
	}

}
