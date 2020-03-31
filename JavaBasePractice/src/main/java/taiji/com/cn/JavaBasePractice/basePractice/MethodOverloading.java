package taiji.com.cn.JavaBasePractice.basePractice;

public class MethodOverloading {
	/**
	 * 方法重载: 方法名相同，参数列表不同的函数，与返回值无关
	 * 		参数列表不同包括：参数类型不同；参数个数不同
	 * 	方法名相同，jvm会自动寻找参数类表相同的函数进行计算			
	 */
	public static void main(String[] args) {
		
		System.out.println(sum(10,20)); //自动找参数列表为2个的函数，也就是方法1
		System.out.println(sum(10,20,30));//自动找参数列表为3个的函数，也就是方法2
		System.out.println(sum(10,20,30,40));//自动找参数列表为4个的函数，也就是方法3
		
		System.out.println(sum(10.4f,20));
	}
	//方法1
	public static int sum(int a,int b) {
		return a+b;
	}
	public static float sum(float a,float b) {
		return a+b;
	}
	//方法2
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	//方法3
	public static int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}

}
