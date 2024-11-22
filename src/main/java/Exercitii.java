public class Exercitii {

    public static void main(String[] args) {

        //Sumă și medie a unui array:
        // Scrie un program care primește un array de numere întregi și calculează
        // suma și media elementelor din array.

        int[] numbers = {2, 3, 6, 8, 4,};
        int sum = 0;
        for (int n : numbers) {
            sum += n;

        }
        double average = sum / (double) numbers.length;
        System.out.println("Suma:" + sum);
        System.out.println("Media:" + average);

        //Număr maxim și minim dintr-un array: Scrie un program care primește un array de
        // numere întregi și returnează valoarea maximă și valoarea minimă din array.

        int[] numbersS = {5, 8, 3, 9};
        int max = numbersS[0];
        int min = numbersS[0];

        for (int n : numbersS) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }

        }
        System.out.println("Maxim:" + max);
        System.out.println("Minim:" + min);

        //Inversarea unui array: Scrie un program care primește un array
        // și îl inversează. De exemplu, dacă array-ul inițial este [1, 2, 3], array-ul inversat ar trebui să fie [3, 2, 1].
//        int[] numb = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numb.length / 2;i++){





    }
}
