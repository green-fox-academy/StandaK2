package charsequence;

public class Gnirts implements CharSequence{

    String word;
    String revWord;

    public Gnirts(String word) {
        this.word = word;
        this.revWord = "";
        for (int i = 0; i < this.word.length(); i++) {
            this.revWord += this.word.charAt(this.word.length() - (i+1));
        }
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return this.revWord.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.revWord.subSequence(start, end);
    }
}
