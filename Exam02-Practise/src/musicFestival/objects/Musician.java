package musicFestival.objects;

public class Musician {
    private String name;
    private boolean isVocal;
    private String instrument;

    boolean isVocal() {
	return isVocal;
    }

    Musician(String name, String instrument, boolean isVocal) {
	this.name = name;
	this.instrument = instrument;
	this.isVocal = isVocal;
    }

    @Override
    public String toString() {
	StringBuilder musicianInfo = new StringBuilder();
	musicianInfo.append("\t\tMusician Name: " + this.name);
	musicianInfo.append("\n");
	musicianInfo.append("\t\tIs vocal: " + this.isVocal);
	musicianInfo.append("\n");
	musicianInfo.append("\t\tMusician instument: " + this.instrument);
	musicianInfo.append("\n");
	return musicianInfo.toString();
    }

    public void greetPeople() {
	System.out.print(this.name + " - ");
	if (isVocal) {
	    System.out.println("Vocal");
	} else {
	    System.out.println("Plays at " + this.instrument);
	}
    }
}
