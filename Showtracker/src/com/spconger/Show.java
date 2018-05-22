package com.spconger;

import java.util.ArrayList;

public class Show {
  private String showName;
  private String showDate;
  private String venue;
  private String showTime;
  private ArrayList<Artist> artists;
  private boolean restricted;
  private String ticketInfo;
 
  public Show (){
	  artists=new ArrayList<Artist>();
  }
  
public String getShowName() {
	return showName;
}
public void setShowName(String showName) {
	this.showName = showName;
}
public String getShowDate() {
	return showDate;
}
public void setShowDate(String showDate) {
	this.showDate = showDate;
}
public String getVenue() {
	return venue;
}
public void setVenue(String venue) {
	this.venue = venue;
}
public String getShowTime() {
	return showTime;
}
public void setShowTime(String showTime) {
	this.showTime = showTime;
}
public boolean isRestricted() {
	return restricted;
}
public void setRestricted(boolean restricted) {
	this.restricted = restricted;
}
public String getTicketInfo() {
	return ticketInfo;
}
public void setTicketInfo(String ticketInfo) {
	this.ticketInfo = ticketInfo;
}

public void AddArtist(Artist a){
	artists.add(a);
}
 
public String toString(){
   String showInfo=getShowName() + "\n" + getVenue() + "\n"
+ getShowDate() + " " + getShowTime()
   + "\n" + getTicketInfo() + "\n";
   
   for(Artist a : artists){
	   showInfo += a.getArtistName() + "\n";
   }
   return showInfo;
}
}
