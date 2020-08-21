import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int[] a = new int[len];
		for (int i = 0; i < a.length; i++) 
			a[i] = in.nextInt();
		
//		int[][]  dpmin = new int[len][len];
		int dpminLast = a[0],dpminNow = a[0];
		int dpsumLast = a[0],dpsumNow = a[0];
		int temp = dpminNow*dpsumNow;
		for (int i = 0; i < a.length; i++) {
			dpminLast = a[i];
			dpsumLast = a[i];
			if(temp < a[i]*a[i])
				temp = a[i]*a[i];
			for (int j = i + 1 ; j < a.length; j++) {
				dpminNow = a[j] < dpminLast ? a[j] : dpminLast;
				dpsumNow = a[j] + dpsumLast;
				if(temp < dpminNow*dpsumNow)
					temp = dpminNow*dpsumNow;
				dpminLast = dpminNow;
				dpsumLast = dpsumNow;
			}
		}
		
//		for (int i = 0; i < a.length; i++) { 
//			dpmin[i][i] = a[i];
//			for (int j = i + 1; j < a.length; j++) {
//				dpmin[i][j] = a[j] < dpmin[i][j-1] ? a[j] : dpmin[i][j-1];
//			}
//		}
//		
//		int[][]  dpsum = new int[len][len];
//		for (int i = 0; i < a.length; i++) { 
//			dpsum[i][i] = a[i];
//			for (int j = i + 1; j < a.length; j++) {
//				dpsum[i][j] = a[j] + dpsum[i][j-1];
//			}
//		}
//		int temp = dpmin[0][0]*dpsum[0][0];
//		for (int i = 0; i < a.length; i++) 
//			for (int j = i; j < a.length; j++) 
//				if(temp < dpmin[i][j]*dpsum[i][j])
//					temp = dpmin[i][j]*dpsum[i][j];
		
		System.out.println(temp);
	}
}