package crc649501fe1f52db7266;


public class LibraryItemsRecyclerView_ViewHolder
	extends crc64e2e781ae34281353.RecyclerViewViewHolderDefault
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+ViewHolder, Xyzu.Droid", LibraryItemsRecyclerView_ViewHolder.class, __md_methods);
	}


	public LibraryItemsRecyclerView_ViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == LibraryItemsRecyclerView_ViewHolder.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+ViewHolder, Xyzu.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
