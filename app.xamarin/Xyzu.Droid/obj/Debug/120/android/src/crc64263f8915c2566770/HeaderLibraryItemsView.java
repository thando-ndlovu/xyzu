package crc64263f8915c2566770;


public class HeaderLibraryItemsView
	extends crc64263f8915c2566770.HeaderView
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
		mono.android.Runtime.register ("Xyzu.Views.LibraryItem.Header.HeaderLibraryItemsView, Xyzu.Droid", HeaderLibraryItemsView.class, __md_methods);
	}


	public HeaderLibraryItemsView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == HeaderLibraryItemsView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.Header.HeaderLibraryItemsView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public HeaderLibraryItemsView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == HeaderLibraryItemsView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.Header.HeaderLibraryItemsView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public HeaderLibraryItemsView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == HeaderLibraryItemsView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.Header.HeaderLibraryItemsView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public HeaderLibraryItemsView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == HeaderLibraryItemsView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.Header.HeaderLibraryItemsView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
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
