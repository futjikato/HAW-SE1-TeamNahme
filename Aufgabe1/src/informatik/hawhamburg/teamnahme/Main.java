package informatik.hawhamburg.teamnahme;

public class  Main {

    public static void main(String[] args) {
        // ad hoc example usage for AssociationList
        AssociationHashMap<Integer, String> dummy = new AssociationHashMap<Integer, String>();

        // add some strings
        try {
            dummy.add("Object 1", 1);
            dummy.add("Object 2", 2);
            dummy.add("Object 3", 3);
        } catch (AssociationException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(dummy.get(1));
            dummy.remove(2);
            System.out.println(dummy.get(1));
            System.out.println(dummy.get(3));
        } catch (AssociationException e) {
            e.printStackTrace();
        }
    }
}
