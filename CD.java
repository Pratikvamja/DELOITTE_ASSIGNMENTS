
public class CD extends MediaItem {

	private String artist;
	private String genre;

	public CD(int id, String title, int copies, int runtime,String artist,String genre) {
		super(id, title, copies, runtime);
		this.artist=artist;
		this.genre=genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void print() {

		System.out.println("id="+this.getId()+"Title="+this.getTitle()+"copies="+this.getCopies()+"runtime="+this.getRuntime()+"artist"+this.getArtist()+"genre="+this.getGenre());

	}

}
