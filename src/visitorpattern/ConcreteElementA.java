package visitorpattern;

public class ConcreteElementA extends Element {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		//����������Ҫʵ�ֵķ�����װ����ô�����ʵķ��������ı��ʱ��Ҳ���øĶ�����Ԫ�����еĴ��룬��ֻ��Ҫ�Ķ������ߵķ��ʷ�������
		visitor.visitConcreteElementA(this);
	}

}
