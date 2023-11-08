package pkg21;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<Integer> solution(int n, int[] arr, int m, int[] arr2) {
		ArrayList<Integer> answer= new ArrayList<>();
		int idx1=0, idx2=0;
		
		while(idx1<n && idx2<m) {
			if(arr[idx1]>arr2[idx2]) {
				answer.add(arr2[idx2]);
				idx2++;
			} else if(arr2[idx2]>arr[idx1]){
				answer.add(arr[idx1]);
				idx1++;
			} else {
				answer.add(arr[idx1++]);
				answer.add(arr2[idx2++]);
			
			}
		}
		
		while(idx1<n) {
			answer.add(arr[idx1++]);
		
		}
		while(idx2<m) {
			answer.add(arr2[idx2++]); 
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] arr2= new int[m];
		for(int i=0; i<m; i++) arr2[i] = sc.nextInt();
		for(int x : T.solution(n, arr, m, arr2)) System.out.print(x + " ");
	}

}
