package state.chain.of.responsibillity;

public class LocalPayDesk extends PayDesk {
	
	public LocalPayDesk(String name, State state){
        this.level = PayDesk.Local;
        this.setName(name);
        this.setState(state);
    }

    @Override
    protected void sendShipment(String shipment) {
        if(shipment.equals("Local")){
            PreparationState preparationState = new PreparationState();
            preparationState.applyState(this);
            System.out.println("LocalPayDesk gives the shipment to Deyvid!");
            this.notifyObservers();
        }
        else{
            StandByState standByState = new StandByState();
            standByState.applyState(this);
            System.out.println("LocalPayDesk can't gives this shipment  to Deyvid!");
        }
    }

}
