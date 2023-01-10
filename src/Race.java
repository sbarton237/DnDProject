public class Race {
    String raceType;

    public Race(String race) {
        raceType = race.toLowerCase();
    }

    public Race() {
        raceType = "";
    }

    public void setTraits() {
        String type = this.raceType;
        if (type.equals("")) {
        }
    }
}
