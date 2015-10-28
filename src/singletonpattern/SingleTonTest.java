package singletonpattern;

public class SingleTonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon singleton1 = SingleTon.getInstance();
		SingleTon singleton2 = SingleTon.getInstance();
		
		//整个包中只有一个SingleTon实例，上面的实例化语句如果分别实例化了两个不一样的对象，则不是单例，执行else后的语句
		//如果只是实例化了一个对象，则singleton1与singleton2相等，执行if中的语句
		if(singleton1 == singleton2){
			System.out.println("singleton1 is the same as singleton2.");
		}else{
			System.out.println("singleton1 is not the same as singleton2.");
		}
	}

}
