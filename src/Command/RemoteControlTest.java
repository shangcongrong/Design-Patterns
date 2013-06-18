package Command;

public class RemoteControlTest {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		// GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(
				ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(
				ceilingFan);

		// GarageDoorUpCommand garageDoorUp = new
		// GarageDoorUpCommand(garageDoor);
		// GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(
		// garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingLightOn, livingLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		System.out.print(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);

		// Light light = new Light();
		// LightOnCommand lightOn = new LightOnCommand(light);
		// GarageDoor garageDoor = new GarageDoor();
		// GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

		// remote.setCommand(lightOn);
		// remote.btnWasPressed();
		// remote.setCommand(garageOpen);
		// remote.btnWasPressed();

	}

}
