package crc64e2e781ae34281353;


public class RecyclerViewViewHolderDefault
	extends androidx.recyclerview.widget.RecyclerView.ViewHolder
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("AndroidX.RecyclerView.Widget.RecyclerViewViewHolderDefault, Xyzu.Extensions", RecyclerViewViewHolderDefault.class, __md_methods);
	}


	public RecyclerViewViewHolderDefault (android.view.View p0)
	{
		super (p0);
		if (getClass () == RecyclerViewViewHolderDefault.class)
			mono.android.TypeManager.Activate ("AndroidX.RecyclerView.Widget.RecyclerViewViewHolderDefault, Xyzu.Extensions", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
