package compositepattern;

/*
 * �������Component����������ΪҪ��Ҷ�ӽ���Composite������ͳһ
 * ���û�����Component���󣬾��޷�ͳһҶ�ӽڵ��Composite��㣬��Ҫ��������ͽ����ж���
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
