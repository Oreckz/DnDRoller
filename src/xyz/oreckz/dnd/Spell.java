package xyz.oreckz.dnd;

public class Spell {
    private String spellName;
    private String saveType;
    private int saveRoll;

    public Spell() {}

    public Spell (String spellName, String saveType, int saveRoll) {
        super();
        this.spellName = spellName;
        this.saveType = saveType;
        this.saveRoll = saveRoll;
    }

    public String getSpellName(){
        final String sn = spellName;
        return sn;
    }

    public void setSpellName(String sn){
        this.spellName = sn;
    }

    public String getSaveType(){
        final String st = saveType;
        return st;
    }

    public void setSaveType(String st){
        this.saveType = st;
    }

    public int getSaveRoll(){
        final int sr = saveRoll;
        return sr;
    }

    public void setSaveRoll(int sr){
        this.saveRoll = sr;
    }
}
