public class App {
    public static void main(String[] args) throws Exception {
        int a =  0 , b = 1 , suma,limite = 10 , c ;
        System.out.println(a);
        System.out.println(b);
        for( c = 0 ; c < limite ; c++ )
        {
            suma = a + b;
            a = b;
            b = suma;
            System.out.println(suma);

        }
    }
}
