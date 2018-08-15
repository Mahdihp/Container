import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {

    private List<T> element = new ArrayList<T>();

    public Box() {

    }

    public List<T> getElement() {
        return element;
    }

    public void setElement(List<T> element) {
        this.element = element;
    }
}
