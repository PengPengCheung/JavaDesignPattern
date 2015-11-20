package visitorpattern;

/*
 * 访问者中需要定义好访问具体元素的方法，一旦增加或减少具体的元素类，这个抽象类及其实现的子类都要进行修改
 * */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA eleA);
	public abstract void visitConcreteElementB(ConcreteElementB eleB);
}
