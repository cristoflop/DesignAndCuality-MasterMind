package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.distributed.LogicProxy;

public class ConsoleMasterMindClient extends ConsoleMastermind {

    private LogicProxy logicProxy;

    protected Logic createLogic() {
        this.logicProxy = new LogicProxy();
        return this.logicProxy;
    }

    @Override
    protected void play() {
        super.play();
        this.logicProxy.close();
    }

    public static void main(String[] args) {
        new ConsoleMasterMindClient().play();
    }

}
