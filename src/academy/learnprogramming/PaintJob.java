package academy.learnprogramming;

public class PaintJob {
   public static int getBucketCount(double width,double height, double areaPerBucket,int extraBuckets){

       if((width<=0)||(height<=0)||(areaPerBucket<=0)||(extraBuckets<0)){
           return -1;
       }else{
           return (getBucketCount(width,height,areaPerBucket)-extraBuckets) ;
       }
    }
    public static int getBucketCount(double width,double height, double areaPerBucket){
        if((width<=0)||(height<=0)||(areaPerBucket<=0)){
            return -1;
        }
        else{
            double area=width*height;
            return getBucketCount(area,areaPerBucket);
        }
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if((area<=0)||(areaPerBucket<=0)) {
           return -1;
        }else{
              return (int)Math.ceil(area/areaPerBucket);
        }
    }
}
