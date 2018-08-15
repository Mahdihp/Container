public class Main {

    public static void main(String[] args) {
        Box<Integer> box=new Box<Integer>();
        box.add(20);
        box.add(20);
        Integer integer = box.get(1);
    }
}
