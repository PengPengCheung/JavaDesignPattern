package builderpattern;

public class BuilderPatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConcreteBuilder内部已经关联了具体要构造的产品类，所以不用在构造方法中指定产品类
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct("This is head", "This is body", "This is foot");
		
		System.out.println(builder.getProduct().getHead());
		System.out.println(builder.getProduct().getBody());
		System.out.println(builder.getProduct().getFoot());
	}

}
