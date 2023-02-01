package Assignment;
public class Test {

	public static void main(String[] args) {
//		
//		Lecture l = new Lecture();
//		
//		Notable note = l::noteAlecture;
//		note.note("Physics");
//		
//		Blog b = new Blog();
//		Notable n1 = b::blogging;
//		n1.note("Travel");
//		
//		Notable web = Webinar::live;
//		web.note("Web Technology");
//		
//		Doable dd = Work::new;
//		dd.do1("Job");
		
		Cricket c = new Cricket();
		Tournament t1 = c::playCricket;
		t1.game("Cricket");
		
		Football f = new Football();
		Tournament t2 = f::playfootball;
		t2.game("Football");
		
		Hockey h = new Hockey();
		Tournament t3 = h::playhockey;
		t3.game("Hockey");
	}
}
