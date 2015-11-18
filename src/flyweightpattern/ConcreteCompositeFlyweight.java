package flyweightpattern;

import java.util.HashMap;

/*
 * 非共享的对象角色
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
		//每次从HashMap缓存中取出对象，确保肯定存在于已有的map中，而且没有重新创建新的对象
		for(Object key: files.keySet()){
			fly = files.get(key);//返回一个具体的享元对象
			fly.Opertion(state);
		}
	}

}
