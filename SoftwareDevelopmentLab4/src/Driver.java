/**
 * 
 */

/**
 * @author user
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject[] subjectArray = new Subject[3];
		Maths m1 = new Maths("Class A", "Top Class");
		m1.setTutor("Lamin khan");
		m1.setRoom("101");
		subjectArray[0] = m1;
		
		Physics p1 = new Physics("Class B", "Middle Class");
		p1.setTutor("Jake Bowman");
		p1.setRoom("102");
		subjectArray[1] = p1;
		
		Geography g1 = new Geography("Class C", "Bottom Class");
		g1.setTutor("Paul Cookson");
		g1.setRoom("103");
		subjectArray[2] = g1;
		
		for (Subject x : subjectArray) {
			System.out.println(x.getName());
			System.out.println(x.getDescription());
			System.out.println(x.getCredit());
			
			try {
				System.out.println(x.getTutor());
				
			}catch(NoTutorException e) {
				System.err.println(e);
				
			}
			try {
				System.out.println(x.getRoom());
			}catch(NoRoomException e) {
				System.err.println(e);	
			}
			System.out.println("");
		}

	}

}
