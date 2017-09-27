/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsb2.cafe;

/**
 *
 * @author Mushaf Ali
 */
public class staticstuff {
    public static listofdish obj = new listofdish();
    public static int[] seld = new int[15];
    public static int[] cookcd = {0,0,0,0};
    public static int[] cookt = {0,0,0,0};
    public static int price = 0;
    public static int totaltime = 0;
    public static int startt=0;
    public static int endt=0;
    public static int kms=0;
    public static String address;
    public static char delivery = 'x';
    public staticstuff(){
        
    }
    public static int maxcook()
    {
        int maxi = -1;
        int max = -1;
        for (int i=0;i<4;i++)
        {
            if (cookt[i]>max)
            {
                max = cookt[i];
                maxi = i;
            }
        }
        return maxi;
    }
    public static void resetall(){
        for (int i=0;i<15;i++)
        {
            seld[i]=0;
        }
        delivery = 'x';
        price = 0;
        totaltime=0;
        startt=0;
        endt=0;
        kms=0;
        address="Cafe-one NUST";
        dishes d = new dishes("Chinese Rice",200,9);
        obj.list.add(d);
        d.add("Biryani",150,9);
         obj.list.add(d);
        d.add("Pulao",200,9);
         obj.list.add(d);
        d.add("Chicken pizza",500,8);
         obj.list.add(d);
        d.add("Qorma",120,8);
         obj.list.add(d);
        d.add("Nihari",300,9);
         obj.list.add(d);
        d.add("Fruit Chat",70,3);
         obj.list.add(d);
        d.add("Channa chat",50,1);
         obj.list.add(d);
        d.add("Pasta",80,2);
         obj.list.add(d);
        d.add("Russian Salad",100,2);
         obj.list.add(d);
        d.add("Chicken Soup",270,3);
         obj.list.add(d);
        d.add("Veg Soup",150,3);
         obj.list.add(d);
        d.add("Oreo Shake",70,2);
         obj.list.add(d);
        d.add("Shwarma",100,1);
         obj.list.add(d);
        d.add("Roll Paratha",150,2);
         obj.list.add(d);
    }
    public static void minust(){
        int t=endt-startt;
        for (int i=0;i<4;i++)
        {
            cookcd[i]-=t;
            cookt[i]-=t;
            if (cookcd[i]<0)
            {
                cookcd[i]=0;
            }
            if (cookt[i]<0)
            {
                cookt[i]=0;
            }
        }
    }
}
