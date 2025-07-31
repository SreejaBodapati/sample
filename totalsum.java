import java.util.*;
public class totalsum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int sum=0;
			int n=sc.nextInt();
			int m=sc.nextInt();
			for(int j=n;j<=m;j++) {
				if(j%3!=0 && j%5!=0) {
					sum=sum+j;
				}
			}
			System.out.println(sum);
		}
		
	}

}