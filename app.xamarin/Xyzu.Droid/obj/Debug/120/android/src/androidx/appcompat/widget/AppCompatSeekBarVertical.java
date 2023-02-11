package androidx.appcompat.widget;


public class AppCompatSeekBarVertical
	extends androidx.appcompat.widget.AppCompatSeekBar
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getProgress:()I:GetGetProgressHandler\n" +
			"n_setProgress:(I)V:GetSetProgress_IHandler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"";
		mono.android.Runtime.register ("AndroidX.AppCompat.Widget.AppCompatSeekBarVertical, Xyzu.Droid", AppCompatSeekBarVertical.class, __md_methods);
	}


	public AppCompatSeekBarVertical (android.content.Context p0)
	{
		super (p0);
		if (getClass () == AppCompatSeekBarVertical.class)
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.AppCompatSeekBarVertical, Xyzu.Droid", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public AppCompatSeekBarVertical (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == AppCompatSeekBarVertical.class)
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.AppCompatSeekBarVertical, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public AppCompatSeekBarVertical (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == AppCompatSeekBarVertical.class)
			mono.android.TypeManager.Activate ("AndroidX.AppCompat.Widget.AppCompatSeekBarVertical, Xyzu.Droid", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public int getProgress ()
	{
		return n_getProgress ();
	}

	private native int n_getProgress ();


	public void setProgress (int p0)
	{
		n_setProgress (p0);
	}

	private native void n_setProgress (int p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);

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
