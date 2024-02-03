package Aula5.Ex04;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(LocalDate.now(),LocalTime.of(9,0),LocalTime.of(18,0));
        Meeting meet1 = new Meeting(LocalTime.of(16,30),LocalTime.of(17,0));
        Meeting meet2 = new Meeting(LocalTime.of(16,0),LocalTime.of(16,29));

        schedule.addMeet(meet1);
        schedule.addMeet(meet2);

        System.out.println(schedule.toString());
        System.out.println(String.format("%.2f%%",schedule.percentageSpentInMeetings()));

        schedule.removeMeet(meet1);

        System.out.println(schedule.toString());
        System.out.println(String.format("%.2f%%",schedule.percentageSpentInMeetings()));
    }
}
