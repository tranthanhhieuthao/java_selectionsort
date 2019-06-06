public class selectionsort {
    public static void main(String[] args) {
        double[] array = new double[100000];
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        for (int i=0;i<100000;i++){
            array[i] = Math.floor(Math.random()*100000 +1);
        }
        for (int i=0;i<100000-1;i++){
            if (array[i] >array[i+1]){
                array[i] = array[i+1];
            }
        }
        stopwatch.stop();
        System.out.println(stopwatch.getElapsedTime());
    }
}
