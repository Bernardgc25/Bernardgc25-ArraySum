public class Application {
        public static void main(String[] args) {
            ArraySum sample = new ArraySum(); 
            int[] arr1 = {1,2,3,4};

            //int len = arr1.length;

            //System.out.println(len);
            int sumArray = sample.sum(arr1);
            
            System.out.println(sumArray);
            
    
        }
}
