package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public void addMember(String name){
        members.add(new Member(name));
    }

    public void connect(String name, String otherName){
        Member firstMember = findByName(name);
        Member secondMember = findByName(otherName);
        firstMember.connectMember(secondMember);
    }

    public List<String> bidirectionalConnections(){
        List<String> bidirectionalConnections = new ArrayList<>();
        for (Member searched: members){
            List<Member> connections = searched.getConnections();
            for (Member connected: connections) {
                List<Member> connectionBack = connected.getConnections();
                if (connectionBack.contains(searched)){
                    String text = searched.getName() + " - " + connected.getName();
                    bidirectionalConnections.add(text);
                }
            }
        }
        return bidirectionalConnections;
    }

    private Member findByName(String name){
        Member found = null;
        for (Member searched: members) {
            String searchedName = searched.getName();
            if(searchedName.equals(name)){
                found = searched;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        return "" + members;
    }
}
