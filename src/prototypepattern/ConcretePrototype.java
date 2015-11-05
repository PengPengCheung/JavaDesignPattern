package prototypepattern;

import java.util.ArrayList;
/*
 * ��Ϊǳ���ƣ����������õ�list���Ͳ��ᱻ���ƣ�ֻ�Ǹ���concretetype�࣬���ڸ��Ƴ���������޸Ķ�ԭ������Ӱ��
 * ��Ϊ��ƣ������list���ڣ����ᱻ���ƣ��޸ĸ��Ƴ������಻���ԭ������Ӱ��
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
			//��û�����������룬�����cloneΪǳ����;��������Ĵ��룬�����cloneΪ���
			copy.list = (ArrayList<String>) this.list.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return copy;
	}

}
