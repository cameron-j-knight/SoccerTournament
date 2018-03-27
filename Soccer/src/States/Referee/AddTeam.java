package States.Referee;

import States.Role;
import States.StateType;

public class AddTeam extends States.State {
    final String pathAppend = "AddTeam/";

    public AddTeam(Role role) {
        super(role);
    }

    @Override
    public StateType exec(StringBuilder modifiableData) {
        String input;
        while (true) {
            //temporarily using to track state path as example
            modifiableData.append(pathAppend);

            System.out.println("CreateUser: ");
            input = System.console().readLine();


            //potentially do some work or actions:
            //todo

            //determine appropriate return type:
            if (input.equals("")) return null;
            else return StateType.LOGGEDIN;
        }
    }

    @Override
    public void undoDataWrite(StringBuilder modifiableData) {
        modifiableData.reverse().delete(0, pathAppend.length()).reverse();
    }

    @Override
    public void help() {

    }
}
