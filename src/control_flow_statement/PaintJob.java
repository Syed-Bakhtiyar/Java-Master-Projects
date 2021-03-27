package control_flow_statement;

public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(7.32, 6.45, 2.22, 10));
        System.out.println(getBucketCount(7.25, 4.3, 2.35 ));
        System.out.println(getBucketCount(3.4, 1.5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <=0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        if(extraBuckets == 0){
            return getBucketCount(width, height, areaPerBucket);
        }
        double area = width * height; // 2.0
        double totalAreaCoveredByExtraBuckets = extraBuckets * areaPerBucket;
        double differenceArea = area - totalAreaCoveredByExtraBuckets;
        int remainingBucketCountAfterDivision = (int) (Math.ceil(differenceArea / areaPerBucket));
        return remainingBucketCountAfterDivision;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <=0 || areaPerBucket <= 0 ){
            return -1;
        }

        double area = width * height;
        int totalBucketRequired = (int) (Math.ceil(area / areaPerBucket));
        return totalBucketRequired;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int totalBucketRequired = (int) (Math.ceil(area / areaPerBucket));
        return totalBucketRequired;
    }

}
