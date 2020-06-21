package state.chain.of.responsibility;

public class MainClass {
	
	 private static PayDesk getChain(){
	        StandByState standByState = new StandByState();
	        PayDesk abroadPayDesk = new AbroadPayDesk("Abroad", standByState);
	        PayDesk countryPayDesk = new CountryPayDesk("Country", standByState);
	        PayDesk localPayDesk = new LocalPayDesk("Local", standByState);

	        Observer boy = new ObserverBoy("Deyvid");

	        abroadPayDesk.subscribe(boy);
	        localPayDesk.subscribe(boy);
	        countryPayDesk.subscribe(boy);

	        localPayDesk.setNextPayDesk(countryPayDesk);
	        countryPayDesk.setNextPayDesk(abroadPayDesk);
	        return localPayDesk;
	    }

	    public static void main(String[] args) {
	        PayDesk payDeskChain = getChain();

	        payDeskChain.receiveShipment(3, "Local");
	    }
	}

