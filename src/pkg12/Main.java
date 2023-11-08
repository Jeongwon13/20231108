package pkg12;

import java.util.Scanner;

public class Main {

	public int solution(int n, int m, int[] arr) {
		int answer = 0, max = 0;
		
		for(int i=0; i<m; i++) {
			max += arr[i];
		}
		
		if(max > answer) answer = max;
		
		for(int i=m; i<n; i++) {
			max += arr[i]-arr[i-m];
			answer = Math.max(max, answer);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n,m,arr));
		
	}

}
