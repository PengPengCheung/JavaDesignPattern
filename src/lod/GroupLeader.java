package lod;

import java.util.ArrayList;
import java.util.List;

public class GroupLeader {
	private List<Girl> girls = new ArrayList<Girl>();//������ϵ
	
	/*
	 * ��Girl����������ϵ���������ѹ�ϵ��һ�֣�TeacherҪ��GirlͨѶҪͨ��GroupLeader������ֱ�Ӻ�GirlͨѶ
	 * */
	public void countGirls(List<Girl> girls){
		System.out.println("wteacher  girls.size(): "+girls.size());
	}
	
	public void countGirls(){
		for(int i=0;i<20;i++){
			this.girls.add(new Girl());
		}
		System.out.println("cteacher  girls.size(): "+this.girls.size());
	}
}
