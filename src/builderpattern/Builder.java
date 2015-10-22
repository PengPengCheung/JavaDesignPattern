package builderpattern;

public abstract class Builder {
	public abstract void buildHead(String head);
	public abstract void buildBody(String body);
	public abstract void buildFoot(String foot);
	public abstract ConcreteProduct getProduct();
}
