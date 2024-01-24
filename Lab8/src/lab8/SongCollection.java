package lab8;

// You are NOT allowed to add any "import" statement other than 
// the ones already in the starter files. 
import java.util.*;

public class SongCollection {
	
	
	// TODO: Your implementation starts here
	/*  Your implementation starts here
	 * Recall that :
	 * 1. No System.out.println statements should appear here.
	 * 	  Instead, you need to return the result.
	 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
	 *    Instead, refer to the input parameters of this method.   
	 */
	
	private String Name = "";
	private ArrayList<Song> songCollection = new ArrayList<Song>();
	
	public SongCollection(String collectionName)
	{
		this.Name = collectionName;
	}

	public SongCollection(SongCollection collection1) {
		this.Name = collection1.getListName();
		
		for (int i = 0; i < collection1.getListofSongs().size(); i++)
		{
			Song songname = collection1.getListofSongs().get(i);
			this.songCollection.add(songname);
		}
	}

	public String getListName() {
		
		return this.Name;
	}

	public List<Song> getListofSongs() {
		
		return this.songCollection;
	}

	public void setListName(String names) {
		
		this.Name = names;
	}

	public void addSongs(List<Song> alist) {
		for(int i =0; i < alist.size(); i++)
		{
			Song song = alist.get(i);
			
			this.songCollection.add(song);
		}
		
	}

	public void removeSong(Song s) {
		this.songCollection.remove(s);
	}

	public boolean contains(Song s) {
	
		return this.songCollection.contains(s);
	}

	public boolean inSongCollection(String a) {
		
		boolean artistSong = false;
		
		for (int i = 0; i < this.songCollection.size(); i++)
		{
			if(this.songCollection.get(i).getSongArtist().equals(a))
					{
					artistSong = true;
				break;
			
				
			}
		}
		return artistSong;
	}

	public ArrayList<Song> getSongsforArtist(String a) {
		ArrayList<Song> SongsByArtists = new ArrayList<Song>();
			
		
		for (int i = 0; i < this.songCollection.size();i++)
		{
			Song song = this.songCollection.get(i);
			if(song.getSongArtist().equals(a))
			{
				SongsByArtists.add(song);
			}
		}
			
		return SongsByArtists;
	}

	public String totalListeningTime() {
		int playlistinSec = 0;
		String listeningTime = "";
		
		for (int i = 0; i < this.songCollection.size();i++)
		{
			Song song = this.songCollection.get(i);
			playlistinSec += song.getSongLength();
		}
		
		double minutes = playlistinSec/60;
		double secsRemaining = playlistinSec%60;
		
		double hours = Math.floor(minutes/60);
		double minRemaining = minutes%60;
		
		String formatMins = (minRemaining < 10) ? String.format("0%.0f", minRemaining) : String.format("%.0f", minRemaining);
		String formatSecs = (secsRemaining < 10)? String.format("0%.0f", secsRemaining) : String.format("%.0f", secsRemaining);
		
		listeningTime = String.format("Total Listening Time: %.0f:%s:%s", hours, formatMins, formatSecs );
		return listeningTime;
	}


}
