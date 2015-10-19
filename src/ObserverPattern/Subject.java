package ObserverPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 观察者模式可以用于发布订阅
 * 用一个List来保存和管理和主题相关联的观察者
 * 主要有增加观察者、删除观察者、通知观察者发生改变这三种方法
 * 在通知观察者的时候，观察者调用update方法，在实现了观察者接口的子类中进行具体实现
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
