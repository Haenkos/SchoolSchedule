package net.haenkos.SchoolScheduler;

public class EntryBuilder {

    UserInput userInput;

    public EntryBuilder() {
        userInput = new UserInput();
    }
    
    public int[] buildEntry(){
        int[] newEntryParams = new int[10];

        newEntryParams[0] = userInput.userDateInput();


        return newEntryParams;
    }
}
