class week5WS3 {
    public static void main(String[] args) {
        int i = 1;
        double sum = 0;  
        do {
            sum += Math.pow(i, 2); 
            i++;
        } while (i <= 10);
        
        System.out.println("Sum of squares of first 10 natural numbers: " + sum);
    }
}
