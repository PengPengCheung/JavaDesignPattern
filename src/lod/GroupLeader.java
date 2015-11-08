package lod;

import java.util.ArrayList;
import java.util.List;

public class GroupLeader {
	private List<Girl> girls = new ArrayList<Girl>();//关联关系
	
	/*
	 * 和Girl类是依赖关系，属于朋友关系的一种，Teacher要跟Girl通讯要通过GroupLeader而不能直接和Girl通讯
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
