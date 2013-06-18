package Command;

public class Light {

	private String location;

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.print(location + " light is on\n");
	};

	public void off() {
		System.out.print(location + " light is off\n");
	};
}
