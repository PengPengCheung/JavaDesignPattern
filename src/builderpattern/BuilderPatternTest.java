package builderpattern;

public class BuilderPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConcreteBuilder�ڲ��Ѿ������˾���Ҫ����Ĳ�Ʒ�࣬���Բ����ڹ��췽����ָ����Ʒ��
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct("This is head", "This is body", "This is foot");
		
		System.out.println(builder.getProduct().getHead());
		System.out.println(builder.getProduct().getBody());
		System.out.println(builder.getProduct().getFoot());
	}

}
