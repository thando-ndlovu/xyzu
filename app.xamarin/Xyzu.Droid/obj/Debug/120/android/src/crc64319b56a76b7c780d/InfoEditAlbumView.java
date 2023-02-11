package crc64319b56a76b7c780d;


public class InfoEditAlbumView
	extends crc64319b56a76b7c780d.InfoEditView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Views.InfoEdit.InfoEditAlbumView, Xyzu.Droid", InfoEditAlbumView.class, __md_methods);
	}


	public InfoEditAlbumView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == InfoEditAlbumView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.InfoEdit.InfoEditAlbumView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public InfoEditAlbumView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == InfoEditAlbumView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.InfoEdit.InfoEditAlbumView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public InfoEditAlbumView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == InfoEditAlbumView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.InfoEdit.InfoEditAlbumView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public InfoEditAlbumView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == InfoEditAlbumView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.InfoEdit.InfoEditAlbumView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();

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
