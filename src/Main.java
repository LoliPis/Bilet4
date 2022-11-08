public class Main {
    public static String[] array = {"abc","abc","ds","asd","aa","sd","abc","ds"};
    public static StringBuilder str = new StringBuilder("");
    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        if (array[i].equals(array[j]) == true) {
                            array[j] = null;
                        }
                    }
                }
            }
            if (array[i] != null) {
                str.append(array[i]);
            }
        }
        System.out.println(str);
    }
}
