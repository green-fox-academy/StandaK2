//Create Counter class
//which has an integer field value
//                when creating it should have a default value 0 or we can specify it when creating
//        we can add(number) to this counter another whole number
//        or we can add() without parameters just increasing the counter's value by one
//        and we can get() the current value
//        also we can reset() the value to the initial value

package counter;

public class Counter {

    int count;
    int initCount;

    public Counter(){
        this(0);
        this.initCount = 0;
    }
    public Counter(int count){
        this.count = count;
        this.initCount = count;
    }

    public void add(){
        this.count ++;
    }
    public void add(int number){
        this.count =+ number;
    }
    public int get(){
        return this.count;
    }
    public void reset(){
        this.count = this.initCount;
    }
}
