package Pract22;

import java.util.Objects;

public class Buyer implements Comparable {
    private static int counter = 0;
    private int ID;
    private double GPA = -1;
    private String name;

    public void setGPA(double GPA){
        if (0.0 <= GPA && GPA <= 4.0)
            this.GPA = GPA;}
    public void setName(String name){this.name = name;}
    public int getID(){return ID;}
    public double getGPA(){return GPA;}
    public String getName(){return name;}

    public Buyer(String name, double GPA){
        this.ID = counter;
        ++counter;
        setName(name);
        setGPA(GPA);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buyer buyer = (Buyer) o;
        return ID == buyer.ID &&
                Double.compare(buyer.GPA, GPA) == 0 &&
                Objects.equals(name, buyer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, GPA, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", GPA=" + GPA +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Buyer))
            throw new IllegalArgumentException();
        else if ((this.GPA - ((Buyer) o).GPA) < 0) {
            return -1;
        } else if ((this.GPA - ((Buyer) o).GPA) > 0) {
            return 1;
        } else return 0;
    }
}
