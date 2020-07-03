package aiwa.model;
import java.util.ArrayList;

import aiwa.database.ShoesTable;
import aiwa.entity.*;
public class Shoesmodel {
    public ArrayList<Shoes> findByMaker(final String keyword){
        //ShoeaTableを呼び出す。
       ShoesTable st = new ShoesTable();
       //ShoeaTableからデータを全部もらう。
       ArrayList<Shoes> data = st.getData();
          for (int i=0;i<ShoesTable.size();i++) {
              System.out.println(ShoesTable.get(i));
          }
       //ArrayList result を用意する。
       ArrayList<Shoes> result = new ArrayList<>();
       //データのmakerをkeywordで検索する。
       //見つかったらresultに追加する。
        return null;

    }
    ArrayList<Shoes> result = new ArrayList<>();
    

}