package de.mariusklingl.wohnheim;

public class Student {
    
    String name;
    String studyProgram;

    public Student(String name, String studyProgram){
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    

}
