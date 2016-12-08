package presentation.controller;



import javax.swing.*;

import presentation.ReserveHotel;
import presentation.ReserveHotelController;
import presentation.UserSearchOrder;
import presentation.UserSearchOrderCotroller;

/**
 * Created by huihantao on 2016/11/17.
 */
public class controller {
    private JPanel view;

    private JFrame frame;


    public controller(JFrame frame){
        this.frame=frame;
        this.login();

    }
    public void login(){
        frame.getContentPane().removeAll();
        frame.repaint();


        ReserveHotelController reshotcon=new ReserveHotelControllerimpl();
        this.view=new ReserveHotel(reshotcon);
        reshotcon.setcon(this);
        frame.getContentPane().add(this.view);
        frame.setVisible(true);
        System.out.println("seg");
        
        
        System.out.println("seg");
        reshotcon.setview((ReserveHotel) this.view);

    }
    
    public void  search(){
    	frame.getContentPane().removeAll();
        frame.repaint();


        UserSearchOrderCotroller reshotcon=new UserSearchOrderCotrollerimpl();
        this.view=new UserSearchOrder(reshotcon);
        frame.getContentPane().add(this.view);
        frame.setVisible(true);
//        reshotcon.setcon(this);
//        reshotcon.setview((ReserveHotel) this.view);
    }


// decision
 

}