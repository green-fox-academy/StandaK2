package charsequence;

public class Shifter implements CharSequence{
    String word;
    int number;
    String shiftedWord;

    public Shifter(String word, int number) {
        this.word = word;
        this.number = number;
        this.shiftedWord = (word.charAt(number) + word.substring(1, number) + word.charAt(0) + word.substring(number + 1, word.length()));
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.shiftedWord.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.shiftedWord.subSequence(start, end);
    }
}
