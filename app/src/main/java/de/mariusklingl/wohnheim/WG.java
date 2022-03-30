package de.mariusklingl.wohnheim;

import java.util.ArrayList;

public class WG {

    int maxAnzahl; 
    ArrayList<Student> listeStudenten;

    public WG(){
        maxAnzahl = 1;
        listeStudenten = new ArrayList<Student>();
    }

    public WG(int maxAnzahl){
        this.maxAnzahl = maxAnzahl;
    }

   
    public ArrayList<Student> getListeStudenten() {
        return listeStudenten;
    }

    public ArrayList<String> getWohnende(){
        ArrayList<String> wohnende = new ArrayList<String>();
        listeStudenten.forEach((student)->wohnende.add(student.getName()));
        return wohnende;
    }


    public void addStudent(Student student){

        int listeSize = listeStudenten.size();
        if(listeSize >= maxAnzahl){
            System.out.println("WG voll");
        }else{
            listeStudenten.add(student);
            System.out.println("Student hinzugefügt");
        }
    }







    
    
}
