package callbackmechanism;

public class CallbackResolver {
	ICallBack callback;
	public void setCallback(ICallBack callback){
		this.callback = callback;
		execute();
		System.out.println("setCallback!");
//		this.callback.executeCallback();
	}
	
	public void execute(){
		callback.executeCallback();
	}
	
}
