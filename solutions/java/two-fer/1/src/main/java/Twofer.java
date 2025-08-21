public class Twofer {
    public String twofer(String name) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (name.equals("")) {
            return ("One for you, one for me.");
        }
        return ("One for "+name+", one for me.");
    }
}
