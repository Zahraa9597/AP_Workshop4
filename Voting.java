import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Voting {
    private int type;//تک رأی و چند رأی ( 0 به معنای تک رأی و 1 به معنای چندرأی)
    private String question; // پرسش رأیگیری
    private HashMap<String, HashSet<Vote>> choices;
    private boolean isAnonymous;
    private ArrayList<Person> voters;

    public Voting(int type, HashMap<String, HashSet<Vote>> choices, String question, boolean isAnonymous, ArrayList<Person> voters) {
       this.type = type;
       this.question = question;
       this.choices = choices;
       this.isAnonymous = isAnonymous;
       this.voters = voters;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public HashMap<String, HashSet<Vote>> getChoices() {
        return choices;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Voting voting = (Voting) o;
        return type == voting.type && isAnonymous == voting.isAnonymous && Objects.equals(question, voting.question) && Objects.equals(choices, voting.choices) && Objects.equals(voters, voting.voters);
    }
}
