/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class LabClassMain {
    public static void main(String [] args) {
        
        LabClass miClase = new LabClass(10);
        miClase.setInstructor("Instructor 1");
        miClase.setRoom("Aula 020");
        miClase.setTime("Lunes 10:00");
        Student s1 = new Student("Estudiante Número 1","0001");
        Student s2 = new Student("Estudiante Número 2","0002");
        s1.addCredits(5);
        s2.addCredits(10);
        s1.addCredits(10);        
        s1.changeName("Numevo Nombre");
        System.out.println("LoginName\tFullName");
        System.out.format("%s\t%s\n",s1.getLoginName(),s1.getName());
        System.out.format("%s\t%s\n",s2.getLoginName(),s2.getName());
        
        
        miClase.enrollStudent(s1);
        miClase.enrollStudent(s2);
        System.out.println("===Mi Clase===");
        miClase.printList();
        
    }
    
}
