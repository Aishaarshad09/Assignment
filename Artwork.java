public class Artwork{
private String title;
private int year;
private Artist A;


public Artwork(String title,int year, Artist A){
 this.title=title;
  this.year=year;
  this.A=new Artist();


}
public Artwork(Artist obj){
    this.title=title;
  this.A=new Artist(obj.A);

}


public Artwork(String title,int year){
this.title=title;
this.year=year;


}
public void setTitle(String title){

   this.title=title;
   }

public String  getTitle(){

    return title;
   }


public void setYear(int year){

   this.year=year;
   }


public int  getYear(){

    return year;
   }
public void setArtist(Artist A){
   this.A=new Artist();
   }
public Artist getA(){

   return A;


}
public void display(){
    System.out.println("The title of the Artwork is"+title);
System.out.println("The year of the Artwork is"+year);
System.out.println(A.getName());






}



































}