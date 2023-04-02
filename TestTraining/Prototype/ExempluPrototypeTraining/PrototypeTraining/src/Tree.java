public interface Tree extends Cloneable{

    void setLeaves(String leaves);

    void setType(String type);

    void generateTree();

    Tree clone() throws CloneNotSupportedException;

}
