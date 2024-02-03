package Aula5.Ex04;

import java.time.Duration;
import java.time.LocalTime;

public class Meeting {
    private String description;
    private LocalTime startTime;
    private LocalTime endTime;

    public Meeting(){

    }

    public Meeting(LocalTime startTime,LocalTime endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime(){
        return endTime;
    }

    public int durationInMinutes(){
        int result;
        Duration duracao = Duration.between(startTime,endTime);
        result = (int) duracao.toMinutes();
        System.out.println(result);
        return result;
    }
}
