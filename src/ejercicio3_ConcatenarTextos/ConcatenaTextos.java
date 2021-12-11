package ejercicio3_ConcatenarTextos;

public class ConcatenaTextos {

    public static void main(String[] args) {

        String nombres[] = {"Javi ", "Elena ", "Angel ", "Eugenia "};

        //Forma larga
        for(int i = 0; i < nombres.length;i++){

            System.out.print(nombres[i]);
        }
        System.out.println("");

        //Forma corta
        for(String i : nombres){
            System.out.print(i);
        }
    }
}
