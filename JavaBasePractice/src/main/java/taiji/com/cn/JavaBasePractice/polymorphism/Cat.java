package taiji.com.cn.JavaBasePractice.polymorphism;
//继承抽象父类
public class Cat extends AnimalDemo{
	int num = 30;
	static int age = 40;
	
	@Override  //重写父类中的方法
	public void eat() {
		System.out.println("猫吃鱼");
		
	}

	@Override  //重写父类中的方法
	public void sleep() {
		System.out.println("猫睡觉");
	}
	
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
	

}
