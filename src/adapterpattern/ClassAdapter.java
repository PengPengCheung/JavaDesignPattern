package adapterpattern;

/*
 * ����������ֻΪ����Source�������������Ϊֻ�ܵ��ؼ̳У�������������û�����������������
 * */
public class ClassAdapter extends Source implements Target {
	
	@Override
	public void targetMethod() {
		// TODO Auto-generated method stub
		sourceMethod();
	}

}
