package builderpattern2;

public class Director {
	public User getUser(int age, String name, String phone){
		return new User.UserBuilder().Age(age).Name(name).Phone(phone).build();
	}
}
