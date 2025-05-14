class Student {
    Heart heart;
    Brain brain;
    Bike bike;
    Book book;

    public Student() {
        heart = new Heart(1.5f, 72);
        brain = new Brain(1.3f, "White");
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    void setBook(Book book) {
        this.book = book;
    }

}

class Heart {
    float weight;
    int bpm;

    public Heart(float weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;

    }
}

class Brain {
    float weight;
    String color;

    public Brain(float weight, String color) {
        this.weight = weight;
        this.color = color;

    }

}

class Bike {
    String brand;
    float mileage;

    public Bike(String brand, float mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }
}

class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

public class StudentAgreegation {
    public static void main(String[] args) {
        Student myStudent = new Student();
        Bike myBike = new Bike("Duke", 3000);
        myStudent.setBike(myBike);
        Book myBook = new Book("AtomicHabbits", "jamesClear");
        myStudent.setBook(myBook);

        System.out.println("Student heart bpm is: " + myStudent.heart.bpm);
        System.out.println("Student heart weight is: " + myStudent.heart.weight);

        System.out.println("Student brain color is: " + myStudent.brain.color);
        System.out.println("Student brain weight is: " + myStudent.brain.weight);

        System.out.println("Student bike brand is: " + myStudent.bike.brand);
        System.out.println("Student bike mileage is: " + myStudent.bike.mileage);

        System.out.println("Student book name is: " + myStudent.book.name);
        System.out.println("Student book author is: " + myStudent.book.author);
    }

}
