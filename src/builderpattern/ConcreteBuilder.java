package builderpattern;

public class ConcreteBuilder extends Builder {
	ConcreteProduct product;
	
	public ConcreteBuilder(){
		this.product = new ConcreteProduct();
	}

	@Override
	public void buildHead(String head) {
		// TODO Auto-generated method stub
		product.setHead(head);
		
	}

	@Override
	public void buildBody(String body) {
		// TODO Auto-generated method stub
		product.setBody(body);
	}

	@Override
	public void buildFoot(String foot) {
		// TODO Auto-generated method stub
		product.setFoot(foot);
	}

	@Override
	public ConcreteProduct getProduct() {
		// TODO Auto-generated method stub
		return product;
	}

}
