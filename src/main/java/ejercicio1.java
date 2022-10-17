class Main {

    public static void main(String[] args) {
        int num;


        for (int i = 1; i <= 100; i++) {



            if(i % 3 == 0 && i % 5 != 0){
                //Hay múltiplo de tres...

                System.out.print( "VIN"+" - " );

            }
            else if(i % 5 == 0 && i % 3 != 0){
                //Hay múltiplo de cinco...
                System.out.print( "CLE"+" - " );

            }

            else if(i % 3 == 0 && i % 5 == 0){
                //Hay múltiplo de tres y cinco...
                System.out.print( "VINCLE"+" - " );
            }
            else{
                System.out.print( i+" - " );

            }
        }

    }
}