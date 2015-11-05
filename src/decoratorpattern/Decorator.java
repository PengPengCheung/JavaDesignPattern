package decoratorpattern;

/*
 * װ���������Ҫ�̳�Component�࣬Ҳ��Ҫ���Component��
 * �̳���Ϊ�˿���һֱ���뱻װ�εĶ����������ע��Component�ಢ����һֱ��װ�ζ�������¹���
 * ע��Component����Ϊ�˿��Ե���Component�����Operation������ʵ������ʱ��̬
 * */
public abstract class Decorator extends Component{//�ؼ��̳У�������̳�Component��Decorator��������޷���setComponentһ��һ���װ����
	
	private Component component;
	
	//�ɻ��ɹ��췽��ע��Component��
	//��Component��Ķ�������Ǳ�װ���˺ܶ��Ķ���A��Ȼ����ע���������A��decorator����operation�����е�������Operation����
	public void setComponent(Component component){
		this.component = component;
	}
	
	public Component getComponent(){
		return this.component;
	}
	
	//��д��operation����Ҳ�������������������������ڲ�Ҫ��component��operation����
	//�˷�������������δʵ�ֵ�Operation�����н��е��ã�ʵ�����ǵ����˴����component�����operation����
	public void decorate() {
		// TODO Auto-generated method stub
		if(component!=null){
			component.Operation();
		}
	}

}
