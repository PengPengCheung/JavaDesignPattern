package lod;

public class LodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrongExampleTeacher wteacher = new WrongExampleTeacher();
		wteacher.command(new GroupLeader());
		
		CorrectExampleTeacher cteacher = new CorrectExampleTeacher();
		cteacher.command(new GroupLeader());
	}

}
