package taiji.com.cn.JavaBasePractice.basePractice;

public class ArrayTest {
	
	/**
	 * 数组：存储同一种数据类型的多个元素的容器； 
	 * 特点： 每一个元素都有编号，从0开始，最大编号是数据的长度-1； 编号的专业叫法：索引；
	 * 
	 * 定义格式：
	 * 		A：数据类型[ ] 数组名；（推荐用这个）
	 * 		B：数据类型 数组名[ ];
	 *
	 * 数组的初始化：
	 * 		A：动态初始化
	 * 			只给长度，系统给出默认值 	举例：int[] arr = new int[3];
	 * 
	 * 		B：B:静态初始化 
	 * 			给出值，系统决定长度  举例：int[] arr = new int[]{1,2,3};  简化版：int[] arr = {1,2,3};
	 * Java的内存分配
	 *	A:栈 存储局部变量
	 *	B:堆 存储所有new出来的
	 *	C:方法区(面向对象部分详细讲解)
	 *	D:本地方法区(系统相关)
	 *	E:寄存器(CPU使用)
	 * 		
	 * 	注意：
			a:局部变量 在方法定义中或者方法声明上定义的变量。
			b:栈内存和堆内存的区别
				栈：数据使用完毕，就消失。
				堆：每一个new出来的东西都有地址
				    每一个变量都有默认值
						byte,short,int,long 0
						float,double 0.0
						char '\u0000'
						boolean false
						引用类型 null
				    数据使用完毕后，在垃圾回收器空闲的时候回收。		
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,34};
		
		//遍历数组
		printArrays(arr);
		System.out.println("-------------------");
		//获取最大值/最小值
		int max = getMax(arr);
		System.out.println("数组中的最大值为：" + max);
		int min = getMin(arr);
		System.out.println("数组中的最小值为：" + min);
		System.out.println("-------------------");
		//数组的逆序
		System.out.print("逆序后：");
		reverse(arr);
		System.out.print("逆序后：");
		reverse2(arr);
		//查找元素在数组中的索引
		int[] arr1 = {1,2,3,4,5,34};
		int index = getIndex(arr1,5);
		System.out.print("指定的索引值为："+index);
	}
	
	//数组的遍历
	public static void printArrays(int[] arr) {
		/*方法1 打印结果：
		 *  1
			2
			3
			4
			5
			34
		*/
		for (int x = 0; x < arr.length; x++) {
			System.out.println(arr[x]);
		}
		
		//方法2  打印结果：[1,2,3,4,5,34]
		System.out.print("[");
			for (int x = 0; x < arr.length; x++) {
				if (x == arr.length-1) {
					System.out.println(arr[x] + "]");
				}else {
					System.out.print(arr[x] + ",");
				}
			}
			
	}
	
	//获取数组中的最大值
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		return max; 
	}
	//获取数组中的最小值
		public static int getMin(int[] arr) {
			int min = arr[0];
			for (int x = 1; x < arr.length; x++) {
				if (arr[x] < min) {
					min = arr[x];
				}
			}
			return min; 
		}
	//数组的逆序（原数组倒过来）
		public static void reverse(int[] arr) {
			//方法1，先逆序
			for (int x = 0; x < arr.length/2; x++) {
				int temp = arr[x];
				arr[x] = arr[arr.length-1-x];
				arr[arr.length-1-x] = temp;
			}
			//再遍历
			System.out.print("[");
			for (int x = 0; x < arr.length; x++) {
				if (x == arr.length-1) {
					System.out.println(arr[x] + "]");
				}else {
					System.out.print(arr[x] + ",");
				}
			}
			
		}
		public static void reverse2(int[] arr) {
			//方法2
			for (int start = arr[0],end = arr[arr.length-1]; start < end; start++,end--) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
			//再遍历
			System.out.print("[");
			for (int x = 0; x < arr.length; x++) {
				if (x == arr.length-1) {
					System.out.println(arr[x] + "]");
				}else {
					System.out.print(arr[x] + ",");
				}
			}
		}
		
	//查找元素在数组中的索引
		public static int getIndex(int[] arr,int value) {
			//方法1
			for (int x = 0; x < arr.length; x++) {
				if (arr[x] == value) {
					return x;
				}
			}
			//在Java中如果找不到数据，会使用-1表示返回的数据
			return -1;
		}
		public static int getIndex2(int[] arr,int value) {
			//方法2
			int index = -1; //先定义一个索引
			for(int x=0; x<arr.length; x++) {
				if(arr[x] == value) {
					index = x;  //如果有就修改索引值
					break;
				}
			}
			return index;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
