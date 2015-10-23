package builderpattern2;

public class builderpattern2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Director director = new Director();
//		User user = director.getUser(23, "pengpeng", "12345678");
		User user2 = new User.UserBuilder().Age(23).Name("pp").Phone("123456778").build();
		
		System.out.println("The Age of user is "+ user2.getAge());
		System.out.println("The Age of user is "+ user2.getName());
		System.out.println("The Age of user is "+ user2.getPhone());
	}

}
