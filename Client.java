
public class Client {

	public static void main(String[] args) {

		ClassBook bk=new ClassBook(101,"harry potter",7,"j k rowling");
		JournalPaper jp=new JournalPaper(201,"journal of everything",4,"tom stone",1997);
		Video v=new Video(609,"Big Data Analytics",250,112,"vishali","educative",2019);
		CD c=new CD(909,"bada pachtao ge",300,7,"arijit singh","sad song");
		bk.checkIn();
		
		bk.print();
		jp.print();
		v.print();
		c.print();
		
		jp.checkOut();
	}

}
