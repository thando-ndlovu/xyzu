package crc6406b9c2434cbd23e7;


public class XyzuPicassoViewTarget
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.squareup.picasso.Target
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBitmapFailed:(Ljava/lang/Exception;Landroid/graphics/drawable/Drawable;)V:GetOnBitmapFailed_Ljava_lang_Exception_Landroid_graphics_drawable_Drawable_Handler:Square.Picasso.ITargetInvoker, Square.Picasso\n" +
			"n_onBitmapLoaded:(Landroid/graphics/Bitmap;Lcom/squareup/picasso/Picasso$LoadedFrom;)V:GetOnBitmapLoaded_Landroid_graphics_Bitmap_Lcom_squareup_picasso_Picasso_LoadedFrom_Handler:Square.Picasso.ITargetInvoker, Square.Picasso\n" +
			"n_onPrepareLoad:(Landroid/graphics/drawable/Drawable;)V:GetOnPrepareLoad_Landroid_graphics_drawable_Drawable_Handler:Square.Picasso.ITargetInvoker, Square.Picasso\n" +
			"";
		mono.android.Runtime.register ("Square.Picasso.XyzuPicassoViewTarget, Xyzu.Droid", XyzuPicassoViewTarget.class, __md_methods);
	}


	public XyzuPicassoViewTarget ()
	{
		super ();
		if (getClass () == XyzuPicassoViewTarget.class)
			mono.android.TypeManager.Activate ("Square.Picasso.XyzuPicassoViewTarget, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onBitmapFailed (java.lang.Exception p0, android.graphics.drawable.Drawable p1)
	{
		n_onBitmapFailed (p0, p1);
	}

	private native void n_onBitmapFailed (java.lang.Exception p0, android.graphics.drawable.Drawable p1);


	public void onBitmapLoaded (android.graphics.Bitmap p0, com.squareup.picasso.Picasso.LoadedFrom p1)
	{
		n_onBitmapLoaded (p0, p1);
	}

	private native void n_onBitmapLoaded (android.graphics.Bitmap p0, com.squareup.picasso.Picasso.LoadedFrom p1);


	public void onPrepareLoad (android.graphics.drawable.Drawable p0)
	{
		n_onPrepareLoad (p0);
	}

	private native void n_onPrepareLoad (android.graphics.drawable.Drawable p0);

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
