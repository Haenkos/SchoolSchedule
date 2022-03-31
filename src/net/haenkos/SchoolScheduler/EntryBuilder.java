package net.haenkos.SchoolScheduler;

public class EntryBuilder {

    UserInput userInput;
    DataStore dataStore;

    public EntryBuilder(DataStore dataStore) {
        userInput = new UserInput();
        this.dataStore = dataStore;
    }
    
    public int[] buildEntry(){
        int[] newEntryParams = new int[10];

        /*
        * There is a maximum amount entries per date, so until that amount of dates is found
        * in the dataStore.entryList, a new entry with that date can be made. At program startup
        * the maximum number needs to be determined based on the possible permutations of all Entry-fields.
        * then have a check at input: 
        * if (number of times inputDate is in entryList < MAX_ALLOWED_DATE_ENTRIES) {
        *    do the thing
        * }
        * a check needs to be done for maximum allowable entries for a specific block per date.
        * this is as simple as MAX_ALLOWED_BLOCK == number of rooms because each room can be booked once per block.
        *
        * after that we need the following functions from the dataStore:
        * - getAvailableBlocks(int date) -> returns all blocks that are not fully scheduled for that date
        * - getAvailableRooms(int block) -> returns all rooms that are not yet booked for that block
        * - getAvailableCourses(int block) -> returns all courses that are not yet booked for that block
        * 
        * after this, all courses are scheduled (teachers map 1<->1 with courses), the students can
        * be divided over the courses for that block.
        *
        * Possibly decouple Student from the Entry, and make separate function that combines Students with the
        * schedule based on the Student.getCourses() and outputs a sort of 'VIEW'. 
        * maybe some checks need to be done to make sure each student get's equal amaount of classes for each course
        * but may also be outside of scope of this exercise. If done, maybe some parameters can be calculated from StudentsList
        * against which some checks can be made.
        */


        return newEntryParams;
    }
}
