package Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.print("There is no command\n");
	}

	@Override
	public void undo() {
		System.out.print("There is nothing undo\n");
	}

}
