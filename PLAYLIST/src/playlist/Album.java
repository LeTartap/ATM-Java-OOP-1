package playlist;

import java.util.*;

public class Album {
	public Album(String name) {
		this.name = name;
	}

	String name;
	ArrayList<Song> albumList = new ArrayList();

	void addSongtoPlaylist(String title, LinkedList pl) {
		
		if(findSong(title)!=null)
		{
			pl.add(title);			
		}
		else
			System.out.println("Nu exista meleodia "+title+" in playlist! ");

	}
		
	Song findSong(String title)
	{
		for(Song s:this.albumList)
		{
			if(s.name==title) {
				return s;
			}
		}
		return null;
	}

	void addSongToAlbum(String s, double d) {
		Song song = new Song(s, d);
		albumList.add(song);
	}

}