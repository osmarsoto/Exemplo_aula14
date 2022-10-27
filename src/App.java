public class App {
    public static void main(String[] args) throws Exception {

        int retorno;

       retorno =  sumDouble(2 , 2);
        System.out.print(retorno);

        
    }

    public static int sumDouble (int a, int b) {

        int soma;
        soma = a + b;

        if (a == b){
            soma = soma *2;
        }

        return soma;
    }
}
