package cs520.hw5;

public class Senator {
	
	private String 	name,
					party,
					state;
	private int yearsInOffice;
	
	//single arg name construtor used to build each entry.
	public Senator(String name) {
		this.name = name;
		this.getParty();
		this.getState();
		this.getYearsInOffice();
	}
	
	//override the toString() class to output each line of data
	@Override
	public String toString() {
		return getName() + " (" + getParty() + ") from " + getState()
				+ " has been the senator for " + getYearsInOffice() + " years";
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getYearsInOffice() {
		return yearsInOffice;
	}
	public void setYearsInOffice(String years) {
		//if value of years is not an integer and can not be parsed it is set to -99
		try {
			this.yearsInOffice = Integer.parseInt(years);
		}catch(NumberFormatException e) {
			this.yearsInOffice = -99;
		}		
	}
}
