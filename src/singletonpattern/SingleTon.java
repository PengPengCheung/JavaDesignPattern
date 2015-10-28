package singletonpattern;

public class SingleTon {
	private static SingleTon singleton;
	
	//构造方法修改成私有的
	private SingleTon(){
		System.out.println("SingleTon Class has been created!");
	}
	
	//因为SingleTon类没有办法在外部进行实例化（构造方法为私有），因此需要用类来调用一个返回实例的方法
	//此方法也定义为static
	public static SingleTon getInstance(){
		if(singleton == null){
			singleton = new SingleTon();
			return singleton;
		}
		return singleton;
	}
}
