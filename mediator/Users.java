package mediator;

public abstract class Users {
	protected String name;
    protected String type;
    protected Chat mediator;

    public Users(String name, Chat mediator, String type){
        this.name = name;
        this.mediator = mediator;
        this.type = type;
    }

    public abstract void sendMsg(String message);
    public abstract void receiveMsg(String message);

}
