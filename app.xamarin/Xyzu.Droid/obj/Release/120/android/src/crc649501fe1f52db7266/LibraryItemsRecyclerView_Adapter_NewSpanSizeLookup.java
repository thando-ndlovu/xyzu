package crc649501fe1f52db7266;


public class LibraryItemsRecyclerView_Adapter_NewSpanSizeLookup
	extends androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getSpanSize:(I)I:GetGetSpanSize_IHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter+NewSpanSizeLookup, Xyzu.Droid", LibraryItemsRecyclerView_Adapter_NewSpanSizeLookup.class, __md_methods);
	}


	public LibraryItemsRecyclerView_Adapter_NewSpanSizeLookup ()
	{
		super ();
		if (getClass () == LibraryItemsRecyclerView_Adapter_NewSpanSizeLookup.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter+NewSpanSizeLookup, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public int getSpanSize (int p0)
	{
		return n_getSpanSize (p0);
	}

	private native int n_getSpanSize (int p0);

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
