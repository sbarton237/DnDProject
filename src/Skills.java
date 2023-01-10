public class Skills {

    String[] classSkills;
    String[] raceSkills;
    String[] otherSkills;

    public void setClassSkills(String[] skills) {
        System.arraycopy(skills, 0, classSkills, 0, skills.length);
    }

    public void setRaceSkills(String[] skills) {
        System.arraycopy(skills, 0, raceSkills, 0, skills.length);
    }

    public void setOtherSkills(String[] skills) {
        System.arraycopy(skills, 0, otherSkills, 0, skills.length);
    }
}
