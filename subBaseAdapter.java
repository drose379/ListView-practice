package dylanrose60.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.content.Context;

/*
	* BaseAdapter is an abstract class that has methods to connect content to a Listview
	* Since SubBaseAdapter extends BaseAdapter which is an abstract class that implements listView and Adapter interface, it can use -
	* some of the methods found in the interfaces that BaseAdapter implements
*/

class SubBaseAdapter extends BaseAdapter {

	/*
		* A LayoutInflater is used to take the XML file and create a display out of it (--Used in getView() method--)
	*/
	protected LayoutInflater inflater;
	protected String[] listData;

	/*
		* The SubBaseAdapter class is passed Context -where the LayoutInflater can create a view- and the data to use.
		* The LayoutInflater uses the -.from()- method to get the Layout from a given context
	*/
	public SubBaseAdapter(Context context,String[] listArray) {
		inflater = LayoutInflater.from(context);
		listData = listArray;
	}

	/*
		* @Override means that this method OverRides one that is already defined by the interface
		* This method is used to return the number of entries in the data set given to the adapter.
	*/
	@Override
	public int getCount() {
		return listData.length;
	}

	/*
		* getView is used to form the listView out of the data set
		* It gets passed 3 parameters: 

			* Integer (position): used to navigate through the array of data that is passed in. EX: array[position]

			* View (recycledView): If this method is called more then once and a View has already been inflated, the same View will be used - 
				* instead of Creating a new one. If recycledView is null, a new one needs to be -inflated-

			* ViewGroup (parent): The ViewGroup class creates a view that allows other views to be attached to it (The multiple TextViews) - 
				* The inflate() method adds the R.layout.text_layout on top of the parent layout (R.layout.test_layout)
	*/
	@Override
	public View getView(int position,View recycledView,ViewGroup parent) {
		View view;

		if (recycledView == null) {
			view = inflater.inflate(R.layout.text_layout,parent,false);
		} else {
			view = recycledView;
		}

		TextView tx = (TextView) view;
		tx.setText(listData[position]);
		return tx;

	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}




}