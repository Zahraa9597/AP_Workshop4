import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VotingSystem system = new VotingSystem();

        // Create some voting activities
        Voting singleChoiceVoting = new Voting();
        Voting multiChoiceVoting = new Voting();

        singleChoiceVoting.vote(new Person("A", "B"));
        singleChoiceVoting.vote(new Person("C", "D"));
        multiChoiceVoting.vote(new Person("E", "F"));
        multiChoiceVoting.vote(new Person("G", "H"));

        // Print the results
        system.printResults();
    }
    }
}



