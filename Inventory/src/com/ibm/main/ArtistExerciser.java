package com.ibm.main;
import java.util.*;
import com.ibm.Inventory.*;

public class ArtistExerciser {
    public static void main(String[] args) {
        Artist hotPlate = new Artist("HotPLate");
        SortedSet<String> instruments1 = new TreeSet<>();
        instruments1.addAll(Arrays.asList(new String[] {"Piano", "Clarinet", "Hurdy Gurdy", "Tuba"}));
        hotPlate.addMember("tom",instruments1);

        printMemberInstruments(hotPlate, "tom");
        
    }

    public static void printMemberInstruments(Artist artist, String memberName) {
		System.out.printf("%s band member %s plays: %n", artist.getName(), memberName);
		for (String instrument: artist.getInstruments(memberName)) {
			System.out.println("\t" + instrument);
		}
	}

}
