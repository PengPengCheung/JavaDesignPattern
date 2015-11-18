package flyweightpattern;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();
	
	//���Ը���keyֵȡ�������д��ڵ�flyweight����������������½�������ӵ�������У��������ֱ�ӷ���
	//�����ڵ���ģʽ�͹���ģʽ�Ľ��
	public Flyweight getFlyweight(String key){
		Flyweight fly = flyweights.get(key);
		if(fly == null){
			fly = new ConcreteFlyweight(key);
			flyweights.put(key, fly);
		}
		
		return fly;
	}
}
