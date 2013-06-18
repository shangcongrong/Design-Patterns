package Command;

public class RemoteLoaderForUndo {

	public static void main(String[] args) {

		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		Light livingRoomLight = new Light("Living Room");

		LightOnCommand livingLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingLightOff = new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, livingLightOn, livingLightOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.print(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.print(remoteControl);
		remoteControl.undoButtonWasPushed();

	}

}
