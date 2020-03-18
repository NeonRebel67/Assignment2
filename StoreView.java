package tryMVC;

import java.awt.*;
import javax.swing.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

public class StoreView extends JPanel implements Observer {
	
	
	public void printStoreDetails(Store store){
		ArrayList<Customer> customerList;

		System.out.println("Store: ");
		System.out.println("Name: " + store.getName());

		// Displaying the customer list
	    // Create an iterator for the list using iterator() method 
        
		customerList = store.getCustomers();
		Iterator<Customer> iter = customerList.iterator();
  
        // Displaying the values after iterating through the list 
        /*
        System.out.println("\nThe Customer names are:");
        while (iter.hasNext()) { 
            System.out.println(iter.next().getName() + " "); 
        }
        */

        Frame frame = new Frame();
        frame.add(new Box());
        frame.setSize(200,200);
        frame.setVisible(true);
        JLabel a = new JLabel("New Customer!");
        frame.add(a);
    }

    static class Box extends Component {
        public void paint(Graphics x) {
            Graphics2D y = (Graphics2D)x;
            y.drawRect(0, 0, getSize().width-1, getSize().height-1);
        }
	}

	@Override
	public void update(Observable observable, Object o) {
	}
}

