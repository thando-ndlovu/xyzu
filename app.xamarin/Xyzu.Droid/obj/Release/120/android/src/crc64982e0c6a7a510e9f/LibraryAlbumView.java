package crc64982e0c6a7a510e9f;


public class LibraryAlbumView
	extends crc64982e0c6a7a510e9f.LibraryView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Xyzu.Views.Library.LibraryAlbumView, Xyzu.Droid", LibraryAlbumView.class, __md_methods);
	}


	public LibraryAlbumView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == LibraryAlbumView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Library.LibraryAlbumView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public LibraryAlbumView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == LibraryAlbumView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Library.LibraryAlbumView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
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
