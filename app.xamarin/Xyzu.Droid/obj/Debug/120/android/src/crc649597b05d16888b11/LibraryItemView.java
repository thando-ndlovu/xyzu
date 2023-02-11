package crc649597b05d16888b11;


public class LibraryItemView
	extends androidx.constraintlayout.widget.ConstraintLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_isSelected:()Z:GetIsSelectedHandler\n" +
			"n_setSelected:(Z)V:GetSetSelected_ZHandler\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Views.LibraryItem.LibraryItemView, Xyzu.Droid", LibraryItemView.class, __md_methods);
	}


	public LibraryItemView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == LibraryItemView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.LibraryItemView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public LibraryItemView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == LibraryItemView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.LibraryItemView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public LibraryItemView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == LibraryItemView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.LibraryItemView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public LibraryItemView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == LibraryItemView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.LibraryItem.LibraryItemView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public boolean isSelected ()
	{
		return n_isSelected ();
	}

	private native boolean n_isSelected ();


	public void setSelected (boolean p0)
	{
		n_setSelected (p0);
	}

	private native void n_setSelected (boolean p0);


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();

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
