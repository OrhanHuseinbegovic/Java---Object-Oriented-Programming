package Generics;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        List<ClubMember> clubMembers = new ArrayList<ClubMember>();
        clubMembers.add(new ClubMember("mikael", 182));
        clubMembers.add(new ClubMember("matti", 187));
        clubMembers.add(new ClubMember("joel", 184));


        Collections.sort(clubMembers);

        ClubMember wanted = new ClubMember("Name", 180);
        int index = Collections.binarySearch(clubMembers, wanted);
        if (index >= 0) {
            System.out.println("A person who is 180 centimeters tall was found at index " + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        }

        wanted = new ClubMember("Name", 187);
        index = Collections.binarySearch(clubMembers, wanted);
        if (index >= 0) {
            System.out.println("A person who is 187 centimeters tall was found at index " + index);
            System.out.println("name: " + clubMembers.get(index).getName());
        }

    }
}
