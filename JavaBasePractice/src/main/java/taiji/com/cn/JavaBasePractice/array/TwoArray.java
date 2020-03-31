package taiji.com.cn.JavaBasePractice.array;

import java.util.Scanner;

/**
 * 二维数组解决杨辉三角
 */
public class TwoArray{
	/**
	 * 1
	 * 1 1 
	 * 1 2 1
	 * 1 3 3 1
	 * 1 4 6 4 1
	 * 1 5 10 10 5 1
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int n = sc.nextInt();
		
		//定义一个二维数组
		int[][] a = new int[n][n];
		
		//二维数组的第一列和最后一列赋值1
		for (int x = 0; x < a.length; x++) {
			a[x][0] = 1; //任何一行的第一列
			a[x][x] = 1; //任何一行的最后一列
		}
		//从第三行开始，每个数据是上一行的前一列和它上一行的本列之和，
		for (int x = 2; x < a.length; x++) {
			//y <= x-1 可以解决最后一列的问题，组成三角形的形式	
			//y从1开始，因为第一列已经有值了
			for (int y = 1; y <= x-1; y++) {
				//每个数据是上一行的前一列和它上一行的本列之和
				a[x][y] = a[x-1][y-1] + a[x-1][y];
			}
		}
		//遍历数组
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y <= x; y++) {
				System.out.print(a[x][y] + " ");
			}
			System.out.println();
		}
	}
}
