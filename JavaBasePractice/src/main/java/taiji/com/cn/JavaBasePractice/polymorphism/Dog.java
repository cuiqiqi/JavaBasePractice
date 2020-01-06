package taiji.com.cn.JavaBasePractice.polymorphism;

public class Dog extends AnimalDemo{

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

	@Override
	public void sleep() {
		System.out.println("狗睡觉");
	}
	
	public void DogCalled() {
		System.out.println("狗在叫");
	}

}
