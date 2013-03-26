package informatik.hawhamburg.theamnahme;

public class  Main {

    public static void main(String[] args) {
        // ad hoc example usage for AssociationList
        AssociationList<String> stringAssociationList = new AssociationList<String>();

        // add some strings
        stringAssociationList.add("Object 1");
        stringAssociationList.add("Object 2");
        stringAssociationList.add("Object 3");

        try {
            System.out.println(stringAssociationList.get(1));
            stringAssociationList.remove(0);
            System.out.println(stringAssociationList.get(1));
        } catch (AssociationException e) {
            e.printStackTrace();
        }
    }
}
