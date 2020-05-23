package com.company;
class Animal {
    private String name , group, category ;
    double weight;

    Animal(String name, String group, String category, double weight) {
        this.name = name;
        this.group = group;
        this.category =category;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public void  setName(String Newname){
      this.name =  Newname;
    }
    public String getGroup(){
        return group;
    }
    public void  setGroup(String Newgroup){
        this.group =  Newgroup;
    }
    public String getCategory(){
        return category;
    }
    public void  setCategory(String Newcategory){
        this.category =  Newcategory;
    }

   public void animalSound(){
    System.out.println("The Animal Make Sound");
    }
    public void animalBio(){
        System.out.println("The Animal Bio");
    }
    public void animalCategory(){
        System.out.println("This Animal Category");
    }
}

class Pig extends  Animal {
    private String  additionalname;
    public Pig(String name, String group, String category, double weight) {
        super(name, group,category, weight);
        setName("Lamda");
        setGroup("Omnivora");
        setCategory("Big Pig");
        setAdditionalname("Zen");
    }

    private String getAdditionalname(){
        return additionalname;
    }

    public void setAdditionalname(String newadditionalname){
        this.additionalname =newadditionalname;
    }

    public void animalSound(){
        System.out.println("The pig says : wee weee");
    }
    public void  animalname(){
        System.out.println("=====The Additional Pig name====");
        System.out.println("The Pig name is " + getAdditionalname() );
    }

    public void animalBio(){
        System.out.println("The  Pig name " + getName());
        System.out.println("The  Pig Group  " + getGroup());
    }

    public void animalCategory(){
        if(weight >= 40){
            System.out.println("This animal is " + getCategory());
        }else{
            System.out.println("This is animal is Small Pig");
        }
    }
}

class Dog extends  Animal{
    private  String additionalname;

    public Dog(String name, String group, String category, double weight) {
        super(name, group, category, weight);
        setName("Robert");
        setGroup("Carnivora");
        setCategory("Big Dog");
        setAdditionalname("Stella");
    }
    private String getAdditionalname(){
        return additionalname;
    }
    public void setAdditionalname(String newadditionalname){
        this.additionalname = newadditionalname;
    }

    public void  animalname(){
        System.out.println("=====The Additional Dog name====");
        System.out.println("The Dog  name is " + getAdditionalname());
    }

    public void animalSound(){
        System.out.println("The Dog Says: bow bow");
    }
    public void animalBio(){
        System.out.println("The  Dog name " + getName());
        System.out.println("The  Dog Group  " + getGroup());
    }
    public void animalCategory(){
        if(weight >= 40){
            System.out.println("This animal is " + getCategory());
        }else{
          System.out.println("This is animal is Small Dog");
        }

    }
}


public class Main {
    public static void main(String[] args) {
	// write your code here
        Animal mypig = new Pig("Billy", "Carnivora",null,50);
        Animal mydog = new Dog("John","Herbivora",null,50);
        Pig mypigadd = new Pig(null,null,null,0);
        Dog mydogadd = new Dog(null,null,null,0);
        mydog.animalSound();
        mydog.animalBio();
        mypig.animalSound();
        mypig.animalBio();
        mypigadd.animalname();
        mydogadd.animalname();
        mydog.animalCategory();
        mypig.animalCategory();
    }
}
