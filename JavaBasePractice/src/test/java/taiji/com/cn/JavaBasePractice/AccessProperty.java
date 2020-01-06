package taiji.com.cn.JavaBasePractice;

public class AccessProperty {

	static int i = 47;		//如果非静态下，ac.i++ 的结果为47，ac1.i++的结果为60，
						//添加静态属性，ac1.i=60改变了静态成员的值，使用对象ac调用成员变量的值也变成了60，
	public void method() {
		System.out.println("调用method方法：");
		for (int i = 0; i < 3; i++) {
			System.out.print(i + " ");
			if (i == 2) {
				System.out.println("\n");
			}
		}
	}
	public AccessProperty() {
	}

	public static void main(String[] args) {
		AccessProperty ac = new AccessProperty();
		AccessProperty ac1 = new AccessProperty();
		ac1.i = 60;
		System.out.println("第一个实例对象调用变量i的结果：" + ac.i++);
		ac.method();
		System.out.println("第二个实例对象调用变量i的结果：" + ac1.i);
		ac.method();
	}
	
}
