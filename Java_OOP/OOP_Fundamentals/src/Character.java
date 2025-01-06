public class Character {
    String name, dialog;
    int hp, mp, lvl;

    // Constructor
    public Character(String characterName, String characterDialog, int healthPoints, int magicPoints, int level) {
        this.name = characterName;
        this.dialog = characterDialog;
        this.hp = healthPoints;
        this.mp = magicPoints;
        this.lvl = level;
    }

    void introduce() {
        System.out.println(name + ": " + dialog);
    }

    void talkTo(String firstName)
    {
        System.out.println(name + ": Hello " + firstName );
    }
     void talkToCharacter(Character x)
    {
        System.out.println(name + ": Hello " + x.name );
    }

}
