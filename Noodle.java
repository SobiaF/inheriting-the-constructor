/* Tasks on Codecademy:
1. Tab over to Pho.java and build a constructor for Pho.

Leave the constructor’s parameters blank. Inside the constructor, 
pass the following arguments in the following order to 
super() — the constructor for Noodle:

A lengthInCentimeters of 30.0
A widthInCentimeters of 0.64
A shape of "flat"
ingredients of "rice flour"

2. Tab back over to Noodle.java. Inside main(), 
instantiate a new Pho instance called phoChay.

Now print out phoChay‘s shape. */

class Noodle {
  
  double lengthInCentimeters;
  double widthInCentimeters;
  String shape;
  String ingredients;
  String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public void cook() {
    
    this.texture = "cooked";
    
  }
  
  public static void main(String[] args) {
    Pho phoChay = new Pho();
    System.out.println(phoChay.shape);
    
    
  }
  
}

