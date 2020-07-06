package aiwa.controller;
import aiwa.database.ShoesTable;
import aiwa.entity.Shoes;

import java.util.ArrayList;
import java.util.Scanner;
import aiwa.model.Shoesmodel;
import aiwa.view.ShoesListView;

public class ShoesListController {
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
             slv.showList(list);
                
                break;
            case 2:System.out.println("input maker");  
            sm.findByMaker(keyword);
              
        
            default:
                break;
        }
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