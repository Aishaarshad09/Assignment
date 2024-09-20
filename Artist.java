public class Artist{

private String name;
Artist(){
this.name="Aisha";

}
 public Artist(String name){

 this.name=name;
}

public void setName(String name){
this.name=name;

}

public String getName(){
 return name;
}
public void display(){
System.out.println("The name of title is"+name);

}
Artist(Artist other){
   this.name=other.name;


}



















}