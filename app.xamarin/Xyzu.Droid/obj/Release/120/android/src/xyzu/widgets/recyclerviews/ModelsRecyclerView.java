package xyzu.widgets.recyclerviews;


public class ModelsRecyclerView
	extends crc649501fe1f52db7266.LibraryItemsRecyclerView_1
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Widgets.RecyclerViews.ModelsRecyclerView, Xyzu.Droid", ModelsRecyclerView.class, __md_methods);
	}


	public ModelsRecyclerView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ModelsRecyclerView.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.ModelsRecyclerView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public ModelsRecyclerView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ModelsRecyclerView.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.ModelsRecyclerView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ModelsRecyclerView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ModelsRecyclerView.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.ModelsRecyclerView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
