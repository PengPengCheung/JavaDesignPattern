package flyweightpattern;

import java.util.Hashtable;

public class FlyweightFactory {
	private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();
	
	//尝试根据key值取出缓存中存在的flyweight对象，如果不存在则新建，并添加到缓存表中，如存在则直接返回
	//类似于单例模式和工厂模式的结合
	public Flyweight getFlyweight(String key){
		Flyweight fly = flyweights.get(key);
		if(fly == null){
			fly = new ConcreteFlyweight(key);
			flyweights.put(key, fly);
		}
		
		return fly;
	}
}
