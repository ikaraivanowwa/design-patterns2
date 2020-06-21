package state.chain.of.responsibillity;

public class AbroadPayDesk extends PayDesk {
	
	 public AbroadPayDesk(String name, State state){
	        this.level = PayDesk.Abroad;
	        this.setName(name);
	        this.setState(state);
	    }

	    @Override
	    protected void sendShipment(String shipment) {
	        if(shipment.equals("Abroad")){
	            PreparationState preparationState = new PreparationState();
	            preparationState.applyState(this);
	            System.out.println("AbroadPayDesk gives the shipment to Deyvid!");
	            this.notifyObservers();
	        }
	        else{
	            StandByState standByState = new StandByState();
	            standByState.applyState(this);
	            System.out.println("AbroadPayDesk can't gives this shipment to Deyvid!");
	        }
	    }

}
