package decoratorpattern;

public class ConcreteDecoratorB extends Decorator{
//	public void decorate(){
//		super.decorate();
//		System.out.println("ConcreteDecoratorB �Ĳ���");
//	}

	//ʵ��Component�����е�Operation����
	@Override
	public void Operation() {
		// TODO Auto-generated method stub
		super.decorate();
		super.getComponent().state = "getConcreteDecoratorB";
		System.out.println("ConcreteDecoratorB �Ĳ���"+super.getComponent().state);
	}
}
