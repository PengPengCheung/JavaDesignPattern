package adapterpattern;

/*
 * ������������ͨ���ۺϺͶ���ע��ķ�ʽ����������䣬����Source��֮��Ҳ���Զ����������������
 * ����ע��ķ�ʽҪͨ�����캯��ע�������ͨ��һ�㷽��ע��
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
