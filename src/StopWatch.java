import java.util.Date;

public class StopWatch {
    private double startTime ,endTime;

    public  double getStartTime(){
        return this.startTime ;
    }

    public  double getEndTime(){
        return this.endTime ;
    }

    public void starttime(){
       this.startTime = new Date().getTime();
    }

    public void  start(){
     this.startTime = new Date().getTime();
    }

    public void stop(){
    this.endTime =  new Date().getTime();
    }

    public double getElapsedTime(){
        return (this.endTime -this.startTime);
    }

}
