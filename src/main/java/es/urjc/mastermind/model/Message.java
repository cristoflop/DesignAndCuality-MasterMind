package es.urjc.mastermind.model;

public enum Message {

    Title("---- MASTERMIND ----"),
    Resume("Do you want to resume? (y/n): "),
    Yes_Message("y"),
    No_Message("n"),
    Yes_No_Message_Format("Please write 'Y' or 'N': "),
    Wrong_Colors("Wrong colors, they must be: rbygop"),
    Wrong_Length("Wrong proposed combination length"),
    Propose("Propose combination: "),
    XXX("xxxx"),
    You_Won("You have won"),
    You_Lost("You have lost");

    private String msg;

    Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}
