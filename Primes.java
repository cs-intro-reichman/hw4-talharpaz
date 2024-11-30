public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        array(n);

        System.out.println("Prime numbers up to " + n + ":");
         int count = printPrimeNumbers(array(n));
         double percentage = ((double)count / n) * 100;
        System.out.println("There are " + count + " primes between 2 and " + n + " (" + percentage + "% are primes)");
       

    }
 
    public static int printPrimeNumbers (boolean [] arr){
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if ( arr[i] == true){
                count ++;
                System.out.println(i);
            }
            i++;
        }
        return count;
    }
    public static boolean [] array (int n){
         
        boolean [] nArray = new boolean[n];
        int i = 0;
        while (i < n) {
            if ( i !=0 && i != 1){
             nArray[i] =true;
              
            } 
            i++;
        }
        return  changeArray(nArray, n);
    }
   
    public static boolean [] changeArray ( boolean [] arr, int n){

        
        for ( int i=2; i<=n; i++) {
             if ( isPrime(i) == true) {
             int num = i +1 ;
        
        while (num < n) {
            if ( num%i == 0 ) arr[num] = false;
            num = num + 1;
        }
       
     }
    
    }
    return arr;
}
    
    public static boolean isPrime (int numberToCheck) {
        
        if ( numberToCheck <=1) return false;
        if (numberToCheck == 2) return true;
        double n = (double)numberToCheck;

        if ( numberToCheck%2 == 0) return false;

       for (int i= 3; i < Math.sqrt(n); i+=2) {
            if (numberToCheck%i == 0 ) {
                return false;
            }
        }

    return  true;
        
    }


}