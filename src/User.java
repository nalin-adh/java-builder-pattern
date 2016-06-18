public class User {

	private final String firstName;
	private final String lastName;
	private final String address;
	private final String state;
	private final String country;

	public User(UserBuilder userBuilder) {
		this.firstName = userBuilder.firstName;
		this.lastName = userBuilder.lastName;
		this.address = userBuilder.address;
		this.state = userBuilder.state;
		this.country = userBuilder.country;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", state=" + state + ", country="
				+ country + "]";
	}
	
	public static class UserBuilder{
		private final String firstName; //required property
		private final String lastName; //required property
		private String address; //optional property
		private String state; //optional property
		private String country; //optional property
		
		public UserBuilder(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder address(String address){
			this.address = address;
			return this;
		}
		
		public UserBuilder state(String state){
			this.state = state;
			return this;
		}
		
		public UserBuilder country(String country){
			this.country = country;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
	}

}
