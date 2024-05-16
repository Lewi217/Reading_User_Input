public class Pet {

    private static String name;
    private final String petType;
    private String owner;
    private int age;

    public Pet(String name,String petType,String owner, int age){
        this.name = name;
        this.petType = petType;
        this.owner= owner;
        this.age = age;
    }
    public static String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPetType(){
        return petType;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Pet pet1 = new Pet("Buddy ","Dog","Lewis",3);
        Pet pet2 = new Pet("Whiskers ","cat","hamster",1);
        Pet pet3 = new Pet("Rocky ","hamster","alice",1);

        System.out.println("pet 1: ");
        System.out.println("Name: "+ pet1.getName());
        System.out.println("Type: "+ pet1.getPetType());
        System.out.println("Owner: "+ pet1.getOwner());
        System.out.println("Age: "+ pet1.getAge() + "years");
        System.out.println();

        System.out.println("pet 2: ");
        System.out.println("Name: "+ pet2.getName());
        System.out.println("Type: "+ pet2.getPetType());
        System.out.println("Owner: "+ pet2.getOwner());
        System.out.println("Age: "+ pet2.getAge() + "years");
        System.out.println();

        System.out.println("pet 3: ");
        System.out.println("Name: "+ pet3.getName());
        System.out.println("Type: "+ pet3.getPetType());
        System.out.println("Owner: "+ pet3.getOwner());
        System.out.println("Age: "+ pet3.getAge() + "years");
        System.out.println();


    }
}
