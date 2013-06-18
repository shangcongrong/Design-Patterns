package Command;

public class RemoteLoaderForMacro {

	public static void main(String[] args) {

		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		CeilingFan ceilingFan = new CeilingFan("Living Room");

		LightOnCommand lightOn = new LightOnCommand(light);
		TvOnCommand tvOn = new TvOnCommand(tv);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(
				ceilingFan);

		LightOffCommand lightOff = new LightOffCommand(light);
		TvOffCommand tvOff = new TvOffCommand(tv);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		CeilingFanOffCommand ceilingOff = new CeilingFanOffCommand(ceilingFan);

		Command[] partyOn = { lightOn, tvOn, stereoOn, ceilingFanHigh };
		Command[] partyOff = { lightOff, tvOff, stereoOff, ceilingOff };

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.print(remoteControl);
		System.out.print("--- Pushing Macro On ---");
		remoteControl.onButtonWasPushed(0);
		System.out.print("--- Pushing Macro Off ---");
		remoteControl.offButtonWasPushed(0);

	}
}
