package crc647c2b7774bea48194;


public class XyzuGlideViewTarget
	extends com.bumptech.glide.request.target.CustomViewTarget
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLoadFailed:(Landroid/graphics/drawable/Drawable;)V:GetOnLoadFailed_Landroid_graphics_drawable_Drawable_Handler\n" +
			"n_onResourceReady:(Ljava/lang/Object;Lcom/bumptech/glide/request/transition/Transition;)V:GetOnResourceReady_Ljava_lang_Object_Lcom_bumptech_glide_request_transition_Transition_Handler\n" +
			"n_onResourceCleared:(Landroid/graphics/drawable/Drawable;)V:GetOnResourceCleared_Landroid_graphics_drawable_Drawable_Handler\n" +
			"";
		mono.android.Runtime.register ("Bumptech.Glide.Request.Target.XyzuGlideViewTarget, Xyzu.Droid", XyzuGlideViewTarget.class, __md_methods);
	}


	public XyzuGlideViewTarget (android.view.View p0)
	{
		super (p0);
		if (getClass () == XyzuGlideViewTarget.class)
			mono.android.TypeManager.Activate ("Bumptech.Glide.Request.Target.XyzuGlideViewTarget, Xyzu.Droid", "Java.Lang.Object, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onLoadFailed (android.graphics.drawable.Drawable p0)
	{
		n_onLoadFailed (p0);
	}

	private native void n_onLoadFailed (android.graphics.drawable.Drawable p0);


	public void onResourceReady (java.lang.Object p0, com.bumptech.glide.request.transition.Transition p1)
	{
		n_onResourceReady (p0, p1);
	}

	private native void n_onResourceReady (java.lang.Object p0, com.bumptech.glide.request.transition.Transition p1);


	public void onResourceCleared (android.graphics.drawable.Drawable p0)
	{
		n_onResourceCleared (p0);
	}

	private native void n_onResourceCleared (android.graphics.drawable.Drawable p0);

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
