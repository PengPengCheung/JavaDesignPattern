package mementopattern;

public class Originator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public MemetoInterface createMemeto(){
		return new Memeto(state);
	}
	
	public void recoverMemeto(MemetoInterface memeto){
		this.setState(((Memeto)memeto).getState());
	}
	
	private class Memeto implements MemetoInterface{
		private String state;
		
		private String getState() {
			return state;
		}

		private void setState(String state) {
			this.state = state;
		}

		private Memeto(String state){
			this.state = state;
		}
		
		
	}
	
}
