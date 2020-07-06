package aiwa.view;
import aiwa.entity.Shoes;
import aiwa.model.Shoesmodel;

import java.util.ArrayList;
import java.util.Scanner;


public class ShoesListView {
      public void showList(ArrayList<Shoes> list){
          for(int i = 0; i<list.size();i++){
          Shoes s = list.get(i);
          System.out.println("========================");
          System.out.println("ID:"+s.getID());
          System.out.println("Maker:"+s.getMaker());
          System.out.println("Color:"+s.getColor());
          System.out.println("Price"+s.getPrice());
          System.out.println("Size:"+s.getSize());
          }
          if(list.size()==0){
              System.out.println("null");
          }else{
              System.out.println(list.size()+"ken");
          }
      }

	public static void main(String[] args) {
	    Scanner s1 = new Scanner(System.in);
	    Scanner s2 = new Scanner(System.in);
	    int num = s2.nextInt();
	    ShoesListView slv = new ShoesListView();
	    // slv.showList(list);
	    String keyword = s1.nextLine();
	    int min = s2.nextInt();
	    int max = s2.nextInt();
	    Shoesmodel sm = new Shoesmodel();
	    switch (num) {
	        case 1: System.out.println("input price");
	        ArrayList<Shoes> list = sm.findByPrice(min,max);
            
            break;
	        case 2:System.out.println("input maker");  
	        sm.findByMaker(keyword);
	        
            
            
	        default:
            break;
	    }
        slv.showList(list);
	    // System.out.println("キーワードを入力してください。");
	    // System.out.println("input price");
	    // int min = s2.nextInt();
	    // int max = s2.nextInt();
	    // String keyword = s1.nextLine();
	    // Shoesmodel sm = new Shoesmodel();
	    // // ArrayList<Shoes> list = sm.findByMaker(keyword);
	    // ArrayList<Shoes> list = sm.findByPrice(min,max);
	
	
	    // ShoesListView slv = new ShoesListView();
	    // slv.showList(list);
	
	    
	
	
	}
    
}