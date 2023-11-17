public class Time {
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public void threadSeconds() {
        if (seconds == 50) {
            seconds = -10;
        }
        seconds += 10;
    }

    public void threadMinutes() {
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
        System.out.println("\u001B[30mCconsole cleared.\u001B[0m");
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
