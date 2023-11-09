public class Main {
    public static void main(String[] args) {
        DinamicArray array = new DinamicArray(5);

        System.out.println("Размер массива - " + array.size());
        System.out.println("Пустой ли массив? - " + array.isEmpty());
        System.out.println(array);

        array.add("A");
        array.add("B");
        array.add("C");

        System.out.println("Размер массива - " + array.size());
        System.out.println("Пустой ли массив? - " + array.isEmpty());
        System.out.println(array);

        array.add("D");
        array.add("E");
        array.add("F");

        array.add("D");
        array.add("E");
        array.add("F");
        array.add("D");
        array.add("E");
        array.add("F");
        System.out.println(array);

        String removedElement = array.remove();
        System.out.println(array);
        System.out.println("Удалённый элемент - " + removedElement);

        array.set(1,"G");
        System.out.println(array);

        System.out.println("Содержит ли массив элемент G? - " + array.contains("G"));
        System.out.println("Содержит ли массив элемент F? - " + array.contains("F"));

        //array.clean();

        System.out.println(array);

        System.out.println("Сколько элементов F в массиве? -  " + array.frequencyDictionary("F"));
        System.out.println("Сколько элементов D в массиве? -  " + array.frequencyDictionary("D"));
        System.out.println("Сколько элементов E в массиве? -  " + array.frequencyDictionary("E"));
        System.out.println("Сколько элементов G в массиве? -  " + array.frequencyDictionary("G"));

    }
}
