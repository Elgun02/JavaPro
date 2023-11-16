public class Time {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public synchronized void threadSeconds() {
        if (seconds == 50) {
            seconds = -10;
        }
        seconds += 10;
    }

    public synchronized void threadMinutes() {
        if (minutes == 59) {
            hours++;
            minutes = 0;
        }
        minutes++;
    }

    public void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
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
