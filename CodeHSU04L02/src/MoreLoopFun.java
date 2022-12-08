public class MoreLoopFun {
    public static void main(String[] args) {
        /*
        for(initialization; boolean; update){
            what we want to do
        }
         */

        //a for loop that counts by ones from 1 to 5
        for(int start = 1; int < 5; start++) {
            System.out.println(start + " ");
        }


        //a for loop that prints the powers of two up to 100
        //can you have an infinite for loop?
        System.out.println("Powers of 2");
        for(int start = 2; int <= 100; start*=2) {
            System.out.println(start + " ");
        }

        System.out.println("Counting by 4s");
        //write a for loop that counts by 4s from 5 up to 50
        for(int i = 5; i <= 50; i += 4) {
            System.out.println(start + " ");
        }


        //write a for loop that sums the numbers from 1 to 10
        int total = 0;
        for( int i = 1; i <= 10; in++) {
            i += total;
        }
        System.out.println("The of the integer 1 through 10 is: " + total);

        ////////////////////////////////////////////////////
        //for loops compared to while loops////////////////
        //////////////////////////////////////////////////

        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }
        System.out.println("Finished!");

        int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }
        System.out.println("Finished!");

        String name = "Mr. Smith";
        int j = 0;
        for(j< name.length()) {
            System.out.println(name.charAt(j));
            j++;
        }
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

    }
}
