package decoratorpattern;

public class ConcreteDecoratorA extends Decorator {
//	public void decorate(){
//		super.decorate();
//		System.out.println("ConcreteDecoratorA 的操作");
//	}

	
	//实现Component父类中的Operation方法
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.decorate();
		System.out.println("ConcreteDecoratorA 的操作");
	}
}
