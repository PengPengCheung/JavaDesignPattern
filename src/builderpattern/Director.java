package builderpattern;

public class Director {
	Builder builder;
	
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	
	//在ConcreteBuilder里定义了建造部件的方法，但是没有被调用，并且不把建造部件的方法暴露在客户端里面
	//因此在这个方法里面调用Builder里的建造方法
	//可以按照一定的顺序安排，也可以在满足一些条件之后再进行对具体的产品部件进行建造
	public void construct(String head, String body, String foot){
		builder.buildHead(head);
		builder.buildBody(body);
		builder.buildFoot(foot);
	}

}
