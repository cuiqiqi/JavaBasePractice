package taiji.com.cn.JavaBasePractice.polymorphism;

import sun.management.resources.agent;

public abstract class AnimalDemo {
	/**
	 * 面向对象
	 * 对象最基本的特征：属性和行为，比如人，属性可理解为一双手，一双脚，一张嘴；行为可理解为手在挥舞，叫在走路，用嘴吃饭；
	 * 
	 * 面向对象的程序设计有三大特点：封装、继承和多态
	 * (1)封装：是面向对象编程的核心思想，将对象的属性和行为封装起来，其载体就是类，类通过对客户隐藏其实现细节，这就是封装的思想。
	 * 特点：为用户提供对象的属性和行为，无需知道内部是如何形成的，保证了类内部数据结构的完整性，提高了程序的可维护性。
	 * (2)继承：extend，A类(父类)中包含B类(子类)中的属性，B类中有A类没有的属性(B类独有的属性)，所以B类可以继承A类，复用A类中的属性和方法
	 * (3)多态：同一个行为具有多个不用表现形式或形态的能力就是多态，即接口的多种不同的实现方式，
	  * 多态又分为 编译时多态和运行时多态。
 	 *	编译时多态：比如重载，在编译时已经确定好了，方法名相同而参数列表不同的一组方法，
	 *	运行时多态：比如重写，通过动态绑定(dynamic binding)技术来实现，在执行期间判所引用对象的实际类型，通过函数的重写和向上转型来实现，
	 * 
	 * 向上转型：子类引用的对象转换为父类的类型，即将子类对象转为父类对象，父类对象可以是接口
	 * 向下转型：把父类对象转为子类对象
	 */
	int num = 10;
	static int age = 20;
	
	public void eat() {
		System.out.println("动物在吃饭");
	}
	public void sleep() {
		System.out.println("动物在睡觉");
	}
	public void run() {
		System.out.println("动物在跑步");
	}
	public static void main(String[] args) {
		function(new Cat());
		function(new Dog());
		
		
//		animal.catchMouse();//注意：转型时，子类单独的方法会丢失，animal不能访问Cat自己的方法，animal.catchMouse()会报错，
		//子类引用不能指向父类对象 Cat c = (Cat)new Animal(); 这样时不行的。
		
		
	}

	private static void function(Dog dog) {
		// TODO Auto-generated method stub
		
	}
	private static void function(Cat cat) {
		AnimalDemo animal = new Cat(); //向上转型，子类对象转为父类对象
		animal.eat();
		animal.sleep();  
		
		
	}

		/*
		 *为 什么第一段代码不报错呢？相比你也知道了，因为 a 本身就是 Cat 对象，所以它理所当然的可以向下转型为 Cat，也理所当然的不能转为
		 * Dog，你见过一条狗突然就变成一只猫这种操蛋现象？
		 * 
		 * 而a1 为 Animal 对象，它也不能被向下转型为任何子类对象。比如你去考古，发现了一个新生物，知道它是一种动物，但是你不能直接说，啊，它是猫，或者说它是狗。
		 */ 
}
