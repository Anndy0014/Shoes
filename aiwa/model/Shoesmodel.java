package aiwa.model;
import java.util.ArrayList;

import aiwa.database.ShoesTable;
import aiwa.entity.*;
public class Shoesmodel {
public static void main(String[] args) {
    
}
    public ArrayList<Shoes> findByMaker( String keyword){
        //ShoesTableを呼び出す。
       ShoesTable st = new ShoesTable();

       //ShoesTableからデータを全部もらう。
       ArrayList<Shoes> data = st.getData();

       //ArrayList result を用意する。
       ArrayList<Shoes> result = new ArrayList<>();
          
       keyword="adias";
       //データのmakerをkeywordで検索する。
       for(int i = 0; i< data.size();i++){
           Shoes s = data.get(i);
           String maker = s.getMaker();
           if(maker.contains(keyword)){
               result.add(s);
           }
       }
       for (int i = 0; i < result.size(); i++) {
        Shoes s = result.get(i);
        System.out.println(s.getMaker());
    }
       //見つかったらresultに追加する。
        return null;

    }
    
    

}