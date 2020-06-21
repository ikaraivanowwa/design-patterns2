package state.chain.of.responsibillity;

public interface State {

	    public void applyState(PayDesk payDesk);
	    public String getStateName();
	}

