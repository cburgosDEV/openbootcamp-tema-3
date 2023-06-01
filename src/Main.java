public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Luis", "Cristian", "Marco", "Pedro"};
        String nombres_unidos = "";
        for(int i = 0; i < nombres.length; i++) {
            nombres_unidos += nombres[i] + (i == nombres.length - 1 ? "" : ", ");
        }

        System.out.println(nombres_unidos);
    }
}