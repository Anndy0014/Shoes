package aiwa.database;

import java.util.ArrayList;
import java.util.List;

import aiwa.entity.Shoes;
import aiwa.model.Shoesmodel;
import aiwa.view.ShoesListView;

public class ShoesTable {
    //   public static void main(final String[] args) {
    //       Shoesmodel sm = new Shoesmodel();
    //       sm.findByMaker("nike");
    //       sm.findByID(1);
    //       sm.findByPrice(1000, 3000);
    //       sm.findByColor("black");
    //       ShoesListView sl = new ShoesListView();
    //     //   sl.showList(List);
          
    //   }

      public ArrayList<Shoes> getData() {
          final Shoes s1 = new Shoes();
          s1.setID(1);
          s1.setMaker("nike");
          s1.setColor("Black");
          s1.setPrice(2000);
          s1.setSize(26);

          final Shoes s2 = new Shoes();
          s2.setID(2);
          s2.setMaker("adidas");
          s2.setColor("Black");
          s2.setPrice(2000);
          s2.setSize(26);

          final Shoes s3 = new Shoes();
          s3.setID(3);
          s3.setMaker("dior");
          s3.setColor("Black");
          s3.setPrice(2000);
          s3.setSize(26);

          final Shoes s4 = new Shoes();
          s4.setID(4);
          s4.setMaker("converse");
          s4.setColor("Black");
          s4.setPrice(2000);
          s4.setSize(26);

          final Shoes s5 = new Shoes();
          s5.setID(5);
          s5.setMaker("balenciaga");
          s5.setColor("Black");
          s5.setPrice(2000);
          s5.setSize(26);

          final ArrayList<Shoes> data = new ArrayList<>();
    data.add(s1);
    data.add(s2);
    data.add(s3);
    data.add(s4);
    data.add(s5);
    return data;
}

	public static int size() {
		return 0;
	}

	public static char[] get(int i) {
		return null;
	}
}
