package crc6406b9c2434cbd23e7;


public class IPicassoCache_Default
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.squareup.picasso.Cache
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_clear:()V:GetClearHandler:Square.Picasso.ICacheInvoker, Square.Picasso\n" +
			"n_clearKeyUri:(Ljava/lang/String;)V:GetClearKeyUri_Ljava_lang_String_Handler:Square.Picasso.ICacheInvoker, Square.Picasso\n" +
			"n_get:(Ljava/lang/String;)Landroid/graphics/Bitmap;:GetGet_Ljava_lang_String_Handler:Square.Picasso.ICacheInvoker, Square.Picasso\n" +
			"n_maxSize:()I:GetMaxSizeHandler:Square.Picasso.ICacheInvoker, Square.Picasso\n" +
			"n_set:(Ljava/lang/String;Landroid/graphics/Bitmap;)V:GetSet_Ljava_lang_String_Landroid_graphics_Bitmap_Handler:Square.Picasso.ICacheInvoker, Square.Picasso\n" +
			"n_size:()I:GetSizeHandler:Square.Picasso.ICacheInvoker, Square.Picasso\n" +
			"";
		mono.android.Runtime.register ("Square.Picasso.IPicassoCache+Default, Xyzu.Droid", IPicassoCache_Default.class, __md_methods);
	}


	public IPicassoCache_Default ()
	{
		super ();
		if (getClass () == IPicassoCache_Default.class)
			mono.android.TypeManager.Activate ("Square.Picasso.IPicassoCache+Default, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}


	public void clear ()
	{
		n_clear ();
	}

	private native void n_clear ();


	public void clearKeyUri (java.lang.String p0)
	{
		n_clearKeyUri (p0);
	}

	private native void n_clearKeyUri (java.lang.String p0);


	public android.graphics.Bitmap get (java.lang.String p0)
	{
		return n_get (p0);
	}

	private native android.graphics.Bitmap n_get (java.lang.String p0);


	public int maxSize ()
	{
		return n_maxSize ();
	}

	private native int n_maxSize ();


	public void set (java.lang.String p0, android.graphics.Bitmap p1)
	{
		n_set (p0, p1);
	}

	private native void n_set (java.lang.String p0, android.graphics.Bitmap p1);


	public int size ()
	{
		return n_size ();
	}

	private native int n_size ();

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
