import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Voting {
    private int type;//تک رأی و چند رأی ( 0 به معنای تک رأی و 1 به معنای چندرأی)
    private String question; // پرسش رأیگیری
    private HashMap<String, HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;
}
