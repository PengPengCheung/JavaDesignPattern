package flyweightpattern;

import java.util.HashMap;

/*
 * �ǹ���Ķ����ɫ
 * */
public class ConcreteCompositeFlyweight extends Flyweight {
	private HashMap<String, Flyweight> files = new HashMap<String, Flyweight>();
	
	public void add(String key, Flyweight fly){
		files.put(key, fly);
	}
	
	@Override
	public void Opertion(String state) {
		// TODO Auto-generated method stub
		Flyweight fly = null;
		//ÿ�δ�HashMap������ȡ������ȷ���϶����������е�map�У�����û�����´����µĶ���
		for(Object key: files.keySet()){
			fly = files.get(key);//����һ���������Ԫ����
			fly.Opertion(state);
		}
	}

}
