import java.persistance.*; 
@Entity
@Table(name = "students")
public class Student{
    @Id; 
    @GenerateValue(strategy=GenerateType.IDENTITY);
    private int id; 
    private String name;
    private int age;

    public int getid(){
        return id; 
    }
    public int setId(int id){
        this.id=id; 
    }
    public String getname(){
        return name; 
    }
    public void setName(String name){
        this.name=name; 
    }
    public int getAge(){
        return age; 
    }
}