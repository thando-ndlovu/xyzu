package xyzu.widgets.recyclerviews;


public class RecursiveItemsRecyclerView_LayoutManager
	extends androidx.recyclerview.widget.GridLayoutManager
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayoutChildren:(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V:GetOnLayoutChildren_Landroidx_recyclerview_widget_RecyclerView_Recycler_Landroidx_recyclerview_widget_RecyclerView_State_Handler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Widgets.RecyclerViews.RecursiveItemsRecyclerView+LayoutManager, Xyzu.Droid", RecursiveItemsRecyclerView_LayoutManager.class, __md_methods);
	}


	public RecursiveItemsRecyclerView_LayoutManager (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == RecursiveItemsRecyclerView_LayoutManager.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.RecursiveItemsRecyclerView+LayoutManager, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public RecursiveItemsRecyclerView_LayoutManager (android.content.Context p0, int p1)
	{
		super (p0, p1);
		if (getClass () == RecursiveItemsRecyclerView_LayoutManager.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.RecursiveItemsRecyclerView+LayoutManager, Xyzu.Droid", "Android.Content.Context, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public RecursiveItemsRecyclerView_LayoutManager (android.content.Context p0, int p1, int p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == RecursiveItemsRecyclerView_LayoutManager.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.RecursiveItemsRecyclerView+LayoutManager, Xyzu.Droid", "Android.Content.Context, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onLayoutChildren (androidx.recyclerview.widget.RecyclerView.Recycler p0, androidx.recyclerview.widget.RecyclerView.State p1)
	{
		n_onLayoutChildren (p0, p1);
	}

	private native void n_onLayoutChildren (androidx.recyclerview.widget.RecyclerView.Recycler p0, androidx.recyclerview.widget.RecyclerView.State p1);

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
