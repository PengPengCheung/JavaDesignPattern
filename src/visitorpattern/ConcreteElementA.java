package visitorpattern;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		//将访问者需要实现的方法封装，那么当访问的方法发生改变的时候，也不用改动具体元素类中的代码，而只需要改动访问者的访问方法即可
		visitor.visitConcreteElementA(this);
	}

}
