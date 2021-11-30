package newfeatures;



import java.time.LocalDate;



//Java 8 allow to add functionality in interphase
interface Parser{



default void parse(){
System.out.println("default Parsing logic");
}
static void displayDate()
{System.out.println(LocalDate.now());
}
}
class TextParser implements Parser
{
// inherit or implement of parser
void display()
{
System.out.println("Meathod in the TexterParser");
}


}



class XMLParser implements Parser
{//overriden meathod
public void parse()
{
System.out.println("parsing XML");
}



}
public class DefaultMeathodDemo2 {



public static void main(String[] args) {
{Parser p=new TextParser();//upcasting
p.parse();//default Meathod in interfase

TextParser p1=new TextParser();
p1.display();//call there perticular methoda

p=new XMLParser();
p.parse();//overriden meathod

System.out.println("program executed on:");
Parser.displayDate();// invoke st meathod atic

}



}



}