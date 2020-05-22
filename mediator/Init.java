package mediator;

public class Init {
	public static void main(String[] args) {
        Chat mediator = new ChatMsg();
        Users user1 = new UserFactory("Petq", mediator);
        Users user2 = new UserFactory("Marian", mediator);
        Users user3 = new UserFactory("Ivan", mediator);

        user1.sendMsg("Hello guys");
        user2.sendMsg("Hello");
        user2.sendMsg("addBot");
        user3.sendMsg("cat");
	}

}
