package adapterpattern;

public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Target classTarget = new ClassAdapter();
		System.out.println("classTarget:");
		classTarget.targetMethod();//�������������еķ��������Ե���Source���еķ�����ʵ������
		Target objectTarget = new ObjectAdapter();//����ObjectAdapter��ʱ��ͬʱ�ڹ��췽���д�����Sourceʵ��
		System.out.println("objectTarget:");
		objectTarget.targetMethod();//���ö����������ķ��������Ե���source���еķ���
	}

}
