package taiji.com.cn.JavaBasePractice;

import java.time.LocalDateTime;

import org.junit.Test;

public class BubbleSortTest {

	
	public static void main(String[] args) {
		/**
		 * 数组排序算法
		 */
		int[] num = {23,12,45,6,67,90};

		//外层循环，比较的轮数
		for (int i = 0; i < num.length-1; i++) {
			//内层循环次数
			for (int j = 0; j < num.length-i-1; j++) {
				if (num[j] > num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		for (int j = 0; j < num.length; j++) {
			System.out.print(String.format("%s%s", num[j],"\t"));
		}
	}
	
	//错误实例
	@Test
	public void timeTest() {
		String date = String.valueOf(LocalDateTime.now()).replace("T", " ").substring(0,19);
		int dateInt = Integer.valueOf(date);
		String day = String.valueOf(String.format("%tc", dateInt));
		System.out.println(day);
	}
	
	
}
