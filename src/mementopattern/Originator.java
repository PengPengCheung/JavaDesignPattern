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
	
	//Memeto����������Ժͷ����������private�����ֻ�������ڲ�ʹ��
	//�޷�������ʵ�������Memeto�࣬��֤�������ݲ�����й
	//������Ҫ���ݵ�ʱ�򣬽����������ݴ���CareTaker���б��ݣ���Ҫ��ʱ���ٴ�CareTaker��ȡ��
	//�����Originator�ⲿҪ��ʹ������࣬��ͨ��ʵ�ֵ�MemetoInterface�ӿ������ⲿʹ��Memeto�����
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
