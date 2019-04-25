public class Anagram {

    String wordOne;
    String wordTwo;
    private String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    public Anagram(String wordOne, String wordTwo) {
        this.wordOne = wordOne.toUpperCase().replaceAll(" ", "");
        this.wordTwo = wordTwo.toUpperCase().replaceAll(" ", "");;
    }

    public boolean areWordsAnagrams() {
        int sumOfWordOne = 0;
        int sumOfWordTwo = 0;

        for (int i = 0; i < this.wordOne.length(); i++) {
            char letter = this.wordOne.charAt(i);
            sumOfWordOne += alphabet.indexOf(letter);

        }System.out.println(sumOfWordOne);
        for (int i = 0; i < this.wordTwo.length(); i++) {
            char letter = this.wordTwo.charAt(i);
            sumOfWordTwo += alphabet.indexOf(letter);

        }System.out.println(sumOfWordTwo);
        return (sumOfWordOne == sumOfWordTwo);
    }
}