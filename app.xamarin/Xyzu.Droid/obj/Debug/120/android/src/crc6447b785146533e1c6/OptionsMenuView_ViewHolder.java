package crc6447b785146533e1c6;


public class OptionsMenuView_ViewHolder
	extends crc64e2e781ae34281353.RecyclerViewViewHolderDefault
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Views.Option.OptionsMenuView+ViewHolder, Xyzu.Droid", OptionsMenuView_ViewHolder.class, __md_methods);
	}


	public OptionsMenuView_ViewHolder (android.view.View p0)
	{
		super (p0);
		if (getClass () == OptionsMenuView_ViewHolder.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Option.OptionsMenuView+ViewHolder, Xyzu.Droid", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
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
