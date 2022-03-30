package de.mariusklingl.wohnheim;

import java.util.ArrayList;

public class Wohnheim {
    ArrayList<WG> listeWGs;
    
    public Wohnheim(){
        WG wg1 = new WG();
        listeWGs.add(wg1);
    }

    public Wohnheim(ArrayList<WG> liste){
        listeWGs = liste;
    }

    public ArrayList<String> getAlleWohnenden(){
        ArrayList<String> alleWohnende = new ArrayList<>();
        listeWGs.forEach((wg) ->wg.listeStudenten.forEach((student) -> alleWohnende.add(student.getName())));
        return alleWohnende;
    }

    


}
