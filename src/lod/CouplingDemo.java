package lod;

public class CouplingDemo {
	private Girl association = new Girl();//������ϵ������ private Girl association; Ҳ�ǹ�����ϵ
	private Girl[] aggregation;//�ۺϹ�ϵ
	private Girl composition;//��Ϲ�ϵ
	
	/*
	 * ��Ϲ�ϵ���ڶ���ʵ������ʱ��Ҳ���ž�����Ϲ�ϵ����Ҳ����ʵ����
	 * */
	public CouplingDemo(Girl composition){
		this.composition = composition;
	}
	
	/*
	 * ������ϵ��
	 * ����������ϵ������Ϊ��������ڲ������룬Girl�������Ϊ������ϵ
	 * */
	public void dependencyMethod(Girl girl){
		System.out.println("����������ϵ�ķ���");
	}
	
	/*
	 * �ۺϹ�ϵ��
	 * ��set������ʵ�־ۺϹ�ϵ������Ϳɷ���
	 * */
	public void setAggregation(Girl[] aggregation){
		this.aggregation = aggregation;
	}
	
	
}
