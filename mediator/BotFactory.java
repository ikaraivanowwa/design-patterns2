package mediator;

public class BotFactory extends Users {
	 public BotFactory(String name, Chat mediator) {
	        super(name, mediator, "bot");
	        mediator.addBot(this);
	    }

	    @Override
	    public void sendMsg(String message) {
	        if(message.equalsIgnoreCase("cat")){
	            mediator.sendMsg("cat is a forbidden word", this);
	        }
	    }

	    @Override
	    public void receiveMsg(String message) {
	        System.out.println(this.name + " checked the message");
	    }

}
