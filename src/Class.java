public class Class {
    String classType;
    int hitPoints;
    int classLevel;
    String savingThrowBonus1;
    String savingThrowBonus2;
    Proficiency proficiencies;


    public Class(String name) {
        classType = name.toLowerCase();
        classLevel = 1;
    }

    public Class() {
        classType = ""; classLevel = 1;
    }

    public void changeClass(String newClass) {
        classType = newClass;
        classLevel = 1;
    }

    public void setTraits() {
        String type = this.classType.toLowerCase();
        if (type.equals("barbarian")) {
            hitPoints = 12;
            savingThrowBonus1 = "str";
            savingThrowBonus2 = "con";
            proficiencies.setArmor(new String[] {"light armor", "medium armor", "shields"});
            proficiencies.setWeapons(new String[] {"simple weapons", "martial weapons"});

        }
        else if (type.equals("bard")) {
            hitPoints = 8;
            savingThrowBonus1 = "dex";
            savingThrowBonus2 = "cha";
        }
        else if (type.equals("cleric")) {
            hitPoints = 8;
            savingThrowBonus1 = "wis";
            savingThrowBonus2 = "cha";
        }
        else if (type.equals("druid")) {
            hitPoints = 8;
            savingThrowBonus1 = "int";
            savingThrowBonus2 = "wis";
        }
        else if (type.equals("fighter")) {
            hitPoints = 10;
            savingThrowBonus1 = "str";
            savingThrowBonus2 = "con";
        }
        else if (type.equals("monk")) {
            hitPoints = 8;
            savingThrowBonus1 = "str";
            savingThrowBonus2 = "dex";
        }
        else if (type.equals("paladin")) {
            hitPoints = 10;
            savingThrowBonus1 = "wis";
            savingThrowBonus2 = "cha";
        }
        else if (type.equals("ranger")) {
            hitPoints = 10;
            savingThrowBonus1 = "str";
            savingThrowBonus2 = "dex";
        }
        else if (type.equals("rogue")) {
            hitPoints = 8;
            savingThrowBonus1 = "dex";
            savingThrowBonus2 = "int";
        }
        else if (type.equals("sorcerer")) {
            hitPoints = 6;
            savingThrowBonus1 = "con";
            savingThrowBonus2 = "cha";
        }
        else if (type.equals("warlock")) {
            hitPoints = 8;
            savingThrowBonus1 = "wis";
            savingThrowBonus2 = "cha";
        }
        else if (type.equals("wizard")) {
            hitPoints = 6;
            savingThrowBonus1 = "wis";
            savingThrowBonus2 = "int";
        }
        else {
            System.out.println("Invalid Class, try changing to a valid class");
        }
    }
}
