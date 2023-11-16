public class Time {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public synchronized void threadSeconds() {
        if (seconds == 60) {
            seconds = 0;
        }
        seconds += 10;
    }

    public synchronized void threadMinutes() {
        if (minutes == 60) {
            hours++;
            minutes = 0;
        }
        minutes++;
    }

    public  synchronized void threadHours() {
        hours++;
    }

    public int getHours() {
        return hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }
}
