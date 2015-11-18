package flyweightpattern;

/*
 * 共享的享元对象角色
 * */
public class ConcreteFlyweight extends Flyweight {
	private String inState;
	
	public ConcreteFlyweight(String inState){
		this.inState = inState;
	}
	
	@Override
	public void Opertion(String state) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteFlyweight: "+ state);
		System.out.println("ConcreteFlyweight's inState: "+ this.inState);
	}

}
