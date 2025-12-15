package ScenarioBased;

import java.util.HashSet;
import java.util.Set;


//Online Voting System – Prevent Duplicate Votes using Set

public class OnlineVotingSystem {
    public static void main(String[] args) {

        Set<String> votedUsers = new HashSet<>();

        vote(votedUsers, "USER101");
        vote(votedUsers, "USER102");
        vote(votedUsers, "USER101");
        vote(votedUsers, "USER103");
        vote(votedUsers, "USER102");

        System.out.println("Total valid votes: " + votedUsers.size());
    }

    static void vote(Set<String> votedUsers, String userId) {
        if (votedUsers.add(userId)) {
            System.out.println(userId + " vote accepted");
        } else {
            System.out.println(userId + " duplicate vote rejected");
        }
    }
}
