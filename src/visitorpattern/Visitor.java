package visitorpattern;

/*
 * ����������Ҫ����÷��ʾ���Ԫ�صķ�����һ�����ӻ���پ����Ԫ���࣬��������༰��ʵ�ֵ����඼Ҫ�����޸�
 * */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA eleA);
	public abstract void visitConcreteElementB(ConcreteElementB eleB);
}
