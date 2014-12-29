package dylanrose60.listview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);

        String[] theArray = {"The Rolling Stones", "CCR", "Grateful Dead","The Doors"};

        /*
            * SubBaseAdapter is a class that extends the BaseAdapter class
            * The Adapter connects the array of info to the ListView so it can be shown on the page
            * SubBaseAdpater needs to be passed the CONTEXT and the DATA
            * CONTEXT of "This" is given to the adapter, which allows the adapter to create a -view- within this activity
            * The CONTEXT's XML layout -must- contain a ListView element that is called when instantiating a new ListView object
        */
        SubBaseAdapter adapter = new SubBaseAdapter(this,theArray);

        /*
            * ListView gets all of the elements from the array defined above and populates a list
            * Grab the ListView XML element by its ID to say thats where the Items will be inside
        */
        ListView theListView = (ListView) findViewById(R.id.list2);

        /*
            * theListView is a listView and it needs to be supplied an adapter to connect it to content
            * setAdapter is a method that attaches the adapter to the Listview.
            * When the adapter is attached to the listView, the listView calls all of the necessary classes from the adapter.
            * And the List is displayed with the proper content
        */
        theListView.setAdapter(adapter);

        }


}


