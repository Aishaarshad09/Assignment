public class Testmain {

public static void main (String args[]){

 Artist A1=new Artist("Noor");
A1.display();
 Artwork a1=new Artwork("My Book",2024,A1);
a1.display();
Artwork a2=new Artwork(a1);//deep copy
a2.display();
a2.setTitle("My Place");
Artwork a3 = a2;// shallow copy 
a3.setYear(2019);
a3.display();
a2.display();






















}



















}
