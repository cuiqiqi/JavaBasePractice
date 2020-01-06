package taiji.com.cn.JavaBasePractice;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] a = { 23, 34, 20,12, 57, 90};
		System.out.println("排序前：");
		for (int j : a) {
			System.out.print(j+",");
		}
		System.out.println("排序后：");
		for (int i = 0; i < a.length-1; i++) {
			int tem = i;
			for (int j = i+1; j < a.length-1; j++) {
				if (a[j] < a[tem]) {
					tem = j;
				}
			}
			if (tem != i) {
				int  temp = a[i];
				a[i] = a[tem];
				a[tem] = temp;
			}
		}
		
		for (int i : a) {
			System.out.print(String.format("%s%s", i, ","));
		}
		System.out.println();
	}
}
