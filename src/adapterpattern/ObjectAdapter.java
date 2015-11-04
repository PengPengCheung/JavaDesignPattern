package adapterpattern;

/*
 * 对象适配器，通过聚合和对象注入的方式对类进行适配，除了Source类之外也可以对其他的类进行适配
 * 对象注入的方式要通过构造函数注入而不能通过一般方法注入
 * */
public class ObjectAdapter implements Target {
	Source source;
	
//	public void setSource(Source source){
//		this.source = source;
//	}
	
	public ObjectAdapter(){
		this.source = new Source();
	}
	
	@Override
	public void targetMethod() {
		// TODO Auto-generated method stub
		source.sourceMethod();
	}

}
