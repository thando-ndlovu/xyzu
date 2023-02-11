package crc649501fe1f52db7266;


public abstract class LibraryItemsRecyclerView_Adapter
	extends androidx.recyclerview.widget.RecyclerView.Adapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getItemViewType:(I)I:GetGetItemViewType_IHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter, Xyzu.Droid", LibraryItemsRecyclerView_Adapter.class, __md_methods);
	}


	public LibraryItemsRecyclerView_Adapter ()
	{
		super ();
		if (getClass () == LibraryItemsRecyclerView_Adapter.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}

	public LibraryItemsRecyclerView_Adapter (crc649501fe1f52db7266.LibraryItemsRecyclerView p0)
	{
		super ();
		if (getClass () == LibraryItemsRecyclerView_Adapter.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter, Xyzu.Droid", "Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView, Xyzu.Droid", this, new java.lang.Object[] { p0 });
	}


	public int getItemViewType (int p0)
	{
		return n_getItemViewType (p0);
	}

	private native int n_getItemViewType (int p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
