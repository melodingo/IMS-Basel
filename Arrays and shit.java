public class Arrays {
    
    public static void main(String[] args) {

      //Erste Aufgabe
      /* 
      
      int[] number = new int[10];

        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;
        number[5] = 5;
        number[6] = 6;
        number[7] = 7;
        number[8] = 8;
        number[9] = 9;

        for(int i=0; i<number.length; i++ ){
            System.out.println(number[i]);
        } */

        //-----------------------------------------------------------------------
        //Erste Aufgabe 2.0
        /* 

        int[] number = new int[10];

        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;
        number[5] = 5;
        number[6] = 6;
        number[7] = 7;
        number[8] = 8;
        number[9] = 9;

        for(int i = number.lenght -1; i>=0; i--){
            System.out.println(number[i]);
        } */

        //-----------------------------------------------------------------------
        //Zweite Aufgabe
        /* 
        int[] number = new int[10];

        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;
        number[5] = 5;
        number[6] = 6;
        number[7] = 7;
        number[8] = 8;
        number[9] = 9;
        */


        //Aufgabe 5

        String[] name = {"vincent", "vincent", "tim", "martin", "louiza", "else", "kevin", "tobias", "paul", "paula","laura","isabelle", "jan","ken"};

        for(int i = 0; i < name.length; i++) {
            name[i] = name[i].substring(0, 1).toUpperCase() + name[i].substring(1);
            System.out.println(name[i]);
        }
    

   }
}
