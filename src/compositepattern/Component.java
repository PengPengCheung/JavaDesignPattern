package compositepattern;

/*
 * 出现这个Component抽象类是因为要对叶子结点和Composite结点进行统一
 * 如果没有这个Component对象，就无法统一叶子节点和Composite结点，需要对类的类型进行判断了
 * */

public abstract class Component {
	protected String name;
	
	public Component(String name){
		this.name = name;
	}
	
	public abstract void add(Component c);
	
	public abstract void remove(Component c);
	
	public abstract void display(int depth);
}
