package xyzu.views.insets;


public class StatusBarInsetView
	extends xyzu.views.insets.InsetView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.Views.Insets.StatusBarInsetView, Xyzu.Droid", StatusBarInsetView.class, __md_methods);
	}


	public StatusBarInsetView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == StatusBarInsetView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Insets.StatusBarInsetView, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public StatusBarInsetView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == StatusBarInsetView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Insets.StatusBarInsetView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public StatusBarInsetView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == StatusBarInsetView.class)
			mono.android.TypeManager.Activate ("Xyzu.Views.Insets.StatusBarInsetView, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


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
