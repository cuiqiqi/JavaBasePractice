package taiji.com.cn.JavaBasePractice;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestPratice {
	private final static Logger logger = LoggerFactory.getLogger(TestPratice.class);

	public static void main(String[] args) {

		/**
		 * 一维数组： 初始化一维数组，数组名字arr[]，数字类型int，数组长度int[]无定义，
		 * 数组值{31,28,31,30,31,30,31,31,30,31,30,31}（也就是初始化数组）
		 */
		int arr[] = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < 12; i++) {
			int j = i + 1;
			System.out.print(String.format("第 %s 月有 %s 天,", j, arr[i]));
		}
		System.out.println("\n");
		/**
		 * 二维数组： a[3][4]：表示3行4列的矩阵。 b = new int[2][4];表示：创建一个二维数组b，包括这两个长度为4 的一维数组。
		 * 也可以写成： b = new int[2][]; b[0] = new int[2]; b[1] = new int[3];
		 */

		int a[][] = { { 1, 2, 3, 4 }, { 10, 20, 30, 40 }, { 100, 200, 300, 400 } }; // 直接给a赋值
//			int a[][] = new int[3][4];   //对于整型二维数组，创建成功之后系统会给数组中的每个元素赋初始值0；
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
//**************************************************************************************************************************			
		/**
		 * 遍历二维数组 foreach遍历
		 */
		int arr2[][] = { { 1, 2 }, { 3, 4 } };
		System.out.println("数组中元素为：");
		int i = 0;
		for (int c[] : arr2) {
			i++;
			int j = 0;
			for (int d : c) {
				j++;
				if (i == arr2.length && j == c.length) { // 判断变量是否是二维数组中的最后一个元素
					System.out.print(d); // 输出二维数组中的最后一个元素
				} else {
					// 如果不是二维数组中的最后一个元素
					System.out.print(d + "、");
				}
			}
		}

//**************************************************************************************************************************			
		/**
		 * 填充替换数组元素
		 * 
		 * 通过Arrays的静态方法fill来进行替换 方法(1)：.fill(int[] a,int value) a:要进行元素替换的数组
		 * value：要存储数组中所有元素的值 方法(2)：.fill(int[] a,int fromIndex,int toIndex,int value);
		 * a:要进行元素替换的数组 fromIndex：指定填充的第一个元素的索引(包括) toIndex：指定填充的最后一个元素的索引(不包括)
		 * value：要存储数组中所有元素的值
		 */
		int a2[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(a2.length);
		for (int j : a2) {
			System.out.println(String.format("数组中的原始元素为：%s", j));
		}
		Arrays.fill(a2, 1); // 使用Arrays的fill方法(1)
		for (int j : a2) {
			System.out.println(String.format("替换后的元素为：%s", j));
		}
		Arrays.fill(a2, 2, 4, 0); // 使用Arrays的fill方法(2)
		int i1 = 0;
		for (int j : a2) {
			i1++;
			System.out.println(String.format("第 %s 个元素为：%s", i1, j));
		}
//**************************************************************************************************************************			
		/**
		 * 对数组进行排序 使用Arrays的sort()方法 注：默认是从小到大
		 */
		int q[] = new int[] { 48, 23, 56, 1, 34, 5 };
		System.out.println("排序前：");
		for (int j : q) {
//				logger.info(String.format("排序前：%s", j));
			System.out.print(String.format("%s%s", j, ","));
		}
		System.out.println("\n");
		Arrays.sort(q);
		System.out.println("排序后：");
		for (int j : q) {
//				logger.info(String.format("排序后：%s", j));
			System.out.print(String.format("%s%s", j, ","));
		}
		System.out.println("\n");
//**************************************************************************************************************************
		/**
		 * 复制数组 使用Arrays.copyOf()和Arrays.copyOfRange()方法 Arrays.copyOf(arr,int
		 * newLength)：复制数组至指定的长度,int型newLength的长度如果大于arr.length的长度， 使用0来填充，char型用null填充；
		 * Arrays.copyOfRange(arr,int fromIndex,int toIndex)：指定数组的指定长度复制到一个新数组中
		 * fromIndex:索引开始位置(包含)
		 * toIndex：索引结束位置(不包含，length-1位置)，如果toIndex长度大于原数组长度，int型用0填充
		 */
		int copyInt[] = new int[] { 1, 12, 34 };
		int newcopyInt[] = Arrays.copyOf(copyInt, 5);// 使用copyOf方法，长度5大于3，剩余2个长度用0填充，
//			int newcopyInt[] = Arrays.copyOf(copyInt, copyInt.length);  //原长，两个人数组
		System.out.println("复制后的int型数组为：");
		for (int j : newcopyInt) {
			System.out.print(String.format("%s%s", j, ","));// 结果为1,12,34,0,0
		}
		System.out.println();

		// copyOfRange方法
		int newCopyInt[] = Arrays.copyOfRange(copyInt, 1, 4);// 从下标为1开始，下标为4结束，超出copyInt的长度，用0填充到4-1位置
		System.out.println("复制后的int型数组为：");
		for (int j : newCopyInt) {
			System.out.print(String.format("%s%s", j, ","));
		}
		System.out.println();
//**************************************************************************************************************************			
		/**
		 * 数组查询 使用binarySearch方法前必须要对数组进行排序(Arrays.sort方法)
		 * 方法(1)：Arrays.binarySearch(Object[],object key) 
		 * [1]搜索值key不是数组元素，且在数组范围内，从1开始计数，得“ - 插入点索引值”； 
		 * [2]搜索值key是数组元素，从0开始计数，得搜索值的索引值；
		 * [3]搜索值key不是数组元素，且大于数组内元素，索引值为 – (length + 1); 
		 * [4]搜索值key不是数组元素，且小于数组内元素，索引值为– 1。 
		 * 方法(2)：Arrays.binarySearch(Object[], int fromIndex, int toIndex, Object
		 * key) fromIndex：指定范围的开始处索引（包含） toIndex：指定范围的结束处索引（不包含） 
		 * [1]该搜索键在范围内，但不是数组元素，由1开始计数，得“ - 插入点索引值”； 
		 * [2]该搜索键在范围内，且是数组元素，由0开始计数，得搜索值的索引值；
		 * [3]该搜索键不在范围内，且小于范围（数组）内元素，返回–(fromIndex + 1)； 
		 * [4]该搜索键不在范围内，且大于范围（数组）内元素，返回–(toIndex + 1)。
		 */
		int find[] = new int[] { 1, 3, 6, 9, 12 };
		System.out.println("find[]长度为：" + find.length);
		Arrays.sort(find);
		// 4在数组中不存在但在数组范围内，则数组中的第一位从1开始计数，找到比4大的第一个数值6(插入点索引值，下标为3)，得-3
		int index1 = Arrays.binarySearch(find, 4);
		int index2 = Arrays.binarySearch(find, 10);
		// 数组不存在15且不再范围内，得‘-(find.length+1),即-6
		int index3 = Arrays.binarySearch(find, 15);
		System.out.println(String.format("index1：%s，index2：%s，index3：%s", index1, index2, index3));

		// 方法：Arrays.binarySearch(Object[], int fromIndex, int toIndex, Object key)
		// 从数组中下标为1开始(包含)到下标为3(不包含)结束，结果为(3,6)，找数值6，是数组元素，从0开始计数到数值为6得位置，得6的下标就是结果值2。
		int index4 = Arrays.binarySearch(find, 1, 3, 6);
		// 从数组中下标为1开始(包含)到下标为3(不包含)结束，结果为(3,6)，找4，不是数组元素但在范围内，从1开始计数到比4大的第一个元素为插入点即6下标为3，得‘-3’
		int index5 = Arrays.binarySearch(find, 1, 3, 4);
		// 从数组中下标为1开始(包含)到下标为3(不包含)结束，结果为(3,6)，找2，不是数组元素但小于范围内元素，规定“-(fromIndex+1)”,即-(1+1)=-2;
		int index6 = Arrays.binarySearch(find, 1, 3, 2);
		// 从数组中下标为1开始(包含)到下标为3(不包含)结束，结果为(3,6)，找10，不是数组元素但大于范围内元素，规定“-(toIndex+1)”,即-(3+1)=-4
		int index7 = Arrays.binarySearch(find, 1, 3, 10);
		System.out.println(String.format("index4：%s，index5：%s，index6：%s，index7：%s", index4, index5, index6, index7));

//**************************************************************************************************************************			
		/**
		 * 数组排序 
		 * (1)冒泡排序：相邻的元素对比，if b2>b1,大的b2数值移动到小的b1数值的后面，大的b2数值再和后面的数
		 * 值b3对比，if<b3,位置不动，b3和b4对比；if>b3,换到b3后面，以此比较，最大数放最后，最小数放最前； 
		 * (2)直接选择排序：指定排序位置与其他元素对比，满足条件就交换位置，
		 * (3)反转排序：以相反的顺序把原有数组内容重新排序
		 */
		// 冒泡排序*********************************************************
		int[] num = { 23, 12, 45, 6, 67, 90 };
		System.out.println("冒泡排序前：");
//			Arrays.sort(num);
		for (int j : num) {
			System.out.print(String.format("%s%s", j, "\t"));
		}

		// 外层循环，比较的轮数（长度-1）
		for (int n = 0; n < num.length - 1; n++) {
			// 内层循环控制每一趟排序多少次,j < num.length-1-n，因为冒泡是把每轮循环中较大的数飘到后面，
			// 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
			for (int j = 0; j < num.length - 1 - n; j++) {
				if (num[j] > num[j + 1]) {
					//交换位置
					int temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}

		}
		System.out.println("冒泡排序后：");
		for (int j = 0; j < num.length; j++) {
			System.out.print(String.format("%s%s", num[j], "\t"));
		}
		System.out.println();
		
		//直接选择排序******************************************
		int[] a1 = { 23, 34, 20,12, 57, 54,90,1};
		System.out.println("直接选择排序前：");
		for (int j : a1) {
			System.out.print(j+",");
		}
		System.out.println("直接选择排序后：");
		for (int i11 = 0; i11 < a1.length; i11++) {
			int tem = i11;
			for (int j = i11+1; j < a1.length-1; j++) {
				//大于>，从大到小排序，小于<，从小到大
				if (a1[j] > a1[tem]) {
					tem = j;
				}
			}
			if (tem != i11) {
				int  temp = a1[i11];
				a1[i11] = a1[tem];
				a1[tem] = temp;
			}
		}
		for (int i11 : a1) {
			System.out.print(String.format("%s%s", i11, ","));
		}
		System.out.println();
		
		//反转排序******************************************
		int[] ab = {2,13,44,23,45,28,18};//偶数最中间两个数互换位置，计数最中间元素不动
		System.out.println("反转排序前：");
		for (int j : ab) {
			System.out.print(String.format("%s%s", j,","));
		}
		int parm;
		int len = ab.length;
		for (int b = 0; b < len/2;b++) {
			//互换位置
			parm = ab[b];
			ab[b] = ab[len-1-b];
			ab[len-1-b] = parm;
		}
		System.out.println("反转排序后：");
		for (int j : ab) {
			System.out.print(String.format("%s%s", j,","));
			
		}
	}

}
