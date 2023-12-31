package pkg1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public boolean isPrime(int res) {
		if(res == 1) return false;
		for(int i=2; i<res; i++) {
			if(res % i == 0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int tmp = arr[i];
			int res = 0;

			while(tmp > 0) {
				int t = tmp % 10;
				res = res * 10 + t;
				tmp /= 10; 
			}
			if(isPrime(res)) list.add(res);
					
		}
		
		return list;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x+" ");
		}
	}

}
