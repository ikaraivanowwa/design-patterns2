package mediator;

public interface Chat {
	 void sendMsg(String message, Users user);
	    void addUser(UserFactory user);
	    void addBot(BotFactory bot);
	    void removeUser(Users user);

}
