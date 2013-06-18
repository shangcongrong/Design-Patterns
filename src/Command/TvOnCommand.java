package Command;

public class TvOnCommand implements Command {

	TV tv;

	public TvOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
		tv.setInputChannel();
		tv.setVolume(11);
	}

	@Override
	public void undo() {
		tv.off();
	}

}
