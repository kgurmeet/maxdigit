public class Amax {
    public static void main(String[] args) {
        int[] arr={5,8,1,2,3,4};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
            max=arr[i];
        }
        System.out.println("max element is "+ max);
    }
    
}
