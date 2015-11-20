package visitorpattern;

import java.util.ArrayList;
import java.util.List;

/*
 * �ṩһ������Ԫ�ص����Լ���������߷���Ԫ�صĽӿڣ���ʹ�õ�ʱ��Ͳ���ֱ�ӽӴ�����������ݽṹ�����������������ͳһ����
 * */
public class StructureObject {
	
	private List<Element> eleList = new ArrayList<Element>();
	
	public void attach(Element e){
		eleList.add(e);
	}
	
	public void detach(Element e){
		eleList.remove(e);
	}
	
	//ָ��������ʵķ�����
	public void accept(Visitor visitor){
		for(Element e:eleList){
			e.accept(visitor);
		}
	}
}
