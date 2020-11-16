/**
 * 
 */
package it.unibo.oop.lab.enum2;
import static it.unibo.oop.lab.enum2.Place.*;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	
	BASKET(INDOOR, 5, "Basketball"),
	VOLLEY(INDOOR, 6, "Volleyball"),
	TENNIS(OUTDOOR, 1, "Tennis"),
	BIKE(OUTDOOR, 1, "Bike"),
	F1(OUTDOOR, 1, "Formula1"),
	MOTOGP(OUTDOOR, 1, "MotoGP"),
	SOCCER(OUTDOOR, 11, "Soccer");

    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int teamMembers;
	private final String name;
	private final Place pl;

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.pl = place;
		this.teamMembers = noTeamMembers;
		this.name = actualName;
	}

    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	
	public final boolean isIndividualSport() {
		return this.teamMembers == 1;
	}
	
	public final boolean isIndoorSport() {
		return this.pl == INDOOR;
	}
	
	public final Place getPlace() {
		return this.pl;
	}
	
	public final String toString() {
		return "Sport: " + this.name() + "- Team members: " 
				+ this.teamMembers + "- Place: " + this.pl;
	}
	
}
