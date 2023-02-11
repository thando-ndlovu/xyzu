package androidx.appcompat.widget;


public class AppCompatEditDate
	extends androidx.appcompat.widget.AppCompatEditText
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
		mono.android.Runtime.register ("AndroidX.AppCompat.Widget.AppCompatEditDate, Xyzu.Droid", AppCompatEditDate.class, __md_methods);
	}


	public AppCompatEditDate (android.content.Context p0)
	{
		super (p0);
		if (getClass () == AppCompatEditDate.class)
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.AppCompatEditDate, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public AppCompatEditDate (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == AppCompatEditDate.class)
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.AppCompatEditDate, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public AppCompatEditDate (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == AppCompatEditDate.class)
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.AppCompatEditDate, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
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
