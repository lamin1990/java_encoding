/**
 * The abstract base class that represents a subject
 * @author user
 *
 */
public abstract class Subject implements Delivery {
	/**
	 * The name of the subject
	 */
	final private String name;
	/**
	 * The description of the subject
	 */
	final private String description;
	
	protected String tutor;
	protected String room;
	
	/**
	 * Constructor
	 * @param name
	 * @param description
	 */
	
	Subject (String name, String description){
		this.name = name;
		this.description = description;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * @return the credit of the subject
	 */
	public abstract int getCredit();
	
	@Override
	public String getTutor() throws NoTutorException{
		if (tutor == null)
			throw new NoTutorException("Tutor is not set for subject " + name);
		return tutor;
	}
	
	@Override
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	@Override
	public String getRoom() throws NoRoomException {
		if (room == null)
			throw new NoRoomException("Room is not set for subject " + name);
		return room;
	}
	@Override
	public void setRoom(String room) {
		this.room = room;
	}
	

}
