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