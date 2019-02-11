package playlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    LinkedList<Song> pl = new LinkedList();
		
	    
		Album dmn = new Album("DAMN.");
		
		dmn.addSongToAlbum("HUMBLE.",2.57);
		dmn.addSongToAlbum("FEEL.", 3.34);
		dmn.addSongToAlbum("HUMBLE.",2.57);
		dmn.addSongToAlbum("LUST.", 5.07);
		
		Album dave = new Album("Cantarile lui David");
		dave.addSongToAlbum("Laude si Fericire", 3.28);
		dave.addSongToAlbum("Cu David, totul este mai bine!", 3.23);
		dave.addSongToAlbum("David si prietenii sai", 1.25);
		dave.addSongToAlbum("David e noul Mos Craciun", 2.0);
		dave.addSongToAlbum("DavidAventura, strigati <Ura!>", 3.28);
		
		dave.addSongtoPlaylist("DavidAventura, strigati <Ura!>", pl);
		dave.addSongtoPlaylist("Cu David, totul este mai bine!", pl);
		dave.addSongtoPlaylist("David e noul Mos Craciun", pl);
		
		
		printMenu();
		play(pl);
	}
private static void play(LinkedList playList) {
  Scanner scanner = new Scanner(System.in);
  boolean quit = false;
  boolean forward = true;
  ListIterator listIterator = playList.listIterator();
  if(playList.size() == 0) {
    System.out.println("No songs in playlist");
    return;
  } else {
  System.out.println("Now playing " + listIterator.next().toString());
  printMenu();
}
    while(!quit) {
        int action = scanner.nextInt();
        scanner.nextLine();

        switch(action) {
            case 0:
                System.out.println("Playlist complete.");
                quit = true;
                break;
            case 1:
                if(!forward) {
                    if(listIterator.hasNext()) {
                        listIterator.next();
                    }
                    forward = true;
                }
                if(listIterator.hasNext()) {
                    System.out.println("Now playing " + listIterator.next().toString());
                } else {
                    System.out.println("We have reached the end of the playlist");
                    forward = false;
                }
                break;

            case 2:
                if(forward) {
                    if(listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    forward = false;
                }
                if(listIterator.hasPrevious()) {
                    System.out.println("Now playing " + listIterator.previous().toString());
                } else {
                    System.out.println("We are at the start of the playlist");
                    forward = true;
                }
                break;
            case 3:
                if(forward) {
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now replaying " + listIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                } else {
                    if(listIterator.hasNext()) {
                        System.out.println("Now replaying " + listIterator.next().toString());
                        forward = true;
                    } else {
                        System.out.println("We have reached the end of the list");
                    }
                }
                break;
            case 4:
                printList(playList);
                break;
            case 5:
                printMenu();
                break;

            case 6:
                if(playList.size() >0) {
                    listIterator.remove();
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    }
                }
                break;

        }
    }
}

private static void printMenu() {
    System.out.println("Available actions:\npress");
    System.out.println("0 - to quit\n" +
            "1 - to play next song\n" +
            "2 - to play previous song\n" +
            "3 - to replay the current song\n" +
            "4 - list songs in the playlist\n" +
            "5 - print available actions.\n" +
            "6 - delete current song from playlist");

}


private static void printList(LinkedList<Song> playList) {
    Iterator<Song> iterator = playList.iterator();
    System.out.println("================================");
    while(iterator.hasNext()) {
        System.out.println(iterator.next());
    }
    System.out.println("================================");
}
	

}
