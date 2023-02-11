package xyzu.widgets.recyclerviews;


public class SimpleVerticalRecyclerView
	extends crc649501fe1f52db7266.SimpleRecyclerView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Widgets.RecyclerViews.SimpleVerticalRecyclerView, Xyzu.Droid", SimpleVerticalRecyclerView.class, __md_methods);
	}


	public SimpleVerticalRecyclerView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == SimpleVerticalRecyclerView.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.SimpleVerticalRecyclerView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public SimpleVerticalRecyclerView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == SimpleVerticalRecyclerView.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.SimpleVerticalRecyclerView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public SimpleVerticalRecyclerView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == SimpleVerticalRecyclerView.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.SimpleVerticalRecyclerView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
