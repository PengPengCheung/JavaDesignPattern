package visitorpattern;

import java.util.ArrayList;
import java.util.List;

/*
 * 提供一个管理元素的类以及允许访问者访问元素的接口，在使用的时候就不用直接接触到具体的数据结构而采用这个类来进行统一管理
 * */
public class StructureObject {
	
	private List<Element> eleList = new ArrayList<Element>();
	
	public void attach(Element e){
		eleList.add(e);
	}
	
	public void detach(Element e){
		eleList.remove(e);
	}
	
	//指定允许访问的访问者
	public void accept(Visitor visitor){
		for(Element e:eleList){
			e.accept(visitor);
		}
	}
}
