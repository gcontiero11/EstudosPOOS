package Aula5.Ex04;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Schedule {
    private LocalDate day;
    private LocalTime startTime;
    private LocalTime endTime;
    private Meeting[] meetings;

    public Schedule(){
        this.meetings = new Meeting[0];
    }
    public Schedule(LocalDate day,LocalTime startTime, LocalTime endTime){
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetings = new Meeting[0];
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "day=" + day +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", meetings=" + Arrays.toString(meetings) +
                '}';
    }

    public static boolean scheduleConflictValidor(Meeting meet1, Meeting meet2) {
        LocalTime m1StartTime = meet1.getStartTime();
        LocalTime m1EndTime = meet1.getEndTime();
        LocalTime m2StartTime = meet2.getStartTime();
        LocalTime m2EndTime = meet2.getEndTime();

        if (m1StartTime == m2StartTime || m1EndTime == m2EndTime) return true;
        return m1StartTime.isBefore(m2EndTime) && m1StartTime.isAfter(m2StartTime) || m1EndTime.isBefore(m2EndTime) && m1EndTime.isAfter(m2StartTime);
    }

    public void addMeet(Meeting meeting){
        boolean scheduleConflit = false;
        for (Meeting m : meetings){
            if (scheduleConflictValidor(meeting, m)){
                scheduleConflit = true;
                break;
            };
        }
        if ( ! scheduleConflit) {
            Meeting[] newMeet = new Meeting[meetings.length + 1];
            int i = 0;
            for (Meeting meet : meetings) {
                newMeet[i] = meet;
                i++;
            }
            newMeet[newMeet.length - 1] = meeting;
            this.meetings = newMeet;
        }
    }

    public void removeMeet(Meeting meeting){
        Meeting[] newMeet = new Meeting[meetings.length - 1];
        boolean flag = false;
        for (int i = 0; i<meetings.length;i++){
            if (meetings[i] == meeting){
                meetings[i] = meetings[meetings.length - 1];
                flag = true;
            }
        }
        if (flag){
            for (int i = 0; i<newMeet.length; i++){
                newMeet[i] = meetings[i];
                i++;
            }
            meetings = newMeet;
        }
        else{
            System.out.println("Esta reuniao não está agendada");
        }
    }

    public double percentageSpentInMeetings(){
        double minutesInADay = 1440;
        double durationOfAllMeetings = 0;
        for (Meeting m : meetings){
            durationOfAllMeetings += m.durationInMinutes();
        }
        return (durationOfAllMeetings/minutesInADay) * 100;
    }
}
