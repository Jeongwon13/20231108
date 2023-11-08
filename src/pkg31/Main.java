package pkg31;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public ArrayList<Integer> solution(int n, int k, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<k-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			// 20 12 20
		}
		int lt=0;
		for(int i=k-1; i<n; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			// 10
			list.add(map.size());
			//4
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			lt++;
		}
		
		return list;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		for(int x : T.solution(n, m, arr)) System.out.print(x + " ");
	}

}
