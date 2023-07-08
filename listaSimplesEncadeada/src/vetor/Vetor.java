package vetor;

public class Vetor {
    public static void main(String[] args) throws Exception {

        // Array
        int[] array = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }

        // Array ja definido
        int[] arrayList = { 1, 2, 3 };

        for (int i = 0; i < 3; i++) {
            arrayList[i] = i + 10;
            System.out.println(arrayList[i]);
        }

        // Imprime na ordem inversa
        for (int i = arrayList.length - 1; i >= 0; i--) {
            System.out.println(arrayList[i]);
        }

    }
}
