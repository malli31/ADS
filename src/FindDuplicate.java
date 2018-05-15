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

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Please enter dupilicates");
		for(int i =0 ;i<n;i++){
			a[i]=s.nextInt();
		}
		long start = System.currentTimeMillis();
		int dup = duplicate1(a);
		if(dup==-1)
			System.out.println("No dupicates");
		else
			System.out.println("dupilicate is :"+dup);
		long end = System.currentTimeMillis();
		
		System.out.println("Time:" + (end-start)/1000.0 +"seconds");

	}

}
