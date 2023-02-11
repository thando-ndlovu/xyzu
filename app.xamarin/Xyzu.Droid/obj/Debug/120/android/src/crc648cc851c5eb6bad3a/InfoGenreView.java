package crc648cc851c5eb6bad3a;


public class InfoGenreView
	extends crc648cc851c5eb6bad3a.InfoView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Views.Info.InfoGenreView, Xyzu.Droid", InfoGenreView.class, __md_methods);
	}


	public InfoGenreView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == InfoGenreView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Info.InfoGenreView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public InfoGenreView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == InfoGenreView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Info.InfoGenreView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public InfoGenreView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == InfoGenreView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Info.InfoGenreView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public InfoGenreView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == InfoGenreView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Info.InfoGenreView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
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
