/*Author: Patrick Waite
 * Description: Homework 3 
 * Class METCS 520 
 */

package cs520.hw3.part2;

public class Senator {
	
	private String 	name,
					party,
					state;
	private int yearsInOffice;
	
	public Senator() {}
	public Senator(String name) {
		this.name = name;
		this.getParty();
		this.getState();
		this.getYearsInOffice();
	}
	
	@Override
	public String toString() {
		return getName() + " (" + getParty() + ") from " + getState()
				+ " has been the senator for " + getYearsInOffice() + " years";
	}
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
		try {
			this.yearsInOffice = Integer.parseInt(years);
		}catch(NumberFormatException e) {
			this.yearsInOffice = -99;
		}		
	}

}
