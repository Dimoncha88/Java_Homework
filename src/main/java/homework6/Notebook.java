package homework6;

public class Notebook {
    String name;
    String processor;
    String size;
    String color;
    String ram;
    String price;

    @Override
    public String toString() {
        return String.format("%s: %s,%s,%s,%s", name, processor,size,color, price);
    }

    public String notebookInfo() {
        System.out.printf("%s: %s,%s,%s,%sГБ,%s", name, processor,size,color,ram, price);
        return "";
    }
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;

    }
    public String getColor() {
        return color;

    }

    public String getRam() {
        return ram;
    }
}
