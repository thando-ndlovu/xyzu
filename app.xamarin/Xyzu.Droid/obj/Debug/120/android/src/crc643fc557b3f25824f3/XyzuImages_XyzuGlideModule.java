package crc643fc557b3f25824f3;


public class XyzuImages_XyzuGlideModule
	extends com.bumptech.glide.module.AppGlideModule
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_applyOptions:(Landroid/content/Context;Lcom/bumptech/glide/GlideBuilder;)V:GetApplyOptions_Landroid_content_Context_Lcom_bumptech_glide_GlideBuilder_Handler\n" +
			"n_registerComponents:(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lcom/bumptech/glide/Registry;)V:GetRegisterComponents_Landroid_content_Context_Lcom_bumptech_glide_Glide_Lcom_bumptech_glide_Registry_Handler\n" +
			"";
		mono.android.Runtime.register ("Xyzu.XyzuImages+XyzuGlideModule, Xyzu.Droid", XyzuImages_XyzuGlideModule.class, __md_methods);
	}


	public XyzuImages_XyzuGlideModule ()
	{
		super ();
		if (getClass () == XyzuImages_XyzuGlideModule.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuImages+XyzuGlideModule, Xyzu.Droid", "", this, new java.lang.Object[] {  });
	}

	public XyzuImages_XyzuGlideModule (android.content.Context p0, com.bumptech.glide.GlideBuilder p1)
	{
		super ();
		if (getClass () == XyzuImages_XyzuGlideModule.class)
			mono.android.TypeManager.Activate ("Xyzu.XyzuImages+XyzuGlideModule, Xyzu.Droid", "Android.Content.Context, Mono.Android:Bumptech.Glide.GlideBuilder, Xamarin.Android.Glide", this, new java.lang.Object[] { p0, p1 });
	}


	public void applyOptions (android.content.Context p0, com.bumptech.glide.GlideBuilder p1)
	{
		n_applyOptions (p0, p1);
	}

	private native void n_applyOptions (android.content.Context p0, com.bumptech.glide.GlideBuilder p1);


	public void registerComponents (android.content.Context p0, com.bumptech.glide.Glide p1, com.bumptech.glide.Registry p2)
	{
		n_registerComponents (p0, p1, p2);
	}

	private native void n_registerComponents (android.content.Context p0, com.bumptech.glide.Glide p1, com.bumptech.glide.Registry p2);

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
