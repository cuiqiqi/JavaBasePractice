package taiji.com.cn.JavaBasePractice.basePractice;

import java.util.Scanner;

public class ChengFaKouJue {
	/**
	 * 乘法口诀表
	 * 键盘录入一个int值数n(0<n<9)
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个n值(0<n<9)：");
		int n = sc.nextInt();
		
		//调用chengFa方法
		chengFa(n);
	}
	/*
	 * 请输入一个值：
		5
		1x1=1	
		2x1=2	2x2=4	
		3x1=3	3x2=6	3x3=9	
		4x1=4	4x2=8	4x3=12	4x4=16	
		5x1=5	5x2=10	5x3=15	5x4=20	5x5=25
	 */
	public static void chengFa(int n) {
		for (int x = 1; x <= n; x++) {
			for (int j = 1; j <= x; j++) {
				System.out.print(x + "x" + j + "=" + x*j+"\t");
			}
			System.out.println();
		}
	}

}
