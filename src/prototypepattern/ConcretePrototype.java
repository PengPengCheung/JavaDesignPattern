package prototypepattern;

import java.util.ArrayList;
/*
 * 若为浅复制，则类内引用的list类型不会被复制，只是复制concretetype类，对于复制出来的类的修改对原型类有影响
 * 若为深复制，则包括list在内，都会被复制，修改复制出来的类不会对原型类有影响
 * */
public class ConcretePrototype implements Cloneable{
	private String name;
	private ArrayList<String> list;
	
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		this.list.add(name);
	}

	public ConcretePrototype(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		list = new ArrayList<String>();
		this.list.add(name);
	}
	
	@Override
	public ConcretePrototype clone() {
		// TODO Auto-generated method stub
		ConcretePrototype copy = null;
		try {
			copy = (ConcretePrototype) super.clone();
			//若没有以下这句代码，则这个clone为浅复制;加上下面的代码，则这个clone为深复制
			copy.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return copy;
	}

}
