package javaPrograms;

public class demo2 {
    public static void main(String[] args) {
        String[] array = {"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"};
        String firstElement = array[0];
        String secondElement = array[1];

        // Split the first element into two words
        for (int i = 1; i < firstElement.length(); i++) {
            String firstWord = firstElement.substring(0, i);
            String secondWord = firstElement.substring(i);

            // Check if both words exist in the second element
            if (secondElement.contains(firstWord) && secondElement.contains(secondWord)) {
                System.out.println("First word: " + firstWord);
                System.out.println("Second word: " + secondWord);
                break; // Break the loop if a valid split is found
            }
        }
    }
}
