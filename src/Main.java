public class Main {

    public static void main(String[] args) {
        Box<Integer> box=new Box<Integer>();
        box.add(20);
        box.add(21);
        box.add(33);
        System.out.println(box.search(21));
    }
}
