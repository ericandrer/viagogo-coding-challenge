package event;

import java.util.Random;

public class EventId {

    private int id;

    private int setId(int newId){
        return this.id = newId;
    }

    /**
     * Method to generate a random ID (int) up to 100 to be used as an Unique Event Id.
     * @return ID
     */
    public int uniqueId() {
        Random random = new Random();
        int randomId = random.nextInt(100);

        EventId eventId = new EventId();
        return this.id = eventId.setId(randomId);
    }

}
