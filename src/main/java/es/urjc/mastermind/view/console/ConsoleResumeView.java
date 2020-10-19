package es.urjc.mastermind.view.console;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Message;

public class ConsoleResumeView {

    public boolean resume() {
        SystemConsole console = SystemConsole.getInstance();
        String finishGame = console.readln(Message.Resume.getMsg());
        while (!finishGame.equals(Message.Yes_Message.getMsg()) && !finishGame.equals(Message.No_Message.getMsg())) {
            finishGame = console.readln(Message.Yes_No_Message_Format.getMsg());
        }
        return finishGame.equals(Message.Yes_Message.getMsg());
    }

}
