import java.util.*;

public class CollectionsExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 89};
        Shape[] shapes = {new Circle(), new Triangle(), new Rectangle() };

        for( int n:numbers){
            System.out.println(n);
        }

        for (Shape s:shapes){
            s.draw();
        }

        shapes[0] = new Square();
        Shape[] myShape = new Shape[10];
        System.out.println(myShape.length);

        ArrayList myList = new ArrayList();
        myList.add(new Shape());
        myList.add(new Student());
        myList.get(0);

        for(Object s:myList){
            System.out.println(s);
        }

        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Shape> myGenericShapes = new ArrayList<Shape>();
        myGenericShapes.add(new Square());
        myGenericShapes.add(new Rectangle());

        for (Shape s : myGenericShapes){
            s.draw();
        }

        HashSet<String> hs = new HashSet<String>();
        hs.add("alex");
        hs.add("alex");
        System.out.println(hs.size());
        //String[] myArrayString = (String[]) hs.toArray();

        HashMap<Integer, String> myHasMap = new HashMap<>();
        myHasMap.put(1,"alex");
        myHasMap.put(2,"andreea");
        System.out.println(myHasMap.get(1));

        for (Integer k : myHasMap.keySet()){
            System.out.println(myHasMap.get(k));
        }

        Queue<String> breadQueque = new PriorityQueue<>();
        breadQueque.add("alex");
        breadQueque.add("ana");

        System.out.println(Browsers.BRAVE);

        String inputText = "Ana are mere si pere si struguri. Toamna e frumos pentru ca nu e inca frig.";
        printCharFrequency(computeMapFromString(inputText, true));
        printCharFrequency(computeMapFromString(inputText, false));

    }


    //// frecventa aparitiilor unui caracter intr un text

    public static HashMap<Character,Integer> computeMapFromString(String text, boolean caseSenzitive){
        HashMap<Character, Integer> charMap = new HashMap<>();
        String finalText = caseSenzitive ? text : text.toLowerCase();//
        for (Character s:finalText.toCharArray()){
            if(charMap.containsKey(s)){
//                int currentCount = charMap.get(s);
//                currentCount++;
//                charMap.put(s,currentCount);
                charMap.put(s, charMap.get(s) + 1);
            }
            else {
                charMap.put(s,1);

            }
        }
        return charMap;
    }

    public static void printCharFrequency(HashMap<Character, Integer> charMap){

        int sum = 0;
        for (Character c:charMap.keySet()){
            sum += charMap.get(c);
        }
        for (Character c:charMap.keySet()){
            System.out.println(c + " : " + charMap.get(c) + 100.0 / sum);
        }

    }


}
