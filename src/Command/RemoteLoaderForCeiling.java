package Command;

public class RemoteLoaderForCeiling {

	public static void main(String[] args) {

		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(
				ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(
				ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(
				ceilingFan);

		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.print(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		System.out.print(remoteControl);
		remoteControl.undoButtonWasPushed();

	}

}
