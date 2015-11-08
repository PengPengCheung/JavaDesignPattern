package lod;

import java.util.ArrayList;
import java.util.List;

public class WrongExampleTeacher {
	/*
	 * 在类方法内引用了Girl这个实例，而实际上只有GroupLeader和WrongExampleTeacher是朋友关系
	 * 这样写就违反了迪米特法则，让一个类和另一个不是朋友的类进行耦合
	 * 正确见CorrectExampleTeacher
	 * */
	public void command(GroupLeader leader){
		List<Girl> girls = new ArrayList<Girl>();
		for(int i=0;i<20;i++){
			girls.add(new Girl());
		}
		leader.countGirls(girls);
	}
}
