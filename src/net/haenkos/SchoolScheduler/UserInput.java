package net.haenkos.SchoolScheduler;

import java.util.concurrent.ThreadLocalRandom;

public class UserInput {
    public int userDateInput() {
        
        int date = ThreadLocalRandom.current().nextInt(1,31);

        return date;
    }
}
