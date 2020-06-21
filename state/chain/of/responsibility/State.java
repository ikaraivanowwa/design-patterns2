package state.chain.of.responsibility;

public interface State {

	    public void applyState(PayDesk payDesk);
	    public String getStateName();
	}

