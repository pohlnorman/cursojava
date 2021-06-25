package com.hashmatique;
import java.util.HashMap;
import java.util.Set;

public class ListaCanciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> track = new HashMap<String, String>();
		track.put("want you bad", "Want you to be bad, bad, bad, bad, bad");
		track.put("nitro", "You’ll live like there’s no tomorrow-ain't gonna waste this life");
		track.put("pretty fly", "Give it to me baby uh huh uh huh");
		track.put("all i want", "I could die a happy man I'm sure");
		
		Set<String> Keys = track.keySet();
		for(String key : Keys) {
            System.out.println(key);
            System.out.println(track.get(key));    
        }
	}

}
