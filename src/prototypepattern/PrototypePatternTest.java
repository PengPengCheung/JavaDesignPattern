package prototypepattern;

public class PrototypePatternTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcretePrototype prototype = new ConcretePrototype("prototype");
		System.out.println("prototypeList: "+prototype.getList());
		
		ConcretePrototype copyOfPrototype = prototype.clone();//对原型类进行复制
		copyOfPrototype.setName("copy");
		System.out.println("copyOfPrototype: "+copyOfPrototype.getList());
		
		System.out.println("prototypeList: "+prototype.getList());
		//浅复制输出结果：（对复制类的修改会对原型类有影响）
		//prototypeList: [prototype]
		//copyOfPrototype: [prototype, copy]
		//prototypeList: [prototype, copy]
		//深复制输出结果：（对复制类的修改会对原型类不会有影响）
		//prototypeList: [prototype]
		//copyOfPrototype: [prototype, copy]
		//prototypeList: [prototype]
	}

}
