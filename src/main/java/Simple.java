public class Simple {

    public static void main(String[] args) {

        int current = 1500;

        for (int j = 1; j < current; j++) {
            int ostatok = 0;
            for (int i = 1; i <= current / 2; i++)
            {
                if ( j % i == 0)
                    ostatok++;
            }
            if (ostatok < 3)
                System.out.println(j);

        }

    }

}
