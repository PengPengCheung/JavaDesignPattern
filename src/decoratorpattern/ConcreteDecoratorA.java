package decoratorpattern;

public class ConcreteDecoratorA extends Decorator {
//	public void decorate(){
//		super.decorate();
//		System.out.println("ConcreteDecoratorA �Ĳ���");
//	}

	
	//ʵ��Component�����е�Operation����
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.decorate();
		System.out.println("ConcreteDecoratorA �Ĳ���");
	}
}
