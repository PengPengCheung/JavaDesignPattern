package decoratorpattern;

public class ConcreteDecoratorB extends Decorator{
//	public void decorate(){
//		super.decorate();
//		System.out.println("ConcreteDecoratorB 的操作");
//	}

	//实现Component父类中的Operation方法
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.decorate();
		super.getComponent().state = "getConcreteDecoratorB";
		System.out.println("ConcreteDecoratorB 的操作"+super.getComponent().state);
	}
}
