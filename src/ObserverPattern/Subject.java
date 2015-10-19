package ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * �۲���ģʽ�������ڷ�������
 * ��һ��List������͹��������������Ĺ۲���
 * ��Ҫ�����ӹ۲��ߡ�ɾ���۲��ߡ�֪ͨ�۲��߷����ı������ַ���
 * ��֪ͨ�۲��ߵ�ʱ�򣬹۲��ߵ���update��������ʵ���˹۲��߽ӿڵ������н��о���ʵ��
 * */
public abstract class Subject {
	List<Observerable> observers = new ArrayList<Observerable>();
	
//	public abstract void Attach(Observerable observers);
//	
//	public abstract void Detach(Observerable observers);
//	
//	public abstract void Notify();
	
	public void Attach(Observerable observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	public void Detach(Observerable observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	public void Notify() {
		// TODO Auto-generated method stub
		if(!observers.isEmpty()){
			Iterator<Observerable> it =  observers.iterator();
			while(it.hasNext()){
				Observerable ob = (Observerable) it.next();
				ob.Update();
			}
		}
	}
}
