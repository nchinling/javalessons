package myapp;


public class Calculator {
    
    public static float getMean(String data){
        
        int counter = 0;
        //Split string using commas as delimiter and place in arrayNumbers. 
        String[] numbers = data.split(",");
        for (String x: numbers){
            counter++;
        }

        float[] arrayNumbers = new float[counter];
            for (int i = 0; i < arrayNumbers.length; i++ ) {
                arrayNumbers[i] = Float.parseFloat(numbers[i]);
            }
        
        //Function to calculate mean. 
        float sum = 0;
 
            // To calculate sum and number of elements 
            for (int i = 0; i < arrayNumbers.length; i++) {
                sum += arrayNumbers[i];
            }
 
            float mean = (float)(sum / counter);
   
     
            // Returns mean of array
            return mean;
       
    }

    public static float getSd(String data){

        float sum = 0f;
        float mean = 0f;
        float sq = 0f;
        float var = 0f;
        float sd = 0f;
        
        int counter = 0;
        //Split string using commas as delimiter and place in arrayNumbers. 
        String[] numbers = data.split(",");

        for (String x: numbers){
            counter++;
        }

        float[] arrayNumbers = new float[counter];
            for (int i = 0; i < numbers.length; i++ ) {
                arrayNumbers[i] = Float.parseFloat(numbers[i]);
                
            }
           
            for (int i = 0; i < arrayNumbers.length; i++) {
                sum = sum + arrayNumbers[i];
            }
           
            mean = sum / (arrayNumbers.length);
     
            for (int i = 0; i < arrayNumbers.length; i++) {
                var
                = (float) (var + Math.pow((arrayNumbers[i] - mean), 2));
            }
       
        sq = var / arrayNumbers.length;
        sd = (float) Math.sqrt(sq);
        return sd;
     
    }
}
