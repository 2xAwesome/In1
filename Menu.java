package edu.sysvp.program;

import edu.sysvp.program.ClubHelper;
import com.sandklef.edu.ConsoleMenu.*;

public class Menu {
    
    ClubHelper ch ;
    
    public Menu(ClubHelper c) {
	ch = c;
    }

    public void run() {

   	ConsoleMenu menu = new ConsoleMenu("-----===< Club Manager >===-----");

	//0	
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembers(); } 
	    },"List members" );
	//1
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersAlpha(); } 
	    },"List members in Alphabetical order by last name" );
	    
	//2    	
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersAlphaFirstName(); } 
	    },"List members in Alphabetical order by first name" );
	    
	//3 
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMembersId(); } 
	    },"List members by id" ); 
	    
	//4
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    ch.printMemberTeamOrder(); } 
	    },"List members by team" ); 
	
	//5
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter team: ");
		    //String search = "%" + input.trim() + "%";
		    String search = input.trim();
		    ch.printTeamMembers(search); 
		}
	    },"Search for members in team" ); 

	//6
	/*menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter team: ");
		    String search = input.trim();
		    ch.printTeamParents(search); 
		}
	    },"Search for parents in team" ); */
	    
	//7
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"Search for member" );

	//8
	menu.addMenuItem(new MenuItem(){
		public void menuItemSelected(ConsoleMenuEvent e) { 
		    String input = ch.askUser("Enter search string, Bob Dylan: ");
		    String search = "%" + input.trim() + "%";
		    ch.printMembers(search); 
		}
	    },"One more coffee" );

	menu.run();
    }

}
