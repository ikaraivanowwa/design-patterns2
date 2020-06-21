package state.chain.of.responsibility;

public class CountryPayDesk extends PayDesk {
	public CountryPayDesk(String name, State state){
        this.level = PayDesk.Country;
        this.setName(name);
        this.setState(state);
    }

    @Override
    protected void sendShipment(String shipment) {
        if(shipment.equals("Country")){
            PreparationState preparationState = new PreparationState();
            preparationState.applyState(this);
            System.out.println("CountryPayDesk gives the shipment to Deyvid!");
            this.notifyObservers();
        }
        else{
            StandByState standByState = new StandByState();
            standByState.applyState(this);
            System.out.println("CountryPayDesk can't gives this shipment to Deyvid!");
        }
    }

}
