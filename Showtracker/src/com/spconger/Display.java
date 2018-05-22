package com.spconger;
import java.util.Scanner;

public class Display {
    Show show = new Show();
    Scanner scan;
    public Display(){
    	scan= new Scanner(System.in);
    	setShowAttributes();
      	addArtists();
      	displayShow();
    }
    
    private void setShowAttributes(){
    	System.out.println("Enter the show name");
    	show.setShowName(scan.nextLine());
    	
    	System.out.println("Enter the Venue");
    	show.setVenue(scan.nextLine());
    	
    	System.out.println("Enter the Date");
    	show.setShowDate(scan.nextLine());
    	
    	System.out.println("Enter the show time");
    	show.setShowTime(scan.nextLine());
    	
    	show.setRestricted(false);
    	
    	System.out.println("Enter Ticket Info");
    	show.setTicketInfo(scan.nextLine());
        
    }
    
    private void addArtists(){
    	System.out.println("How many artists do you want to add");
    	int number=scan.nextInt();
    	scan.nextLine();
    	for (int i=0;i<number;i++)
    	{
    		Artist a = new Artist();
    		System.out.println("Enter the ArtisName");
       		a.setArtistName(scan.nextLine());
       		show.AddArtist(a);
    	}
    }
    
    private void displayShow(){
    	System.out.println(show.toString());
    }
     
    
    
    
}
