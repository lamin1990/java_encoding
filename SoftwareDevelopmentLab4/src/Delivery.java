/**
 * 
 */

/**
 * @author user
 *
 */
public interface Delivery {
	/**
	 * @return the tutor of the delivery
	 */
	String getTutor() throws NoTutorException;
	
	/**
	 * @param to set the tutor
	 */
	void setTutor(String tutor);
	
	/**
	 * @return room of the delivery
	 */
	String getRoom() throws NoRoomException;
	/**
	 * @param to set the room
	 */
	void setRoom(String room);

}
