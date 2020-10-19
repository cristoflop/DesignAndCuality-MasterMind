package es.urjc.mastermind.view.console;

import es.urjc.mastermind.Utils.Constant;
import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Color;
import es.urjc.mastermind.model.Message;

public class ConsoleProposeView {

    public String proposeCombination() {
        SystemConsole console = SystemConsole.getInstance();
        boolean validProposal = false;
        String input = "";
        while (!validProposal) {
            input = console.readln(Message.Propose.getMsg());
            validProposal = this.validateCombination(input);
        }
        return input;
    }

    private boolean validateCombination(String input) {
        SystemConsole console = SystemConsole.getInstance();
        boolean ok = true;
        if (input.length() != Constant.COMBINATION_LENGTH) {
            console.println(Message.Wrong_Length.getMsg());
            ok = false;
        } else {
            if (!validateCharacters(input)) {
                ok = false;
            }
        }
        return ok;
    }

    private boolean validateCharacters(String input) {
        SystemConsole console = SystemConsole.getInstance();
        boolean ok = true;
        char[] chars = input.toCharArray();
        int i = 0;
        while (i < chars.length && ok) {
            if (Color.parse(chars[i]) == Color.Unknown) {
                ok = false;
                console.println(Message.Wrong_Colors.getMsg());
            }
            i++;
        }
        return ok;
    }

}
