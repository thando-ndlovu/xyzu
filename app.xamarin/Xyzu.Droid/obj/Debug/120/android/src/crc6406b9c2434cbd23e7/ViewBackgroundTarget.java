package crc6406b9c2434cbd23e7;


public class ViewBackgroundTarget
	extends crc6406b9c2434cbd23e7.XyzuPicassoViewTarget
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Square.Picasso.ViewBackgroundTarget, Xyzu.Droid", ViewBackgroundTarget.class, __md_methods);
	}


	public ViewBackgroundTarget ()
	{
		super ();
		if (getClass () == ViewBackgroundTarget.class)
			mono.android.TypeManager.Activate ("Square.Picasso.ViewBackgroundTarget, Xyzu.Droid", "", this, new java.lang.Object[] {  });
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
