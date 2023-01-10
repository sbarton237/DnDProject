public class Stats {
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    public Stats(String a, String b, String c, String d, String e, String f) {
        if (a.equals("str") || a.equals("strength")) {strength = 15;}
            else if (b.equals("str") || b.equals("strength")) {strength = 14;}
            else if (c.equals("str") || c.equals("strength")) {strength = 13;}
            else if (d.equals("str") || d.equals("strength")) {strength = 12;}
            else if (e.equals("str") || e.equals("strength")) {strength = 10;}
            else if (f.equals("str") || f.equals("strength")) {strength = 8;}
        if (a.equals("dex") || a.equals("dexterity")) {dexterity = 15;}
            else if (b.equals("dex") || b.equals("dexterity")) {dexterity = 14;}
            else if (c.equals("dex") || c.equals("dexterity")) {dexterity = 13;}
            else if (d.equals("dex") || d.equals("dexterity")) {dexterity = 12;}
            else if (e.equals("dex") || e.equals("dexterity")) {dexterity = 10;}
            else if (f.equals("dex") || f.equals("dexterity")) {dexterity = 8;}
        if (a.equals("con") || a.equals("constitution")) {constitution = 15;}
            else if (b.equals("con") || b.equals("constitution")) {constitution = 14;}
            else if (c.equals("con") || c.equals("constitution")) {constitution = 13;}
            else if (d.equals("con") || d.equals("constitution")) {constitution = 12;}
            else if (e.equals("con") || e.equals("constitution")) {constitution = 10;}
            else if (f.equals("con") || f.equals("constitution")) {constitution = 8;}
        if (a.equals("int") || a.equals("intelligence")) {intelligence = 15;}
            else if (b.equals("int") || b.equals("intelligence")) {intelligence = 14;}
            else if (c.equals("int") || c.equals("intelligence")) {intelligence = 13;}
            else if (d.equals("int") || d.equals("intelligence")) {intelligence = 12;}
            else if (e.equals("int") || e.equals("intelligence")) {intelligence = 10;}
            else if (f.equals("int") || f.equals("intelligence")) {intelligence = 8;}
        if (a.equals("wis") || a.equals("wisdom")) {wisdom = 15;}
            else if (b.equals("wis") || b.equals("wisdom")) {wisdom = 14;}
            else if (c.equals("wis") || c.equals("wisdom")) {wisdom = 13;}
            else if (d.equals("wis") || d.equals("wisdom")) {wisdom = 12;}
            else if (e.equals("wis") || e.equals("wisdom")) {wisdom = 10;}
            else if (f.equals("wis") || f.equals("wisdom")) {wisdom = 8;}
        if (a.equals("cha") || a.equals("charisma")) {charisma = 15;}
            else if (b.equals("cha") || b.equals("charisma")) {charisma = 14;}
            else if (c.equals("cha") || c.equals("charisma")) {charisma = 13;}
            else if (d.equals("cha") || d.equals("charisma")) {charisma = 12;}
            else if (e.equals("cha") || e.equals("charisma")) {charisma = 10;}
            else if (f.equals("cha") || f.equals("charisma")) {charisma = 8;}
    }

    public Stats(int str, int dex, int con, int intel, int wis, int cha) {
        strength = str; dexterity = dex; constitution = con;
        intelligence = intel; wisdom = wis; charisma = cha;
    }

    public Stats() {
        strength = numberGen();
        dexterity = numberGen();
        constitution = numberGen();
        intelligence = numberGen();
        wisdom = numberGen();
        charisma = numberGen();
    }

    public static int numberGen() {
        int value;
        int a = (int) (Math.random() * 6) + 1;
        int b = (int) (Math.random() * 6) + 1;
        int c = (int) (Math.random() * 6) + 1;
        int d = (int) (Math.random() * 6) + 1;
        int min = a;
        if (b < min) { min = b; }
        if (c < min) { min = c; }
        if (d < min) { min = d; }
        if (a < min) { min = a; }
        value = a + b + c + d - min;
        return value;
    }
}
