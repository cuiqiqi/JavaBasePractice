package taiji.com.cn.JavaBasePractice;


/**
 * 练习静态关键字 static 使用方法  
 * @author CQQ
 *
 */
public class StaticTest {
	
	/**
	 * 由static修饰的变量、常量和方法被称为静态成员（静态变量、静态常量和静态方法）
	 * 静态成员属于类所有，区别于个别对象，
	 * 可以使用 类名.静态成员 形式调用静态成员等方法
	 */
	
	static double PI = 3.141592657;		//在类中定义静态常量
	static int pi;						//在类中定义静态变量
	
	public static void method() {		//在类中定义静态方法
		System.out.println("练习static静态方法的使用！");
	}
	public void method1() {				//在类中定义非静态方法
		System.out.println(StaticTest.PI);	//非静态方法调用静态常量使用类名.静态常量
		System.out.println(StaticTest.pi);	//非静态方法调用静态变量使用类名.静态变量
		StaticTest.method();				//非静态方法调用静态方法使用类名.静态方法
	}

	public static void method2() {
//		method1();			//报错，在静态方法中不可以直接调用非静态方法
//		return this;		//会报错，规定在静态方法中不可以使用this关键字
	}
	
}
