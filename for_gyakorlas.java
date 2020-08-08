import java.util.Scanner;

public class for_gyakorlas {
    public static void main(String[] args) {
        /*
            Output:
            *
            **
            ***
            ****
            *****
            *
            **
            ***
            ****
            *****
            *
            **
            ***
            ****
            *****
        

        for(int i = 0; i <= 3; i++){
            for(int a = 1; a <= 5; a++){
                switch(a){
                    case 1:
                        System.out.println("*");
                        break;
                    case 2:
                        System.out.println("**");
                        break;
                    case 3:
                        System.out.println("***");
                        break;
                    case 4:
                        System.out.println("****");
                        break;
                    case 5:
                        System.out.println("*****");
                        break;
                }
            }
            System.out.println();
        }
        
        //Vegtelen for
        for(;;){
            System.out.println("Szeretem a tejet");
        }

        */

        Scanner scanner = new Scanner(System.in);
/*
        while(true){
            System.out.println("Irj be egy szamot");
            int i = scanner.nextInt();
            if(i == 0){
                break;
            }

            System.out.println(i);
        }

        System.out.println("Done");
        scanner.close();
        */

        while(true){
            System.out.println("Irj be egy szamot");
            int i = scanner.nextInt();
            if(i > 10){
                continue;
            }
            if(i == 0){
                break;
            }

            System.out.println(i);
        }

        System.out.println("Done");
        scanner.close();
    }
}