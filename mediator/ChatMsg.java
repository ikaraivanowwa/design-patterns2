package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMsg implements Chat {
	
	    private List<UserFactory> users;
	    private List<BotFactory> bots;

	    public ChatMsg() {
	        this.users = new ArrayList<>();
	        this.bots = new ArrayList<>();
	    }

	    @Override
	    public void sendMsg(String message, Users user) {
	        for(BotFactory bot: this.bots){
	            if(bot != user) {
	                bot.receiveMsg(message);
	            }
	            if(message.equalsIgnoreCase("cat")){
	                removeUser(user);
	                bot.sendMsg(message);
	                return;
	            }
	        }
	        for (UserFactory us : this.users) {
	            if (us != user) {
	                us.receiveMsg(message);
	            }
	        }
	    }

	    @Override
	    public void addUser(UserFactory user) {
	        this.users.add(user);
	    }

	    @Override
	    public void addBot(BotFactory bot){
	        this.bots.add(bot);
	    }

	    @Override
	    public void removeUser(Users user){
	        this.users.removeIf(t->t.name.equalsIgnoreCase(user.name));
	        System.out.println(user.name + " was been removed from chat");
	    }

}
