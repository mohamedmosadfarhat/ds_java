class Person {
    private String name;
    private int telephone;
    Person left, right;

    public Person(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
        left = right = null;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getTelephone() { return telephone; }
    public void setTelephone(int telephone) { this.telephone = telephone; }
}
////
class PhoneBookTree {
    private Person root;

    public PhoneBookTree() {
        root = null;
    }
 Person insert(Person node, String name, int telephone) {
        if (node == null) return new Person(name, telephone);

        if (telephone < node.getTelephone()) {
            node.left = insert(node.left, name, telephone);
        } else if (telephone > node.getTelephone()) {
            node.right = insert(node.right, name, telephone);
        }
        return node;
    }
   
    //
    void printPreOrder(Person node, int level) {
        if (node == null) return;
        System.out.println(level + ". " + node.getName() + "  " + node.getTelephone());
        printPreOrder(node.left, level + 1);
        printPreOrder(node.right, level + 1);
    }
  //
  boolean identical(Person a, Person b) {
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;
    return a.getTelephone() == b.getTelephone() &&
           a.getName().equals(b.getName()) &&
           identical(a.left, b.left) &&
           identical(a.right, b.right);
}
//
int count(Person node) {
    if (node == null) return 0;
    int count = 0;
    if (String.valueOf(node.getTelephone()).startsWith("1")) count = 1;
    return count + count(node.left) + count(node.right);
}
//
Person searchByTelephone(Person node, int telephone) {
    if (node == null) return null;
    if (node.getTelephone() == telephone) return node;
    if (telephone < node.getTelephone())
        return searchByTelephone(node.left, telephone);
    if (telephone > node.getTelephone())
        return searchByTelephone(node.right, telephone);
    return node;
}
boolean searchByName(Person root, String name) {
    if (root == null)
        return false;

    if (root.getName().equals(name))
        return true;

    // دور في اليسار واليمين
    return searchByName(root.left, name) || searchByName(root.right, name);
}
//
boolean updateName(Person node, int telephone, String newName) {
        if (node == null) return false;
        if (node.getTelephone() == telephone) {
            node.setName(newName);
            return true;
        }
        if (telephone < node.getTelephone()) return updateName(node.left, telephone, newName);
        return updateName(node.right, telephone, newName);
    }

}
