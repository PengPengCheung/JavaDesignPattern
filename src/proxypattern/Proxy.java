package proxypattern;

public class Proxy extends Subject{
	
	private RealObject realObject;
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(realObject == null){
			realObject = new RealObject();
		}
		realObject.request();
	}
	
}
