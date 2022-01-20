package testGit;

public class about {
public static void main(String[] args) {
	int[] a= {4,5,6,7,7,4,3};
	int count=0;
	int val=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++)  {
//			System.out.println(a[i]+" value of a at i  "+a[j]+" value of a at j");
			if(a[i]==a[j]) {
				val=a[i];
				System.out.println(val+" value of a[i] ");
				
				count++;
				System.out.println(count);
			}
		}
	}
	

//	System.out.println(count+" toatl no of count");
//	System.out.println(val+" value of a[i] ");
}
}
