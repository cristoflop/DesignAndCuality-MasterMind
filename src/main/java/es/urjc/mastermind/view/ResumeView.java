package es.urjc.mastermind.view;

import es.urjc.mastermind.Utils.SystemConsole;
import es.urjc.mastermind.model.Message;

public class ResumeView {

    public boolean resume() {
        SystemConsole console = SystemConsole.getInstance();
        String finishGame = console.readln(Message.Resume.getMsg());
        while (!finishGame.equals(Message.Yes_Message.getMsg()) && !finishGame.equals(Message.No_Message.getMsg())) {
            finishGame = console.readln(Message.Yes_No_Message_Format.getMsg());
        }
        return finishGame.equals(Message.Yes_Message.getMsg());
    }

}
