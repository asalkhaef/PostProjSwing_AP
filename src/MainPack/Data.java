package MainPack;

abstract public class Data<T> {
    T key;
    //....Constructor.....................
    public Data(T key) {
        this.key = key;
    }
    //....Setter&Getter...................
    public void setKey(T key) {
        this.key = key;
    }
    public T getKey() {
        return key;
    }
}
