
public abstract class Item {

	private int id;
	private String title;
	private int copies;
	
	public Item(int id,String title,int copies)
	{
		this.id=id;
		this.title=title;
		this.copies=copies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", copies=" + copies + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (copies != other.copies)
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public abstract void print();
	public void checkIn()
	{
		System.out.println("welcome to library");

	}
	public void checkOut()
	{
		System.out.println("thank you for visiting");

	}
	
	
}
