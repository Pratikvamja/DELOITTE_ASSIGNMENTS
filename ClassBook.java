
public class ClassBook extends WrittenItem {

	public ClassBook(int id, String title, int copies, String author) {
		super(id, title, copies, author);
	}

	@Override
	public void print() {
		System.out.println("id="+this.getId()+"Title="+this.getTitle()+"copies="+this.getCopies()+"author="+this.getAuthor());
	}

	@Override
	public void checkIn() {
		System.out.println("welcome to library");
	}

	@Override
	public void checkOut() {
		System.out.println("thank you for visiting");
	}


}
