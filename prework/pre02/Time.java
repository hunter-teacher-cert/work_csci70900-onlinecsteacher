class Time {
  public static void main(String[] args) {
    int hour = 18;
    int minute = 1;
    int second = 30;

    double secondsSinceMidnight = hour*3600+minute*60+ second;
    double secondsInADay = 86400.0;
    double secondsRemaining = secondsInADay - secondsSinceMidnight;
    double percentageOfDayPassed = secondsSinceMidnight/secondsInADay;

    System.out.println("Seconds since midnight: " + secondsSinceMidnight);
    System.out.println("Seconds remaining in the day: " + secondsRemaining);
    System.out.println("Percentage of the day that has passed: " + percentageOfDayPassed);

    double tempHour = 17;
    double tempMinute = 50;
    double tempSecond = 30;

    double timeElapsed = secondsSinceMidnight - (tempHour*3600+tempMinute*60+tempSecond);

    System.out.println("Time elapsed (in seconds): " + timeElapsed);
  }
}
