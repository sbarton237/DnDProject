public class Proficiency {
    String[] armor;
    String[] weapons;
    String[] tools;

    public void setArmor(String[] armor) {
        System.arraycopy(armor, 0, this.armor, 0, armor.length);
    }

    public void setWeapons(String[] weapons) {
        System.arraycopy(weapons, 0, this.weapons, 0, weapons.length);
    }

    public void setTools(String[] tools) {
        System.arraycopy(tools, 0, this.tools, 0, tools.length);
    }
}
