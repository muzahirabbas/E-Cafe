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
public class dishes {
    public int price;
    public String name;
    public int time;
    dishes(String y,int x,int z)//name-price-time
    {
        name = y;
        price =x;
        time =z;
    }
    void add(String y,int x,int z)//name-price-time
    {
        name = y;
        price =x;
        time =z;
    }
}
