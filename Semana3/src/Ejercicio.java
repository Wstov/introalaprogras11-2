

public class Ejercicio {

    public static void main(String[] args) {
        String i = "@";
        int j = 0;
        int x = 0;

        if (x < 5) {
            while (j < 3) {
                System.out.print(i);
                j++;
                if (j == 3) {
                    System.out.print("\n");
                    j = 0;
                    x+=1;
                    if (x==3){
                        x = 6;
                    }
                }

            }

        }

    }

}
