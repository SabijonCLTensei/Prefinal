/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sabijonqueuelinkedlist;

/**
 *
 * @author User
 */
public class SabijonQueueLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student(1234, "Anya", "BSIT");
        st.setId(4323);
        st.setProgram("BSIT");
        System.out.println(st.getName());
        st.setName("arnold");
        System.out.println(st.getName());
        System.out.println(st.toString());
    }
    
}
