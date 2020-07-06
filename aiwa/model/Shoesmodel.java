package aiwa.model;
import java.util.ArrayList;

import aiwa.database.ShoesTable;
import aiwa.entity.Shoes;
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
          
    //    keyword="";
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
        return result;

        
            }
            public ArrayList<Shoes> findByColor(String keyword){
                ShoesTable st = new ShoesTable();
                ArrayList<Shoes> data = st.getData();
                ArrayList<Shoes> result = new ArrayList<>();
    
                for(int i = 0; i< data.size();i++){
                    Shoes s = data.get(i);
                    String color = s.getColor();
                    if(color.contains(keyword)){
                        result.add(s);
                    }
                }
                for (int i = 0; i < result.size(); i++) {
                 Shoes s = result.get(i);
                 System.out.println(s.getColor());
             }
             return result;
        }
        public ArrayList<Shoes> findByPrice(int min, int max){
            ShoesTable st = new ShoesTable();
                ArrayList<Shoes> data = st.getData();
                ArrayList<Shoes> result = new ArrayList<>();
    
                for(int i = 0; i< data.size();i++){
                    Shoes s = data.get(i);
                    double price = s.getPrice();
                    if(price>min && price <= max ){
                        result.add(s);
                    }
                }
                return result;
        }

        public Shoes findByID(int id){
            ShoesTable st = new ShoesTable();
            ArrayList<Shoes> data = st.getData();
            for(int i =0; i< data.size();i++){
                Shoes s = data.get(i);   
            if(s.getID()==id){
               return s;
            }
            }
            return null;
        }
    }


    
    
    

