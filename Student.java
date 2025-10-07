/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sabijonqueuelinkedlist;

/**
 *
 * @author User
 */
public class Student {
    public int id;
    public String name;
    public String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return """
               Student: 
               id: """ + id + "\nname: " + name + "\nprogram: " + program;
    }
    
    
}
