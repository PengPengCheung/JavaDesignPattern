package lod;

import java.util.ArrayList;
import java.util.List;

public class WrongExampleTeacher {
	/*
	 * ���෽����������Girl���ʵ������ʵ����ֻ��GroupLeader��WrongExampleTeacher�����ѹ�ϵ
	 * ����д��Υ���˵����ط�����һ�������һ���������ѵ���������
	 * ��ȷ��CorrectExampleTeacher
	 * */
	public void command(GroupLeader leader){
		List<Girl> girls = new ArrayList<Girl>();
		for(int i=0;i<20;i++){
			girls.add(new Girl());
		}
		leader.countGirls(girls);
	}
}
