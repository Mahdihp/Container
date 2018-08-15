import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {

    private List<T> element = new ArrayList<T>();

    public Box() {

    }

    public void add(T t) {
        element.add(t);
    }

    public T get(int t) {
        return element.get(t);
    }

    public List<T> getElement() {
        return element;
    }

    public void setElement(List<T> element) {
        this.element = element;
    }

    public int contains(T f) {
        for (int i = 0; i < element.size(); i++) {
            if (element.get(i).equals(f))
                return i;
        }
        return -1;
    }


}
