package sharpieset;

import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpieSet;

    public SharpieSet(List<Sharpie> sharpieSet) {
        this.sharpieSet = sharpieSet;
    }

    public int countUsable() {
        int count = 0;
        for (Sharpie sharpie : this.sharpieSet) {
            if (sharpie.inkAmount > 0) {
                count++;
            }
        }
        return count;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpieSet.size(); i++) {
            if (sharpieSet.get(i).inkAmount == 0) {
                this.sharpieSet.remove(i);
                i--;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Sharpie sharpie : sharpieSet) {
            result += ("color: " + sharpie.color + ", width: " + sharpie.width + ", inkAmount: " + sharpie.inkAmount) + "\n";
        }
        return result;
    }
}
