import java.util.Scanner;
class week6WS1{
    public static void main(String[] args){
        String[] name ;
        name = new String[5];
        Scanner scanner = new Scanner(System.in);
        int i=0;
        for(i = 0 ; i < name.length ; i++){
            System.out.printf("Write the name of teacher %d : ",i+1);
            name[i] = scanner.nextLine();
        }
        System.out.println();
        for(i = 0 ; i < name.length ; i++){
            System.out.printf("The name of teacher %d is %s ",i+1,name[i]);
            System.out.println();
        }
        System.out.println("The teacher at index two is "+ name[2]); 
        System.out.println("Enter the new value at index 4: ");
        name[4] = scanner.nextLine();
        System.out.println("The new value at index 4 is " +name[4]);
        scanner.close();
    }
}