package crc649501fe1f52db7266;


public class LibraryItemsRecyclerView_Adapter_1
	extends crc649501fe1f52db7266.LibraryItemsRecyclerView_Adapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getItemCount:()I:GetGetItemCountHandler\n" +
			"n_onViewAttachedToWindow:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V:GetOnViewAttachedToWindow_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onViewDetachedFromWindow:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V:GetOnViewDetachedFromWindow_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_Handler\n" +
			"n_onBindViewHolder:(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V:GetOnBindViewHolder_Landroidx_recyclerview_widget_RecyclerView_ViewHolder_IHandler\n" +
			"n_onCreateViewHolder:(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;:GetOnCreateViewHolder_Landroid_view_ViewGroup_IHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter`1, Xyzu.Droid", LibraryItemsRecyclerView_Adapter_1.class, __md_methods);
	}


	public LibraryItemsRecyclerView_Adapter_1 ()
	{
		super ();
		if (getClass () == LibraryItemsRecyclerView_Adapter_1.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter`1, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}

	public LibraryItemsRecyclerView_Adapter_1 (crc649501fe1f52db7266.LibraryItemsRecyclerView p0)
	{
		super ();
		if (getClass () == LibraryItemsRecyclerView_Adapter_1.class)
			mono.android.TypeManager.Activate ("Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView+Adapter`1, Xyzu.Droid", "Xyzu.Widgets.RecyclerViews.LibraryItemsRecyclerView, Xyzu.Droid", this, new java.lang.Object[] { p0 });
	}


	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();


	public void onViewAttachedToWindow (androidx.recyclerview.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewAttachedToWindow (p0);
	}

	private native void n_onViewAttachedToWindow (androidx.recyclerview.widget.RecyclerView.ViewHolder p0);


	public void onViewDetachedFromWindow (androidx.recyclerview.widget.RecyclerView.ViewHolder p0)
	{
		n_onViewDetachedFromWindow (p0);
	}

	private native void n_onViewDetachedFromWindow (androidx.recyclerview.widget.RecyclerView.ViewHolder p0);


	public void onBindViewHolder (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1)
	{
		n_onBindViewHolder (p0, p1);
	}

	private native void n_onBindViewHolder (androidx.recyclerview.widget.RecyclerView.ViewHolder p0, int p1);


	public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder (android.view.ViewGroup p0, int p1)
	{
		return n_onCreateViewHolder (p0, p1);
	}

	private native androidx.recyclerview.widget.RecyclerView.ViewHolder n_onCreateViewHolder (android.view.ViewGroup p0, int p1);

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
