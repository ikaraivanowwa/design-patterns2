package mediator;

public class UserFactory extends Users {

	public UserFactory(String name, Chat mediator) {
        super(name, mediator, "user");
        mediator.addUser(this);
    }

    @Override
    public void sendMsg(String message) {
        if(message.equalsIgnoreCase("addBot")){
            System.out.println(this.name + " added bot");
            mediator.sendMsg(this.name + " add bot", this);
            BotFactory bot = new BotFactory("Bot", mediator);
            mediator.addBot(bot);
        } else {
            System.out.println(this.name + " sends: " + message);
            mediator.sendMsg(message, this);
        }
    }

    @Override
    public void receiveMsg(String message) {
        System.out.println(this.name + " receives: " + message);
    }

}
