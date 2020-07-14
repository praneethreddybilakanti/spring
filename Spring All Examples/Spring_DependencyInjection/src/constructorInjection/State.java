package constructorInjection;

//File : State.java
public class State {
	private String stName;
	private String stCapital;

	public State(String stName, String stCapital) {
		this.stName = stName;
		this.stCapital = stCapital;
	}

	public void getState() {
		System.out.println(this.stName + ", " + this.stCapital);
	}

}
